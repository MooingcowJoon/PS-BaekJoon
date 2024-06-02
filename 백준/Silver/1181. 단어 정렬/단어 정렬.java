import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;

public class Main {
	String[]tmp = new String[20000];
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
		int a=A[i].length();
		int b=A[j].length();
		if(a<b) {
			tmp[t++]=A[i++];
		}else if(a>b) {
			tmp[t++]=A[j++];
		}else{
			if (dictSort(A[i], A[j], a)) {
				tmp[t++]=A[i++];
			}else tmp[t++]=A[j++];
		}
		}
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

public boolean dictSort(String left, String right, int len) {
char l;
char r;
	for (int i=0; i<len;) {
		l=left.charAt(i);
		r=right.charAt(i);
		if(l<r) {
			return true;
		}else if(l>r ){
			return false;
		}else {
			i++;
		}
	}
return true;
}

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(bf.readLine());
		HashSet<String> set= new HashSet<>();
		for (int i = 0; i < n; i++) {
			set.add(bf.readLine());
		}
	int len= set.size();
	String[] A = set.stream().toArray(s -> new String[len]);
		Main ins = new Main();
		ins.mergeSort(A, 0,len-1);
		for (String s: A) {
		bw.write(s+"\n");	
		}
		bw.flush();
		}
}
