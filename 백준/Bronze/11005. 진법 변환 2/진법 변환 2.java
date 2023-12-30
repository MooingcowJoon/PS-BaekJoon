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
		StringTokenizer st= new StringTokenizer(bf.readLine());
		int n=Integer.parseInt(st.nextToken());
		int e=Integer.parseInt(st.nextToken());
		int ee=1;
		int a;
		String answer="";
		while(n>0) {
			ee*=e;
			a=n%e;
			n/=e;
		if (a<10) {
			a+=48;
		}else {
			a+=55;
		}
		answer=(char)a+answer;
		
		}
		
		System.out.println(answer);
		
		
	}
}
