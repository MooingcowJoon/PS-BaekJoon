import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Comparator;
import java.util.StringTokenizer;
import java.util.TreeSet;

class AQ  {
	int size;
	int[] arr;
	int front;
	int rear;

	AQ() {
		this.size = 0;
		this.arr = new int[100001];
		this.front = 0;
		this.rear = 0;
	}
	AQ(int len){
		this.size=0;
		this.front=0;
		this.rear=0;
		this.arr= new int[len];
	}

		int pop() {
			if (size == 0) {
				return -1;
			}
			int a = arr[front + 1];
			front++;
			size--;
			return a;
		}
		
		int front(){
			if (size == 0) {
				return -1;
			}
			return arr[front+1];
		}
		
		int rear() {
			if (size == 0) {
				return -1;
			}
			return arr[rear];
		}
		
		boolean isEmpty() {
			if (size==0) {
				return true;
			}
			return false;
		}

void push(int a) {
	rear = (rear + 1) % arr.length;
	arr[rear] = a;
	size++;
}
}
public class Main {
	static int order=1;
	void visit(int v, TreeSet<Integer>[] set, boolean[] visited, int[] visitOrder,AQ q) {
		visited[v]=true;
		visitOrder[v]=order++;
		q.push(v);
		while(!q.isEmpty()) {
			int a=q.pop();
				for (int x : set[a]) {
					if(!visited[x]) {
						visited[x]=true;
						visitOrder[x]=order++;
						q.push(x);
				}
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
		Comparator<Integer> comp = new Comparator<Integer>() {
			public int compare(Integer o1, Integer o2) {
				return o1 - o2;
			}
		};
		AQ q= new AQ();
		
		for (int i=1; i<=n; i++) {
			set[i]=new TreeSet<Integer>(comp.reversed());
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
		ins.visit( r, set, visited, visitOrder,q);
		for (int i=1; i<=n; i++) {
			bw.write(visitOrder[i]+"\n");
		}
		bw.flush();
		
	}
}
