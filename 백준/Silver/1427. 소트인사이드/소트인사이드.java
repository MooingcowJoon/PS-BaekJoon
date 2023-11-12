import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n =Integer.parseInt(bf.readLine());
		int[] arr= new int[10];
		while (n>0) {
			arr[n%10]++;
			n/=10;
		}
		for (int i=9; i>=0; i--) {
			while(arr[i]>0) {
				bw.write(i+"");
				arr[i]--;
			}
		}
		bw.flush();
	}
	}
	
	
