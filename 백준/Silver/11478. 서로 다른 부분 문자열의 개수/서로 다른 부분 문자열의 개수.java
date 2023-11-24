import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		// 받은 스트링의 각 글자수마다 나올수있는 모든 섭스트링 셋에넣고 셋 사이즈출력
		// i -> 0번부터 렝스 -1까지
		// j->  0번부터 렝스 -1까지
		// 반복한번마다 원스트링의 j번째부터 j+i번까지 셋에 넣음
		HashSet<String> set = new HashSet<>();
		String s = bf.readLine();
		for (int i = 0; i < s.length(); i++) {
			for (int j=0; j <s.length()-i ; j++) {
				String tmp = s.substring(j,j+i+1);
				set.add(tmp);
			}
		}
		System.out.println(set.size());
	}
}
