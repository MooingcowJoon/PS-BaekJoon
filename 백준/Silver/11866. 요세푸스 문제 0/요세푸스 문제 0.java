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
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int[] arr= new int[n];
		for (int i = 0; i < n; i++) {
			arr[i]=i+1;
		}
		int front=k-1;
		int[] arr2= new int[n];
		arr2[0]=k;
		arr[front]=0;
		
		for (int i = 1; i < n; i++) {
			for (int j=k; j>0;) {
				front++;
				if(arr[front%n]>0) {
					j--;
				}
			}
			arr2[i]=arr[front%n];
			arr[front%n]=0;
		}
		StringBuilder sb = new StringBuilder();
		sb.append("<");
		for (int i=0; i<n-1; i++) {
			sb.append(arr2[i]+", ");
		}
		sb.append(arr2[n-1]+">");
		System.out.println(sb.toString());
		
	}
}
