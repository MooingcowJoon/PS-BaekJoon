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
			long n=Integer.parseInt(st.nextToken());
			System.out.println(n*n);
			System.out.print(2);
			}
		}
	
