import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;

public class Main {
	static HashMap<Integer, String> map= new HashMap<>();
	public void cantor(String s,int n) {
		if(n==13) {
			return;
		}
		map.put(n, s);
		cantor(s+map.get(13+n)+s, n+1);
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Main ins = new Main();
		map.put(13, " ");
		StringBuilder sb =new StringBuilder();
		sb.append(" ");
		for (int i=1; i<13; i++) {
			String tmp=map.get(13+i-1);
			sb.append(tmp);
			sb.append(tmp);
			map.put(13+i,sb.toString());
			
			
		}
		ins.cantor("-", 0);
		String input=bf.readLine();
		while (input!=null) {
			int a= Integer.parseInt(input);
			bw.write(map.get(a)+"\n");
			input=bf.readLine();
			}
		bw.flush();
	}
}
