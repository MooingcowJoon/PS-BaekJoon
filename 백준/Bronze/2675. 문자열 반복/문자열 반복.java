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
		int t = Integer.parseInt(bf.readLine());
	
	for (int i=0; i<t; i++) {
		StringTokenizer st= new StringTokenizer(bf.readLine());
		int reps = Integer.parseInt(st.nextToken());
		String p = st.nextToken();
		for (int k=0; k<p.length(); k++) {
			for (int j=0; j<reps; j++) {
			bw.write(p.charAt(k));
		}}
	bw.write("\n");
	}	
	bw.flush();
	}
	
	}
