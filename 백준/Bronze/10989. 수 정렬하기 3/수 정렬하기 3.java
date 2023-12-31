import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(bf.readLine());
		int[] arr = new int[10001];
		for (int i=0; i<n; i++) {
			arr[Integer.parseInt(bf.readLine())]++;
		}
		
		for (int i=1; i<=10000; i++) {
			while(arr[i]>0) {
				bw.write(i+"\n");
				arr[i]--;
			}
		}
		bw.flush();
	}
	}
	
	
