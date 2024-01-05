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
	String s=bf.readLine();
	int n= 1;
	if (s.charAt(0)==' ' && s.length()>1) {
		String[] arr=s.split(" ");
		n=arr.length-1;
				}
	else {
		String[] arr=s.split(" ");
		n=arr.length;
	}
	System.out.println(n);
	}
	}