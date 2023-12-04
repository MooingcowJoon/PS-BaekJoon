import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(bf.readLine());
		Map<Integer, Integer> map= new HashMap<>();
		Set<Integer> set= new TreeSet<>();
		int[] arr= new int[n];
		StringTokenizer st= new StringTokenizer(bf.readLine());
		int index=0;
		for (int i = 0; i < n; i++) {
			int a=Integer.parseInt(st.nextToken());
			arr[i]=a;
		set.add(a);
		}
		int size=set.size();
		for (int a : set) {
			map.put(a, index);
			index++;
		}
		for ( int i : arr) {
			bw.write(map.get(i)+" ");
		}
		bw.flush();
	}
}
