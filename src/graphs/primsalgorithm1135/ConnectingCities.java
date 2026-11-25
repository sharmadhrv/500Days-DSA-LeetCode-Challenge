package graphs.primsalgorithm1135;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class ConnectingCities {

    private class Pair {
        int node;
        int weight;
        int parent;

        Pair(int node, int parent, int weight) {
            this.node = node;
            this.weight = weight;
            this.parent = parent;
        }
    }

    public int minimumCost(int n, int[][] connections) {

        List<List<Pair>> adj = new ArrayList<>();
        for (int i = 0; i <= n; i++)
            adj.add(new ArrayList<>());

        for (int i = 0; i < connections.length; i++) {
            adj.get(connections[i][0]).add(new Pair(connections[i][1], connections[i][0], connections[i][2]));
            adj.get(connections[i][1]).add(new Pair(connections[i][0], connections[i][1], connections[i][2]));
        }

        PriorityQueue<Pair> queue = new PriorityQueue<>((a, b) -> a.weight - b.weight);
        queue.offer(new Pair(1, -1, 0));

        boolean[] visited = new boolean[n + 1];
        int sum = 0;
        List<int[]> edgeList = new ArrayList<>();

        while (!queue.isEmpty()) {
            Pair p = queue.poll();

            if (visited[p.node]) continue;

            visited[p.node] = true;
            sum += p.weight;

            if (p.parent != -1)
                edgeList.add(new int[]{p.node, p.parent});

            for (Pair neighbour : adj.get(p.node)) {
                if (!visited[neighbour.node]) {
                    queue.offer(new Pair(neighbour.node, p.node, neighbour.weight));
                }
            }
        }
        for (int i = 1; i <= n; i++) {
            if (!visited[i]) return -1;
        }
        return sum;
    }

    // Kruskal's Algorithm

    private static  class DisjointSet {
        List<Integer> rank = new ArrayList<>();
        List<Integer> parent = new ArrayList<>();

        DisjointSet(int n) {
            for (int i = 0; i <= n; i++) {
                parent.add(i);
                rank.add(0);
            }
        }


        public int ultimateParent(int node) {
            if (node == parent.get(node)) return node;

            int ulp = ultimateParent(parent.get(node));
            parent.set(node, ulp);
            return ulp;
        }

        public void unionByrank(int u, int v) {

            int ulpU = ultimateParent(u);
            int ulpV = ultimateParent(v);

            if (ulpU == ulpV) return;

            if (rank.get(ulpU) > rank.get(ulpV))
                parent.set(ulpV, ulpU);

            else if (rank.get(ulpV) > rank.get(ulpU))
                parent.set(ulpU, ulpV);

            else {
                parent.set(ulpV, ulpU);
                int rankU = rank.get(ulpU);
                rank.set(ulpU, rankU+1);
            }
        }
    }

        public int minimumCostByKruskal(int n, int[][] connections) {

            Arrays.sort(connections,(a,b)->a[2]-b[2]);

            DisjointSet ds = new DisjointSet(n);

            int sum = 0;
            int count = 0;

            for(int[] conn : connections)
            {
                int u = conn[0];
                int v = conn[1];
                int wt = conn[2];

                int ulpU = ds.ultimateParent(u);
                int ulpV = ds.ultimateParent(v);

                if(ulpU!=ulpV)
                {
                    sum +=wt;
                    ds.unionByrank(u,v);
                    count++;
                }

                if(count ==n-1) break;
            }

            if(count!= n-1) return -1;

            return sum;
        }
    }

