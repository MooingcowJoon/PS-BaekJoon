import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
public static void main(String[] args) throws IOException{
	BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	StringTokenizer st = new StringTokenizer(bf.readLine());
	int n = Integer.parseInt(st.nextToken());
	int m = Integer.parseInt(st.nextToken());
	HashSet<Integer> set = new HashSet<>(n);
	HashSet<Integer> tmp = new HashSet<>(n);
	st = new StringTokenizer(bf.readLine());
	for (int i=0; i<n; i++) {
	int a=Integer.parseInt(st.nextToken());
	set.add(a);
	tmp.add(a);
	}
	int count=0;
	st = new StringTokenizer(bf.readLine());
	for (int i=0; i<m; i++) {
	int a=Integer.parseInt(st.nextToken());
	if (set.contains(a)) {
		count++;
	}
	tmp.remove(a);
	}
	bw.write(m-count+tmp.size()+"\n");
	bw.flush();
}
}
