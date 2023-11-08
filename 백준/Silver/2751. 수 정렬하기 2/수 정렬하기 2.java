import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class Main {
//	public void mergeSort(int[] A, int p, int r) {
//		if(p<r) {
//			int q=(p+r)/2;
//			mergeSort(A, p, q);
//			mergeSort(A, q+1, r);
//			sort(A,p,q,r);
//		}
//	}
//	
//	public void sort(int[]A , int p, int q,int r) {
//		int[]tmp = new int[A.length];
//		int t=0;
//		int i=p;
//		int j=q+1;
//		while(i<=q && j<= r) {
//			if(A[i]<=A[j]) {
//				tmp[t++]=A[i++];
//			}else tmp[t++]=A[j++];
//		}
//		while (i<=q) {
//			tmp[t++]=A[i++];
//		}
//		while(j<=r) {
//			tmp[t++]=A[j++];
//		}
//		t=0;
//		while(p<=r) {
//			A[p++]=tmp[t++];
//		}
//		
//	}
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(bf.readLine());
		int[] arr = new int[2_000_001];
		for (int i=0; i<n; i++) {
			arr[Integer.parseInt(bf.readLine())+1000000]++;
		}
		
		for (int i=0; i<=2000000; i++) {
			if(arr[i]>0) {
				bw.write(i-1000000+"\n");
			}
		}
		bw.flush();
	}
	}
	
	
