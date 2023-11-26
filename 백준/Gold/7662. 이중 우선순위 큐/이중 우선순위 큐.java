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
        for(int i=0; i<t; i++){
            TreeMap<Integer,Integer> map = new TreeMap<>();
            int k=Integer.parseInt(br.readLine());
            for (int j=0; j<k; j++){
                    String[] s = br.readLine().split(" ");
                    char c = s[0].charAt(0);
                    if(c=='I'){
                        int x = Integer.parseInt(s[1]);
                        if(!map.containsKey(x)){
                            map.put(x,1);
                        }else{
                            map.put(x,map.get(x)+1);
                        }
                    }else{
                        int x = Integer.parseInt(s[1]);
                        if(map.isEmpty()){
                            continue;
                        }
                        int key= map.firstKey();
                        if(x==1){
                            key=map.lastKey();
                        }
                        int val= map.get(key);
                        if(val==1){
                            map.remove(key);
                        }else{
                            map.put(key,val-1);
                        }
                    }
            }
            if(map.isEmpty()){
                sb.append("EMPTY\n");
            }else{
                sb.append(map.lastKey()).append(" ").append(map.firstKey()).append("\n");
            }

        }
        System.out.println(sb.toString());
    }
}







