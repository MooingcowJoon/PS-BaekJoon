import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;


public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader bf= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
	int n=0;
	int M=1;
		for (int i=0; i<9; i++) {
		StringTokenizer st= new  StringTokenizer(bf.readLine());
	int a= Integer.parseInt(st.nextToken());
	if (M<a) {
		M=a;
		n=i+1;
	}
			 }
bw.write(M+"\n");
bw.write(n+"\n");
bw.flush();
	 

		 
	
			
		
		

	}}
	
			