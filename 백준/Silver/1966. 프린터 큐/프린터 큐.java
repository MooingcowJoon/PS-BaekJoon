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
		StringBuilder sb =new StringBuilder();
		int k, x, f, order, tmp, count;
		StringTokenizer st;
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(bf.readLine());
			k = Integer.parseInt(st.nextToken());
			x = Integer.parseInt(st.nextToken());
			st = new StringTokenizer(bf.readLine());
			f = 0;
			order = 1;
			int[] arr = new int[k];
			int[] arr2 = new int[10];
			for (int j = 0; j < k; j++) {
				tmp = Integer.parseInt(st.nextToken());
				arr[j] = tmp;
				arr2[tmp]++;
			}
			for (int j = 9; j > 0; j--) {
				while (arr2[j] > 0) {
					if (j == arr[f % k]) {
						if (f % k == x) {
							j = 0;
							bw.write(order+"\n");
						} else {
							arr[f % k] = 0;
							arr2[j]--;
							f++;
							order++;
						}
					}else {
						f++;
					}
				}
			}
		}
		bw.flush();
	}
}
