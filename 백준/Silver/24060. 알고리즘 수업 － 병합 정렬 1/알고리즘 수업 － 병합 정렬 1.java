	import java.io.BufferedReader;
	import java.io.BufferedWriter;
	import java.io.IOException;
	import java.io.InputStream;
	import java.io.InputStreamReader;
	import java.io.OutputStream;
	import java.io.OutputStreamWriter;
	import java.util.StringTokenizer;
	public class Main {
		int[] tmp= new int[500000];
		public int  merge_sort(int A[], int p, int r, int k) {	
		if (k<0) {
			return k;
		}
			if(p<r) {
				int q=(p+r)/2;
				k=merge_sort(A,p,q, k);
				k=merge_sort(A,q+1,r,k);
				k=merge(A,p,q,r,k);
			} 
			return k;
		}
		public  int merge(int A[], int p, int q, int r,int k) {
			int i=p, j=q+1,	t=0;
			while (i<=q && j <=r) {
				if (A[i]<=A[j]) {
					tmp[t++]=A[i++];
				}
				else tmp[t++]=A[j++];
			}
			while (i<=q) {
				tmp[t++]=A[i++];
			}
			while (j<=r) {
				tmp[t++]=A[j++];
			}
			t=0;
			for (i=p; i<=r; i++) {
				A[i]=tmp[t++];
				if (k>0)	
				k--;
				if (k==0) {
					k=-A[i];
					}
				}
			return k;
		}
		

		public static void main(String[] args) throws IOException {
			BufferedReader bf= new BufferedReader(new InputStreamReader(System.in)); 
			BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
			StringTokenizer st;
			st= new StringTokenizer(bf.readLine());
		int n=Integer.parseInt(st.nextToken());	
		int k=Integer.parseInt(st.nextToken());	
		st= new StringTokenizer(bf.readLine());
		int[] A= new int[n];

		for (int i=0; i<n; i++) {
			A[i]=Integer.parseInt(st.nextToken());
		}
		Main ins = new Main();
		k=ins.merge_sort(A, 0, A.length-1, k);
		k=k<0? -k : -1;
		System.out.print(k);
		}}
	
