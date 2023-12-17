import java.io.BufferedReader;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	static int c=0;
    public static int recursion(String s, int l, int r){
        if(l >= r) return 1;
        else if(s.charAt(l) != s.charAt(r)) {
        	
        	return r;
        }
        else return recursion(s, l+1, r-1);
    }
    public static int isPalindrome(String s){
    	
        return recursion(s, 0, s.length()-1);
    }
	public static void main(String[] args) throws IOException {
		BufferedReader bf= new BufferedReader(new InputStreamReader(System.in)); 
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		st= new StringTokenizer(bf.readLine());
		int n=Integer.parseInt(st.nextToken());		//숫자
		for (int i=0; i<n; i++) {
		String s=bf.readLine();
		int a= isPalindrome(s);
		
		bw.write((a==1? 1: 0)+ " "+ (a==1 ? s.length()/2+1 : s.length()-a)+"\n");
		}
		bw.flush();
			}
	}

