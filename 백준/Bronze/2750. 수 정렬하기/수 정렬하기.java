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
			int n=Integer.parseInt(st.nextToken());			//주어지는 입력숫자의개수
			int[] arr=new int[2001];		//n의 +-정수, 0을 모두 담을수있는 배열
			arr[1000]=1;
			for (int i=0; i<n; i++) {
				st= new StringTokenizer(bf.readLine());
				int a=Integer.parseInt(st.nextToken());
				arr[1000+a]= a;
			}
			for (int i=0; i<arr.length; i++) {
				if (arr[i]!=0 && i!=1000 || i==1000 & arr[i]==0){
				System.out.println(arr[i]);
				}
				}
			}
		}
	
