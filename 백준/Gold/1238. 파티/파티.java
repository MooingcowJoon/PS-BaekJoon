import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Point{
    int vertex, dist;

    Point(int i, int j){
        this.dist=i;
        this.vertex=j;
    }
}
public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s  = br.readLine().split(" ");
        int n=Integer.parseInt(s[0]);
        int m=Integer.parseInt(s[1]);
        int x = Integer.parseInt(s[2]);
        ArrayList<ArrayList<Point>> to= new ArrayList<>();
        ArrayList<ArrayList<Point>> from= new ArrayList<>();
        for(int i=0; i<=n; i++){
            to.add(new ArrayList<Point>());
            from.add(new ArrayList<Point>());
        }
        for (int i=0; i<m; i++){
            String[] input = br.readLine().split(" ");
            int u= Integer.parseInt(input[0]);
            int v= Integer.parseInt(input[1]);
            int d= Integer.parseInt(input[2]);
            to.get(u).add(new Point(d,v));
            from.get(v).add(new Point(d,u));
        }
        boolean[] visited = new boolean[n+1];
        int[] d= new int[n+1];
        Arrays.fill(d,Integer.MAX_VALUE);
        d[x]=0;
        PriorityQueue<Point> queue = new PriorityQueue<>((o1, o2) -> o1.dist-o2.dist);
        queue.offer(new Point(0,x));
        while(!queue.isEmpty()){
            Point tmp = queue.poll();
            int curD = tmp.dist;
            int curV = tmp.vertex;
            if(curD>d[curV]) continue;
            for(Point p : to.get(curV)){
                if(d[curV]+p.dist<d[p.vertex]){
                    d[p.vertex]=d[curV]+p.dist;
                    queue.offer(new Point(d[p.vertex],p.vertex));
                }
            }
        }
        int[] dd= new int[n+1];
        Arrays.fill(dd,Integer.MAX_VALUE);
        queue.offer(new Point(0,x));
        dd[x]=0;
        while(!queue.isEmpty()){
            Point tmp = queue.poll();
            int curD = tmp.dist;
            int curV = tmp.vertex;
            if(curD>dd[curV]) continue;
            for(Point p : from.get(curV)){
                if(dd[curV]+p.dist<dd[p.vertex]){
                    dd[p.vertex]=dd[curV]+p.dist;
                    queue.offer(new Point(dd[p.vertex],p.vertex));
                }
            }
        }
        int ans = 0;
        for (int i=1; i<=n; i++){
            ans=Math.max(ans,d[i]+dd[i]);
        }
        System.out.println(ans);
    }
}







