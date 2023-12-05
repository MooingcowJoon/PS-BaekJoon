import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int[][][] arr=new int[21][21][21];
			for (int j=0; j<21; j++) {
				for (int k=0; k<21; k++) {
					arr[0][j][k]=1;
					arr[j][0][k]=1;
					arr[j][k][0]=1;
				}
				
			}
		for (int i=1; i<21; i++) {
			for (int j=1; j<21; j++) {
				for (int k=1; k<21; k++) {
				if (i<j&& j<k) {
					arr[i][j][k]= arr[i][j][k-1]+arr[i][j-1][k-1]-arr[i][j-1][k];
				}else arr[i][j][k]= arr[i-1][j][k]+arr[i-1][j-1][k]+arr[i-1][j][k-1]-arr[i-1][j-1][k-1];
				}
				}
		}
		StringTokenizer st;
		String s=bf.readLine();
		int a,b,c;
		
		

		while (!s.equals("-1 -1 -1")  ) {
			st=new StringTokenizer(s);
			a=Integer.parseInt(st.nextToken());
			b=Integer.parseInt(st.nextToken());
			c=Integer.parseInt(st.nextToken());
			if (a<1|| b<1|| c<1) {
				bw.write("w("+a+", "+b+", "+c+") = " +1+"\n");
			}else if(a >20 || b>20 ||c >20) {
			bw.write("w("+a+", "+b+", "+c+") = " +arr[20][20][20]+"\n");
			}else {
				bw.write("w("+a+", "+b+", "+c+") = " +arr[a][b][c]+"\n");
			}
			s=bf.readLine();
		}
		
		
		
		
		bw.flush();
		
	}
}
