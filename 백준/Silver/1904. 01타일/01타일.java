import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n=Integer.parseInt(bf.readLine());
		int[] arr=new int[n+3];
		arr[1]=1;
		arr[2]=2;
		for (int i=3; i<=n; i++) {
			arr[i]=(arr[i-2]+arr[i-1])%15746;
		}
	
		System.out.println(arr[n]);
		
		
		bw.flush();
		
	}
}
