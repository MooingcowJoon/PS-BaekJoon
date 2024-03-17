import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    /*
            11111
            10001
            10001
            10001
            11111

        if checked? self.value
        not checked? self.value=check(adjacent) then return self.value

     */

    static void digging(int[][] mat, int i, int j){
        mat[i][j]=-1;
        if(i >0 && mat[i-1][j] == 0){
            digging(mat,i-1,j);
        }
        if(i<mat.length-1 && mat[i+1][j] ==0 ){
            digging(mat,i+1,j);
        }
        if(j>0 && mat[i][j-1] == 0) {
            digging(mat,i,j-1);
        }
        if(j<mat[0].length-1 && mat[i][j+1] == 0){
            digging(mat,i,j+1);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int n = Integer.parseInt(s.split(" ")[0]);
        int m = Integer.parseInt(s.split(" ")[1]);

        int[][] mat = new int[n][m];

        Set<Integer> one = new HashSet<>();
        Stack<Integer> zero = new Stack<>();

        for(int i=0; i<n; i++){
            s=br.readLine();
            String[] arr = s.split(" ");

            for(int j=0; j<m; j++){
                int x = Integer.parseInt(arr[j]);
                mat[i][j]=x;
                if( x == 1){
                    one.add(i*1000+j);
                }
                if(x == 0 &&  (i==0 || i== n-1 || j==0 || j==m-1) ){
                    zero.push(j);
                    zero.push(i);
                }
            }
        }
        int res = 0;
        boolean flag = !one.isEmpty();
        while(flag){
            while(!zero.isEmpty()){
                int i = zero.pop();
                int j = zero.pop();
                one.remove(i*1000+j);
                digging(mat,i,j);
            }
            for(int x : one){
                int count =0;
                int i = x/1000;
                int j = x%1000;
                if(i == 0 || mat[i-1][j] == -1){
                    count--;
                }
                if(i == n-1 || mat[i+1][j] == -1){
                    count--;
                }
                if(j == 0 || mat[i][j-1] == -1 ){
                    count--;
                }
                if(j==m-1 || mat[i][j+1] == -1){
                    count--;
                }
                if (count <-1){
                    zero.push(j);
                    zero.push(i);
                }
            }
/*            for(int a = 0; a<n; a++){
                for (int b=0; b<m; b++){
                    if(tmp.contains(a*1000+b)){
                        System.out.print("* ");
                    }else System.out.print(mat[a][b]+1+" ");
                }
                System.out.println();
            }
            System.out.println("========="+res+"=============");*/

            if(one.isEmpty()){
                break;
            }

            res++;

        }
        System.out.println(res);


    }
}