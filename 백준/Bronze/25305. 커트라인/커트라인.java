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
			st= new StringTokenizer(bf.readLine());
			int n=Integer.parseInt(st.nextToken());
			int k=Integer.parseInt(st.nextToken());
			int cut=0;			//커트라인, k 와 같아지면 커트라인
			int[] score= new int[10001];		//0점부터 10000점까지 1~10000
			st= new StringTokenizer(bf.readLine());
			for (int i=0; i<n; i++) {
			 score[Integer.parseInt(st.nextToken())]++;
			}
			int cutscore=10001;
			while(cut<k) {
				cut+=score[--cutscore];
			}
			System.out.println(cutscore);
		}}
	
