import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	String[]tmp = new String[100000];
	public void mergeSort(String[] A, int p, int r) {
		if (p < r) {
			int q = (p + r) / 2;
			mergeSort(A, p, q);
			mergeSort(A, q + 1, r);
			sort(A, p, q, r);
		}
	}

public void sort(String[] A , int p, int q,int r) {

	int t=0;
	int i=p;
	int j=q+1;
	while(i<=q && j<= r) {
		
		String[]left=A[i].split(" ");
		String[]right=A[j].split(" ");
		
		int a=Integer.parseInt(left[1]);
		int b=Integer.parseInt(right[1]);
		if(a<b) {
			tmp[t++]=A[i++];
		}else if(a>b) {
			tmp[t++]=A[j++];
		}else if (a==b){
			a=Integer.parseInt(left[0]);
			b=Integer.parseInt(right[0]);
			if(a<=b) {
				tmp[t++]=A[i++];
			}else tmp[t++]=A[j++];
		}}
	while (i<=q) {
		tmp[t++]=A[i++];
	}
	while(j<=r) {
		tmp[t++]=A[j++];
	}
	t=0;
	while(p<=r) {
		A[p++]=tmp[t++];
	}
	
}

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(bf.readLine());
		String[] arr = new String[n];
		for (int i = 0; i < n; i++) {
			arr[i] = bf.readLine();
		}

		Main ins = new Main();
		ins.mergeSort(arr, 0, n-1);
	for(String s: arr) {
		bw.write(s+"\n");
	}
	bw.flush();
	}
}
