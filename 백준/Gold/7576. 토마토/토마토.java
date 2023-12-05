import com.sun.source.tree.Tree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collector;


public class Main {

    static void helper(int[][] arr,HashSet<Integer> set,int x ){
        if(set.isEmpty()){
            return;
        }
        HashSet<Integer> set2= new HashSet<>();
        for(int n : set) {
            int i=n/1000;
            int j =n%1000;
            for(int a =-1; a<=1; ){
                int b= i+a;
                int c= j+a;
                if((b>=0 && b<arr.length) && arr[b][j]==0){
                    set2.add(b*1000+j);
                    arr[b][j]=x+1;
                }
                if((c>=0 && c<arr[0].length)&&arr[i][c]==0){
                    set2.add(i*1000+c);
                    arr[i][c]=x+1;
                }
                a+=2;
            }
        }
        helper(arr,set2,x+1);
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s  = br.readLine().split(" ");
        int m=Integer.parseInt(s[0]);
        int n=Integer.parseInt(s[1]);
        int[][] arr = new int[n][m];
        for (int i=0; i<n; i++){
            String[] w = br.readLine().split(" ");
            for(int j=0; j<m; j++){
                    arr[i][j]=Integer.parseInt(w[j]);
            }
        }

        HashSet<Integer> set = new HashSet<Integer>();
        for (int i=0; i<n; i++){
            for( int j=0; j<m; j++){
                if(arr[i][j]==1){
                    set.add(i*1000+j);
                }
            }
        }
        helper(arr,set,1);
        int max = 0;
        for (int i=0; i<n; i++){
            for( int j=0; j<m; j++){
                int x = arr[i][j];
                if(x==0){
                    System.out.println(-1);
                    return;
                }
                max= Math.max(max,x-1);
            }
        }
        System.out.println(max);
    }
}







