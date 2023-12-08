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
		StringTokenizer st= new  StringTokenizer(bf.readLine());
	int a= Integer.parseInt(st.nextToken());
	int[] A=new int[a];
	st= new  StringTokenizer(bf.readLine());
	 for (int i=0; i<A.length; i++) {
		a=Integer.parseInt(st.nextToken());
		 A[i]=a;
	 }
	 int i=0;
	 int M=A[0];	 int m=A[0];
		 for (int j=0; j<A.length; j++) {
			 if (A[j]>=A[i]) {
				 m=A[i];
		 		}
			 else {
				 i=j;
				 m=A[i];
			 }
			
			 }
		 
		 
		 for (int j=0; j<A.length; j++) {
			 if (A[j]<=A[i]) {
				 M=A[i];
		 		}
			 else {
				 i=j;
				 M=A[i];
			 }
			
			 }
		
bw.write(m+" "+M+"\n");
bw.flush();
	
	 

		 
	
			
		
		

	}}
	
			