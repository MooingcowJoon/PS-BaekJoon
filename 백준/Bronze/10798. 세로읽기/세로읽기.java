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
		String s;
		int[][] m = new int[5][15];
		
		for (int i=0; i<5; i++) {
		s = bf.readLine();
			for(int j=0; j<s.length(); j++) {
				m[i][j]=s.charAt(j);
			}
		}
	for (int j=0; j<15; j++) {
		for (int i=0; i<5; i++) {
			if (m[i][j]!='\0') {
			bw.write((char)(m[i][j]));
			}
		}
	}
			bw.flush();
	}}

