import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
	BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	OutputStreamWriter ou = new OutputStreamWriter(System.out);
	BufferedWriter bw = new BufferedWriter(ou);
	StringTokenizer st = new StringTokenizer(bf.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
//Hash맵 클래스에 스트링 타입의 키와 값을 default size번만큼 중복순서 상관없이 담는 객체 map 생성

		HashMap<String,String> map=new HashMap();	
		
		//map 객체에 bf객체 readline메소드 반환값을 n*2번 저장
		for (int i=1; i<=n; i++) {
			String s = bf.readLine();
			map.put(i+"",s);
			map.put(s,i+"");
		}
		
		//m번 반복, 리드라인->겟밸류->변수명s에 주소값저장 
		for (int i=0; i<m; i++) {
			String s = map.get(bf.readLine());
			//s의 첫글자가 아라비아숫자일경우
			if (s.charAt(0)<'A') {
			//인티저 객체의 파스인트 메소드에 s를 파라미터로 넣고 반환되는값의 참조값 a에저장
				int a =Integer.parseInt(s);
				bw.write(a+"\n");
			//s의 첫글자가 알파벳일경우
			}else {
				bw.write(s+"\n");
			}
			
			}
		bw.flush();
		}
		}
		
		
		



