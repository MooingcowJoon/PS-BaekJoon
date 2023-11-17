import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(bf.readLine());
		if(n==3 || n==5) {
			System.out.println(1);
			return;
		}
		ArrayList<Integer> list = new ArrayList<>();
		int count=1;
		int a=1;
		list.add(3);
		list.add(5);
		while(!(list.contains(5100))) {
			for (int i=a-count; i<=a; i++) {
			list.add(list.get(i)+3);
			}
			count++;
		list.add(5*count);
		a=list.size()-1;
		
			if(list.contains(n)) {
				System.out.println(count);
				return;
			}
		}
		System.out.println(-1);
	}
	}
	
	
