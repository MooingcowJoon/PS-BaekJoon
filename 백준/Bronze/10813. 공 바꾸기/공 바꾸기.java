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
		int a= Integer.parseInt(st.nextToken()); //바구니의 갯수 N의 값 a
		int[] A=new int[a];		//초기셋팅- 0번부터 각 n-1번바구니에 n번공이 하나씩
		for (int i=0; i<A.length; i++) {
			A[i]=i+1;
		}
		a= Integer.parseInt(st.nextToken());   //공바꿀 시행할 횟수 a
		for (int i=0; i<a; i++) {
			st= new  StringTokenizer(bf.readLine());
			int b=Integer.parseInt(st.nextToken())-1;//b번 공 (b-1)번 바구니
			int c=Integer.parseInt(st.nextToken())-1;
			int temp=A[b];
			 A[b]=A[c];
			A[c]=temp;
		
					
		}
		for (int i=0; i<A.length; i++) {		//최종 바구니 상태 출력
			bw.write(A[i]+" ");
			
		}
bw.write("\n");
bw.flush();
	
	
	
	
	
	
		
		

	}}
	
			