import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bf= new BufferedReader(new InputStreamReader(System.in)); 
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int n=Integer.parseInt(st.nextToken());		//동전종류개수
		int k=Integer.parseInt(st.nextToken());		//만드려는 돈 액수
		int[] coins = new int[n];
		int c=0; //필요한 최소동전개수
		for (int i=0; i<n; i++ ) {
			st = new StringTokenizer(bf.readLine());
			coins[i]= Integer.parseInt(st.nextToken());
		}
	for (int i=n-1; i>=0;) {
			if (coins[i]<=k) {
					k-=coins[i];
					c++;	
				}
			else i--;
			}
	bw.write(c+"\n");
	bw.flush();
		}}
	