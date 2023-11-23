import com.sun.source.tree.Tree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {
    static void dfs(boolean[] visited, Set<Integer>[] edges,StringBuilder sb, int v ){

        for(int x: edges[v]){
            if(!visited[x]){
                visited[x]=true;
                sb.append(" ").append(x);
                dfs(visited,edges,sb,x);
            }
        }
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);
        int t = Integer.parseInt(input[2]);


        StringBuilder sb = new StringBuilder();
        Set<Integer>[] edges = new Set[n+1];
        for(int i=1; i<=n; i++){
            edges[i]=new TreeSet<>();
        }
        for (int i = 0; i<m; i++){
            String[] s = br.readLine().split(" ");
            int v=Integer.parseInt(s[0]);
            int u=Integer.parseInt(s[1]);
            edges[v].add(u);
            edges[u].add(v);
        }
        boolean[] visited = new boolean[n+1];
        visited[t]=true;
        Queue<Integer> q = new LinkedList<>();
        sb.append(t);
        dfs(visited,edges,sb,t);
        sb.append("\n").append(t);
        q.offer(t);
        visited = new boolean[n+1];
        visited[t] =true;
        while(!q.isEmpty()){
            int v=q.poll();
            for (int u : edges[v]){
                if(!visited[u]){
                    sb.append(" ").append(u);
                    q.offer(u);
                    visited[u]=true;
                }
            }
        }

        System.out.println(sb.toString());

    }
}







