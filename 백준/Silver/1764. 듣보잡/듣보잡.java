import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {

	public void sort(String[] A, int p , int r) {
				if(p<r) {
					int q =(p+r)/2;
					sort(A, p, q);
					sort(A,q+1, r);
					merge(A, p, q, r);
				}
	}

	public void merge (String[] A,int p, int q ,int r) {
		String[] tmp = new String[A.length];
		int i=p,j=q+1,t=0;
	
		
		while (i<=q && j<=r) {
			int leftlen=A[i].length();
			int rightlen=A[j].length();
			int len= leftlen< rightlen? leftlen : rightlen;
			if (len<=10){
				long left = Long.parseLong(A[i],0,len,36);
				long right = Long.parseLong(A[j],0,len,36);
				if ( left <right) {
					tmp[t++]=A[i++];
				}else if (left>right) {
					tmp[t++]=A[j++];
				}
				else if (leftlen<rightlen){
					tmp[t++]=A[i++];
				}else tmp[t++]=A[j++];	
			}
			else {
				long left = Long.parseLong(A[i],0,10,36);
				long right = Long.parseLong(A[j],0,10,36);
				if ( left <right) {
					tmp[t++]=A[i++];
				}else if (left>right) {
					tmp[t++]=A[j++];
				}
				else {
					left = Long.parseLong(A[i],10,len,36);
					right = Long.parseLong(A[j],10,len,36);
					if ( left <right) {
						tmp[t++]=A[i++];
					}else if (left>right) {
						tmp[t++]=A[j++];
					}
					else if (leftlen<rightlen){
						tmp[t++]=A[i++];
					}else tmp[t++]=A[j++];	
				}
				
			}
		}
		
		while (i<=q) {
			tmp[t++]=A[i++];
		}
		while(j<=r) {
			tmp[t++]=A[j++];
		}
		i=p; t=0;
		while ( i<=r) {
			A[i]=tmp[t++];
			i++;
		}
		
	}
	
	
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		// OutputStreamWriter ow = ;
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		// 듣, 보 스트링 갯수 n,m 받기
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		// size n 인 해쉬맵 객체 생성
		HashSet<String> set = new HashSet<>(n);
		String[] arr = new String[n];

		for (int i = 0; i < n; i++) {
			set.add(bf.readLine());
		}
		int count=0;
		for (int i = 0; i < m; i++) {
			String s = bf.readLine();
			if (set.contains(s)) {
				arr[count]=s;
			count++;
				}
			}
		bw.write(count+"\n");
		Main ins = new Main();
		ins.sort(arr, 0,count-1);
			for (int i=0; i<count; i++) {
				bw.write(arr[i]+"\n");
			}
			bw.flush();
	}	
}
