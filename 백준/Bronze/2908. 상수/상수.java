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
		String s= bf.readLine();
		int a= (s.charAt(2)-'0')*100+(s.charAt(1)-'0')*10+(s.charAt(0)-'0');
		int b=(s.charAt(6)-'0')*100+(s.charAt(5)-'0')*10+(s.charAt(4)-'0');
		System.out.println(a<b ? b: a);
	}
	}