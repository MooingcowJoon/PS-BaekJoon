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
	String a=bf.readLine();
	
	for (int i=97; i<123; i++) {
		System.out.println(a.indexOf(i));
	}
	}
	}
