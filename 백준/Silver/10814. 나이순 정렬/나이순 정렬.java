import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(bf.readLine());
		String[] A = new String[201];
		for (String s : A) {
			s ="";
		}
		StringTokenizer st;
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(bf.readLine());
			A[Integer.parseInt(st.nextToken())] += " "+st.nextToken();
		}
		for (int i = 1; i < 201; i++) {
			if (A[i] != null) {
				String[] tmp=A[i].split(" ");
				int len= tmp.length;
				for (int j=1; j<len; j++) {
					bw.write(i+" "+tmp[j]+"\n");
				}
			}
		}
		bw.flush();
	}
}
