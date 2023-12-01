import com.sun.source.tree.Tree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collector;


public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        StringBuilder sb= new StringBuilder();
        int[][] arr = new int[10000][4];
        arr[0][0]=0;
        arr[0][1]=9999;
        arr[9999][0]=9998;
        arr[9999][1]=9998;
        arr[9999][2]=9999;
        arr[9999][3]=9999;
        for(int i=1; i<9999; i++){
            arr[i][0]=(i*2)%10000;
            arr[i][1]=i-1;
            int d1= i/1000;
            int d2=(i/100)%10;
            int d3=(i/10)%10;
            int d4=i%10;
            arr[i][2]=d2*1000+d3*100+d4*10+d1;
            arr[i][3]=d4*1000+d1*100+d2*10+d3;
        }

        for(int i=0; i<t; i++){
            String[] s= br.readLine().split(" ");
            int a = Integer.parseInt(s[0]);
            int b= Integer.parseInt(s[1]);
            Queue<Integer> q = new LinkedList<>();
            q.offer(a);
            boolean[] visited = new boolean[10000];
            visited[a]=true;
            HashMap<Integer, String> map = new HashMap<>();
            map.put(a,"");
            while(!q.isEmpty()){
                int x = q.poll();
                for (int j=0; j<=3; j++){
                    int k = arr[x][j];
                    if (!visited[k] ){
                        char c='\0';
                        if(j==0){
                            c='D';
                        }else if (j==1){
                            c='S';
                        }else if (j==2){
                            c='L';
                        }else if(j==3){
                            c='R';
                        }
                            map.put(k,map.get(x)+c);
                            q.offer(k);
                            visited[k]=true;
                            if(k==b){
                                break;
                            }
                    }
                }
            }

            sb.append(map.get(b)).append('\n');
        }
        System.out.print(sb.toString());

    }
}







