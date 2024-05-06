import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;



public class Main {
    static int[] r={-1,0,0,1};
    static int[] c={0,-1,1,0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] mat = new int[n][n];
        boolean[][] visited = new boolean[n][n];
        int sx=0;
        int sy=0;
        Queue<Integer> q = new LinkedList<>();
        PriorityQueue<Integer> q2 = new PriorityQueue<>();
        for(int i=0; i<n; i++){
            String[] s = br.readLine().split(" ");
            for(int j=0; j<n; j++){
                mat[i][j]=Integer.parseInt(s[j]);
                if(mat[i][j]==9){
                    q.offer(i*100+j);
                    visited[i][j]=true;
                    sx=i;
                    sy=j;
                }
            }
        }
        int size=2;
        int eaten=0;
        int res=0;
        int k=0;
        while(!q.isEmpty()) {
            k++;
            while (!q.isEmpty()) {
                int el = q.poll();
                int x = el / 100;
                int y = el % 100;

                for (int i = 0; i < 4; i++) {
                    int a = x + r[i];
                    int b = y + c[i];
                    if (a >= 0 && b >= 0 && a < n && b < n && !visited[a][b]) {
                        visited[a][b]=true;
                        q2.offer(a*100+b);
                    }
                }
            }
            while(!q2.isEmpty()){
                int el = q2.poll();
                int x = el/100;
                int y = el%100;
                if(mat[x][y]>0 && mat[x][y] <size){

                    q2.clear();
                    q.clear();
                    q.offer(el);
                    res+=k;
                    k=0;
                    mat[x][y]=9;
                    mat[sx][sy]=0;
                    sx=x;
                    sy=y;
                    visited = new boolean[n][n];
                    visited[x][y]=true;
                    eaten++;
                    if (eaten == size) {
                        size++;
                        eaten = 0;
                    }
                }else if(mat[x][y] == 0 || mat[x][y]==size){
                    q.offer(el);
                }

            }

        }
        System.out.println(res);
    }
}