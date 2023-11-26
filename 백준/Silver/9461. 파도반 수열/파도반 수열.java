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
		long[] arr=new long[103];
		arr[1]=1;
		arr[2]=1;
		arr[3]=1;
		arr[4]=2;
		arr[5]=2;
		for (int i=6; i<=100; i++) {
			arr[i]=arr[i-1]+arr[i-5];
		}
		for(int i=0; i<n; i++) {
			int k=Integer.parseInt(bf.readLine());
			System.out.println(+arr[k]);
		}
		bw.flush();
		
	}
}
