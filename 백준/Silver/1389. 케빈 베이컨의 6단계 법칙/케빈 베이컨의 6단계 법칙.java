import com.sun.source.tree.Tree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);
        StringBuilder sb = new StringBuilder();
        HashSet<Integer>[] node = new HashSet[n+1];
        for(int i=1; i<=n; i++){
            node[i]=new HashSet<>();
        }

        int[][] kb = new int[n+1][n+1];

        for (int i = 0; i<m; i++){
            String[] s = br.readLine().split(" ");
            int v=Integer.parseInt(s[0]);
            int u=Integer.parseInt(s[1]);
            node[v].add(u);
            node[u].add(v);
        }
        Queue<Integer> q = new LinkedList<>();
        HashSet<Integer> set;
        int[] arr;
        for( int i=1; i<=n; i++){
            q.offer(i);
            arr=kb[i];
            Arrays.fill(arr,n);
            arr[i]=0;
            while(!q.isEmpty()){
                int k = q.poll();
                set=node[k];
                for(int x : set){
                    if(arr[x]==n){
                        arr[x]=arr[k]+1;
                        q.offer(x);
                    }else if(arr[x]>arr[k]+1){
                        arr[x]=arr[k]+1;
                        q.offer(x);
                    }
                }
            }
        }
        int min = n*n;
        int ans = 0;
            for(int i=1; i<=n; i++){
                int sum =  Arrays.stream(kb[i]).sum();
                if(sum<min){
                    min=sum;
                    ans=i;
                }
            }
        System.out.println(ans);
    }
}







