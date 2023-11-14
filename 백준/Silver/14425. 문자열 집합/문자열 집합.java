import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
	BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	StringTokenizer st = new StringTokenizer(bf.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int answer=0;
		HashSet set = new HashSet<>();
		
		for (int i=0; i<n; i++) {
			set.add(bf.readLine());
		}
		
		for (int i=0; i<m; i++) {
			if(set.contains(bf.readLine())) {
				answer++;
			}
		}
		
		System.out.println(answer);
		
		}
		
		
		
	}


