import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class Main{

	public static void main(String[] args) throws IOException {
		BufferedReader bf= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st= new StringTokenizer(bf.readLine());
		int n=Integer.parseInt(st.nextToken());
		st= new StringTokenizer(bf.readLine());
		List<Integer>[] list = new LinkedList[n];
 		int[] arr= new int[n];
		for (int i=0; i<n; i++) {
			list[i]=new LinkedList<Integer>();
				arr[i]=Integer.parseInt(st.nextToken());
				list[i].add(arr[i]);
		}
		int answer=0;
		for (int i=n-1; i>0; i--) {
			int l=list[i].size();
			for(int j=i-1; j>=0; j--) {
				if (arr[i]>arr[j] && l>=list[j].size()) {
					list[j].clear();
					list[j].add(arr[j]);
					list[j].addAll(list[i]);
				}
				if (l>answer) {
					answer=l;
				}
			}
			}
		if(list[0].size()>answer) {
			answer=list[0].size();
		}
		
		System.out.println(answer);
		}
		
}
