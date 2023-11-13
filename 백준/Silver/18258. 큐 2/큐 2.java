import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;

public class Main {
	static class AQ {
		int size;
		int[] arr;
		int front;
		int back;

		AQ() {
			this.size = 0;
			this.arr = new int[2000001];
			this.front = 0;
			this.back = 0;
		}

		int methods(int m) {
			if (m == -2) {
				return size;
			}
			if (m == -3) {
				if (size == 0) {
					return 1;
				} else
					return 0;
			}
			if (m == -1) {
				if (size == 0) {
					return -1;
				}
				int a = arr[front + 1];
				front++;
				size--;
				return a;
			}
			if (m == -4) {
				if (size == 0) {
					return -1;
				}
				return arr[front+1];
			}
			if (m == -5) {
				if (size == 0) {
					return -1;
				}
				return arr[back];
			}
			else return -1;
		

		}

	
	void push(int a) {
		back = (back + 1) % arr.length;
		arr[back] = a;
		size++;
	}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		HashMap<String, Integer> map = new HashMap<>();

		map.put("pop", -1);
		map.put("size", -2);
		map.put("empty", -3);
		map.put("front", -4);
		map.put("back", -5);

		int n = Integer.parseInt(bf.readLine());

		Main.AQ ins = new Main.AQ();
		for (int i = 0; i < n; i++) {
			String s = bf.readLine();
			if (map.containsKey(s)) {
				bw.write(ins.methods(map.get(s)) + "\n");
			} else {
				String[] ss = s.split(" ");
				ins.push(Integer.parseInt(ss[1]));
			}

		}

		bw.flush();

	}
}
