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
		int[][] m = new int[10][10];			//열의길이 와 행의길이
		int max=0;  					//최대값의 값
		String maxc="";				//최대값의 좌표
		for(int i =1; i < 10;i++) {
			st = new StringTokenizer(bf.readLine());
			for (int j =1; j<10;j++) {
				m[i][j]= Integer.parseInt(st.nextToken());
				if(m[i][j]>=max) {
					max=m[i][j];
					maxc=i+" "+j;
				}
			}
		
		}
		bw.write(max+"\n");
		bw.write(maxc);
		bw.flush();
		
			}
	}

