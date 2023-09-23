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
			StringTokenizer st= new StringTokenizer(bf.readLine());
			int a=Integer.parseInt(st.nextToken());
			int b=Integer.parseInt(st.nextToken());
			st= new StringTokenizer(bf.readLine());
			int c =Integer.parseInt(st.nextToken());
			st= new StringTokenizer(bf.readLine());
			int n =Integer.parseInt(st.nextToken());
			int answer= (c-a)*n>=b ? 1 : 0;
			if (answer==1) {
			for (int i=n; i<=100; i++) {
				answer=(c-a)*i>=b ? 1 : 0;
			}
			}
			System.out.println(answer);
			}
		}
	
