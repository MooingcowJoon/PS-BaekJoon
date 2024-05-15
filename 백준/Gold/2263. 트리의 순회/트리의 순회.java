import org.w3c.dom.Node;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;


public class Main {
    static int[] in;
    static int[] post;
    static ArrayList<Integer> res;
    static Map<Integer,Integer> map;
    static void dac(int s, int e,int k){
        int root = post[e-k];
        res.add(root);
        int rootIdx = map.get(root);
        if(s<rootIdx ){
                dac(s,rootIdx-1,k);
        }
        if(rootIdx<e ){
                dac(rootIdx+1,e,k+1);
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        map= new HashMap<>();
        res = new ArrayList<>();
        in = Arrays.stream(br.readLine().split(" "))
                             .mapToInt(Integer::parseInt).toArray();
        post = Arrays.stream(br.readLine().split(" "))
                             .mapToInt(Integer::parseInt).toArray();
        for(int i=0; i<n; i++){
            map.put(in[i],i);
        }
        dac(0,n-1,0);
        System.out.println(res.stream().map(Object::toString).collect(Collectors.joining(" ")));
    }
}