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
		int n=Integer.parseInt(bf.readLine());

StringTokenizer st=new StringTokenizer(bf.readLine());
	int sum=0;
	int k=0;
	int max=0;
	int m=-1000;
for(int i=0; i<n; i++) {
			k=Integer.parseInt(st.nextToken());
			if (k>m) {
				m=k;
			}
			if (sum+k<0) {
				sum=0;
			}else {
				sum+=k;
				if(sum>=max) {
					max=sum;
				}
			}
}

System.out.println(m>0? max : m);
		
		bw.flush();
		
	}
}
