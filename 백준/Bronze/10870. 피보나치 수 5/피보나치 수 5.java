	import java.io.BufferedReader;
	import java.io.BufferedWriter;
	import java.io.IOException;
	import java.io.InputStream;
	import java.io.InputStreamReader;
	import java.io.OutputStream;
	import java.io.OutputStreamWriter;
	import java.util.StringTokenizer;
	public class Main {
		public int method(int input) {		//인풋 파라미터
			if(input>1) {
			return method(input-2)+method(input-1);	//인풋* input-1의 규칙으로 매개변수 정의하고 method 호출
			}
			else if (input==1) {
				return 1;
			}
			else return 0;
			}
		
		
		public static void main(String[] args) throws IOException {
			BufferedReader bf= new BufferedReader(new InputStreamReader(System.in)); 
			BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
			StringTokenizer st;
			st= new StringTokenizer(bf.readLine());
		int n=Integer.parseInt(st.nextToken());		//숫자
		Main ohno = new Main();
		System.out.println(ohno.method(n));
		}}
	
