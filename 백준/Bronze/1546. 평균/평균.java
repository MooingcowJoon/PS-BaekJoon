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
		float[] N=new float[Integer.parseInt(st.nextToken())+2];// 과목의개수 N과 점수담을 N의 어레이(원점수들+원점수합+최대값)
														//인덱스 끝번은 원점수들 중 최대값, 인덱스 끝에서 두번째는 원점수들의 합
		st= new  StringTokenizer(bf.readLine());    //
		 for (int i=0; i<N.length-2; i++) { // 원점수 입력
			N[i]=Integer.parseInt(st.nextToken()); //	
			N[N.length-2]=N[N.length-2]+N[i];		//원점수 합 계산
			if(N[i]>=N[N.length-1]) {	//원점수들중 최대값 구하기
				N[N.length-1]=N[i];	
			}
		}
	
	
		bw.write( ((N[N.length-2])*100/N[N.length-1])/(N.length-2)+"\n");  //100*(원점수합/최대값)/과목의개수N
bw.flush();	}}
	
	
	
	
	
	
		
		


	
			