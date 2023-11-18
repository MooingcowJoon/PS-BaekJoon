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
		int[] arr= new int[n];
		int front=0;
		int size=n;
		for (int i = 0; i < n; i++) {
			arr[i]=i+1;
		}
		for (int i = 0; i < n-1; i++) {
			front++;
			size--;
			arr[(front+size)%n]=arr[front%n];
			front++;
		}
		System.out.println(arr[front%n]);

	}
}
