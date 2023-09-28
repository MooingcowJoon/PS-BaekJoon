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
			StringTokenizer st;
			st= new StringTokenizer(bf.readLine());
		int n=Integer.parseInt(st.nextToken());		//첫번째 입력값 첫집합의 원소갯수 n
		st= new StringTokenizer(bf.readLine());

		int[] A= new int[20000001];				//첫번째 집합 A 생성
		for (int i=0; i<n; i++) {		// 배열 A의 원소 어사인과 최대 최소값 찾기
			A[Integer.parseInt(st.nextToken())+10000000]=1;
		}
		
		st= new StringTokenizer(bf.readLine());
		int b=Integer.parseInt(st.nextToken());
		st= new StringTokenizer(bf.readLine());
		for (int i=0; i<b; i++) {
			bw.write(A[Integer.parseInt(st.nextToken())+10000000]+" ");
		}
		
		
		bw.flush();
		
		
		
		}
	
		}
		
		
		
	
