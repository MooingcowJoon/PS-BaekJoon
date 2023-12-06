import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Point{
    int e, dist;

    Point( int j,int k){
        this.e=j;
        this.dist=k;
    }
}
public class Main {
    static int INF;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc  = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < tc; i++){
            String[] str  = br.readLine().split(" ");
            int n=Integer.parseInt(str[0]);
            int m=Integer.parseInt(str[1]);
            int w = Integer.parseInt(str[2]);
            ArrayList<ArrayList<Point>> edge= new ArrayList<>();
            for (int j=0; j<=n; j++){
                edge.add(new ArrayList<Point>());
            }
            for ( int j = 0; j<m; j++){
                str= br.readLine().split(" ");
                int s = Integer.parseInt(str[0]);
                int e = Integer.parseInt(str[1]);
                int t = Integer.parseInt(str[2]);
                edge.get(s).add(new Point(e,t));
                edge.get(e).add(new Point(s,t));
            }
            for ( int k=0; k<w; k++){
                str= br.readLine().split(" ");
                int s = Integer.parseInt(str[0]);
                int e = Integer.parseInt(str[1]);
                int t = Integer.parseInt(str[2]);
                edge.get(s).add(new Point(e,-t));
            }
            int[] d= new int[n+1];
            boolean flag= false;
            INF=n*1000;
            Arrays.fill(d,INF);
            d[1]=0;
            for (int k=1; k<=n; k++){
                for( int j=1; j<=n; j++){
                    ArrayList<Point> list = edge.get(j);
                    for (Point p : list){
                        int next = p.e;
                        if(p.dist+d[j]<d[next]){
                            d[next]=p.dist+d[j];
                            if(k==n){
                                flag=true;
                            }
                        }
                    }
                }

            }

            if(flag)sb.append("YES");
            else sb.append("NO");
            sb.append("\n");
        }
        System.out.print(sb.toString());
    }
}







