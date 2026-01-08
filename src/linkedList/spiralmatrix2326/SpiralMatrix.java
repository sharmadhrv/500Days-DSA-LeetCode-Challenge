package linkedList.spiralmatrix2326;

public class SpiralMatrix {

    public int[][] spiralMatrix(int m, int n, ListNode head) {

        int[][] a = new int[m][n];
        int top = 0, bottom = m-1;
        int left = 0, right = n-1;
        for(int i =0;i<m;i++)
        {
            for(int j =0;j<n;j++)
                a[i][j] = -1;
        }

        ListNode cur = head;

        while(cur!=null && top<=bottom && left <=right)
        {
            for(int col = left ; col<=right && cur !=null ;col++) {
                a[top][col] = cur.val;
                cur = cur.next;
            }
            top++;

            for(int row = top;row<=bottom && cur!=null;row++)
            {
                a[row][right] = cur.val;
                cur = cur.next;
            }
            right--;

            for(int col = right;col>=left && cur!=null ;col--)
            {
                a[bottom][col] = cur.val;
                cur = cur.next;
            }
            bottom--;

            for(int row = bottom;row>=top && cur !=null ;row--)
            {
                a[row][left] = cur.val;
                cur = cur.next;
            }
            left++;

        }
        return a;
    }
}
