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
		int[] arr=new int[26];
		int a=0, tie=-2, M=0;
		for (int i=0; i<s.length(); i++) {
			int c=s.charAt(i);			
			arr[c -= c <96 ? 65 : 97]++;
			if (arr[c]>M) {
				M=arr[c];
				a=c;
			}
			else if(arr[c]==M) {
				a=tie;
			}
			
			
		}
		System.out.println((char)(a+65));
		
		}
	
	}
