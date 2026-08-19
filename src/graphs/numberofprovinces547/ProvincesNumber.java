package graphs.numberofprovinces547;

public class ProvincesNumber {

    public int findCircleNum(int[][] isConnected) {

        int count = isConnected.length;
        boolean[] visited = new boolean[count+1];
        int answer = 0;
        for(int i =0;i<count;i++) {
            if (!visited[i]) {
                dfs(isConnected, visited, i);
                answer++;
            }
        }
        return answer;
    }

    private void dfs(int[][] isConnected, boolean[] visited, int node)
    {
            visited[node] = true;
        for (int i = 0; i < isConnected.length; i++) {
                if (isConnected[node][i]==1 && !visited[i]) {
                    dfs(isConnected, visited, i);
                }
            }
    }
}
