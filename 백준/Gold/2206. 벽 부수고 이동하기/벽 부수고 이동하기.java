import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);
        int max= n*m+1;
        int[][][] mat = new int[n][m][3];
        for (int i=0; i<n; i++){
            String x = br.readLine();
            for (int j=0; j<m; j++){
                mat[i][j][0]=x.charAt(j)-48;
                mat[i][j][1]=max;
                mat[i][j][2]=max;
            }
        }
        int res=-1;
        Queue<Integer> q = new LinkedList<>();
        mat[n-1][m-1][1]=1;
        mat[n-1][m-1][2]=1;
        q.add(1);
        q.add(n-1);
        q.add(m-1);
        int cnt =0;
        while(!q.isEmpty()){
            int k = q.poll();
            int i = q.poll();
            int j = q.poll();
            int x = mat[i][j][k+1];
            int a;
            if(i-1>=0){
                a=k-mat[i-1][j][0];
                if(a>=0 && mat[i-1][j][a+1]>x+1){
                    mat[i-1][j][a+1]=x+1;
                    q.add(a);
                    q.add(i-1);
                    q.add(j);
                }
            } if(j-1>=0){
                a=k-mat[i][j-1][0];
                if(a>=0 && mat[i][j-1][a+1]>x+1){
                    mat[i][j-1][a+1]=x+1;
                    q.add(a);
                    q.add(i);
                    q.add(j-1);
                }
            } if(i+1<n){
                a=k-mat[i+1][j][0];
                if(a>=0 && mat[i+1][j][a+1]>x+1){
                    mat[i+1][j][a+1]=x+1;
                    q.add(a);
                    q.add(i+1);
                    q.add(j);
                }
            } if(j+1<m){
                a=k-mat[i][j+1][0];
                if(a>=0 && mat[i][j+1][a+1]>x+1){
                    mat[i][j+1][a+1]=x+1;
                    q.add(a);
                    q.add(i);
                    q.add(j+1);
                }
            }
        }
        res = Math.min(mat[0][0][1],mat[0][0][2]);
        System.out.println(res == max ? -1 : res);
    }
}