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
		int[] A=new int[a];		//초기셋팅- 어레이의 인덱스 i =i+1번째 바구니
		for (int i=0; i<A.length; i++) {
			A[i]=i+1;
		}
		a= Integer.parseInt(st.nextToken());   //순서역순으로 바꾸는작업 시행할 횟수 a
		for (int i=0; i<a; i++) {
			st= new  StringTokenizer(bf.readLine()); 
			int b=Integer.parseInt(st.nextToken())-1;//순서바꿀 첫번째 b번쨰 바구니 선택
			int c=Integer.parseInt(st.nextToken())-1; //순서바꿀 두번째 c번째 바구니 선택
			
			if (b>c) {  // 
			int d=b-c;
				for (int j=0; 2*j<d; j++) {  // b와 c의 차이만큼 
					int temp=A[c+j];
					A[c+j]=A[b-j];
					A[b-j]=temp;
				}
			}	
			if (b<c) {
			int d=c-b;
				for (int j=0; 2*j<d; j++) {  // b와 c의 차이만큼 
					int temp=A[b+j];
					A[b+j]=A[c-j];
					A[c-j]=temp;
				}
			}
		}
		for (int i=0; i<A.length; i++) {		//최종 바구니 상태 출력
			bw.write(A[i]+" ");
			
		}
bw.write("\n");
bw.flush();
	
	
	
	
	
	
		
		

	}}
	
			