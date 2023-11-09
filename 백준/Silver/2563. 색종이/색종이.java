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
		int n=Integer.parseInt(st.nextToken()); //색종이의개수
		int[][] paper= new int[100][100];  //도화지의 넓이 100*100
		int patched= 0;
		for (int k=0; k<n; k++) { //색종이 n번 칠함
			st= new StringTokenizer(bf.readLine());
			int c= Integer.parseInt(st.nextToken()); //색종이의 열의 시작좌표
			int r= Integer.parseInt(st.nextToken()); //색종이의 행의 시작좌표
			for (int i=c; i<c+10; i++) {			//색종이의 열과 행의 길이만큼 색종이붙임(값 1올림)
				for (int j=r; j<r+10; j++) {		
					paper[i][j]++;
				}
			}
		}
		for (int i=0; i<100; i++) {   		//전체 도화지중에
			for (int j=0; j<100; j++) {
			if (paper[i][j]>1){				// 2번이상 붙은 색종이 있으면
			patched+=paper[i][j]-1;		//중복붙은걸로 계산
			}
					}
			}
bw.write((n*100)-patched+"");			//색종이 전체 넓이중 중복된 색종이 뺌
bw.flush();
	}}

