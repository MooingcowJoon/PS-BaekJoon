import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedReader bf= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		
		int numbersgiven=10; 	// 나머지를 구할 수들의 개수(입력받을 숫자의 개수)
		int devidedby=42; 	// 나누는 수
		
		int[] remains=new int[devidedby];	//나머지의 경우의수 0~41까지 42개
			
		for (int i=0; i<numbersgiven; i++) { // 입력받은 숫자의 개수만큼 나머지 계산
			StringTokenizer st= new  StringTokenizer(bf.readLine());
			remains[Integer.parseInt(st.nextToken())%devidedby]=1; // 입력숫자를 나누는 수로 나눈 나머지가 인덱스값인   
		}															//remains[]의 원소의 밸류를 1로 어사인한다
		
		int number_remains=0; //정답(서로다른 나머지값들의 개수)
		
		for (int i=0; i<remains.length; i++) {		//remains[]의 원소 중에
			if (remains[i]==1) {					//밸류가 1인 원소가 있다면 (42의 나머지 값들의 경우의수)
			number_remains++;						//정답의 밸류를 1씩 올린다.
			}
		}
bw.write(number_remains+"\n");
bw.flush();	}}
	
	
	
	
	
	
		
		


	
			