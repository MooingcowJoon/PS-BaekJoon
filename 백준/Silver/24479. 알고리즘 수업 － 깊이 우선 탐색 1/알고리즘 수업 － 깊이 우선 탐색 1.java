import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.TreeSet;
public class Main {
	static int order=1;
	void visit(int v, TreeSet<Integer>[] set, boolean[] visited, int[] visitOrder) {
		visited[v] = true;
		visitOrder[v]=order;
		order++;
				for (int x : set[v]) {
					if(!visited[x]) {
						visit(x, set, visited, visitOrder);	
				}
			}
		}
	
	public static void main(String[] args) throws IOException {
		BufferedReader bf= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st= new StringTokenizer(bf.readLine());
		int n=Integer.parseInt(st.nextToken());
		int m=Integer.parseInt(st.nextToken());
		int r=Integer.parseInt(st.nextToken());
		TreeSet<Integer>[] set= new TreeSet[n+1];
		for (int i=1; i<=n; i++) {
			set[i]=new TreeSet<Integer>();
		}
		int[] visitOrder= new int[n+1];
		boolean[] visited=new boolean[n+1];
		for (int i=0; i<m; i++) {
			st= new StringTokenizer(bf.readLine());
			int u=Integer.parseInt(st.nextToken());
			int v=Integer.parseInt(st.nextToken());
			set[u].add(v);
			set[v].add(u);
		}
		Main ins= new Main();
		ins.visit( r, set, visited, visitOrder);
		for (int i=1; i<=n; i++) {
			bw.write(visitOrder[i]+"\n");
		}
		bw.flush();
		
	}
}