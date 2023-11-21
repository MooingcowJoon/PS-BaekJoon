import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		// BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		String[] arr = new String[n];
		for (int i = 0; i < n; i++) {
			arr[i] = bf.readLine();
		}
		int answer = 32;
		int count;
		int x, y, t;
		for (int column = 0; column <= n - 8; column++) {
			for (int row = 0; row <= m - 8; row++) {
				count = 0;
				x = arr[column].charAt(row);
				y = 'B' + 'W' - x;
				for (int i = column; i < column + 8; i++) {
					if ((i + column) % 2 == 0) {
						t = x;
					} else t = y;
					String s = arr[i];
					for (int j = row; j < row + 8;) {
						if (s.charAt(j) != t) {
							count++;
						}
						if (s.charAt(j + 1) == t) {
							count++;
						}
						j += 2;

					}
				}

				answer = count <= answer ? count : answer;
				count = 0;
				y = arr[column].charAt(row);
				x = 'B' + 'W' - x;
				for (int i = column; i < column + 8; i++) {
					if ((i + column) % 2 == 0) {
						t = x;
					} else t = y;
					String s = arr[i];
					for (int j = row; j < row + 8;) {
						if (s.charAt(j) != t) {
							count++;
						}
						if (s.charAt(j + 1) == t) {
							count++;
						}
						j += 2;

					}
				}

				answer = count <= answer ? count : answer;
			}
		}

		System.out.println(answer);
	}

}
