import com.sun.source.tree.Tree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collector;


public class Main {
    static void helper(int[][][] arr){

        int m= arr[0].length;
        int n= arr.length;

        int max = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                int[] x = arr[i][j];
                if(j>0 && i>0){
                    int[] up = arr[i-1][j];
                    int[] left = arr[i][j-1];
//                    if(i==n-1 && j==m-1){
//                        System.out.println(left[2]);
//                        System.out.println(up[2]);
//                    }
                    x[1]=Math.max(left[0],up[0]);

                    int two = left[0]+up[0];
                    two=Math.max(left[0]+left[1],two);
                    two=Math.max(up[0]+up[1],two);
                    x[2]=two;

                    int three= left[0]+left[1]+up[0];
                    three=Math.max(left[0]+up[0]+up[1],three);
                    three=Math.max(up[0]+up[2],three);
                    three=Math.max(left[0]+left[2],three);
                    x[3]=three;
                    x[4]=three+x[0];
                    int tmp = x[0]+Math.max(up[0],left[1]);
                    if(left[2]<tmp){
                        left[2]=tmp;
                    }
                    if(left[1]<x[0]){
                        left[1]=x[0];
                    }

                }else if(j>0){
                    int[] left = arr[i][j-1];
                    x[1]=left[0];
                    x[2]=left[0]+left[1];
                    x[3]=left[0]+left[2];
                    x[4]=x[3]+x[0];
                    int tmp=x[0]+left[1];
                    if(left[2]<tmp){
                        left[2]=tmp;
                    }
                    if(left[1]<x[0]){
                        left[1]=x[0];
                    }
                }else if(i>0){
                    int[] up = arr[i-1][j];
                    x[1]=up[0];
                    x[2]=up[0]+up[1];
                    x[3]=up[0]+up[2];
                    x[4]=x[3]+x[0];
                }
                if(j>1){
                    arr[i][j-2][2]=Math.max(arr[i][j-2][2],arr[i][j][0]+arr[i][j-1][0]);
                }
                max=Math.max(max,x[4]);
            }
        }
//        for(int i=0; i<n; i++){
//            for(int j=0; j<m; j++){
//                System.out.print(arr[i][j][2]+" ");
//            }
//            System.out.println();
//        }
        System.out.println(max);
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String[] t = br.readLine().split(" ");
            int n = Integer.parseInt(t[0]);
            int m = Integer.parseInt(t[1]);
            int[][][] arr = new int[n][m][5];

            for(int i=0; i<n; i++){
                String[] s= br.readLine().split(" ");
                for(int j=0; j<m; j++){
                    arr[i][j][0]=Integer.parseInt(s[j]);
                }
            }
            helper(arr);

    }
}







