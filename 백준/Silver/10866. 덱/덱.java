import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static class Deque {
		int front;
		int back;
		int backSize;
		int frontSize;
		int size;
		int[] arr;

		public Deque() {
			super();
			this.front = 9998;
			this.back = 9999;
			this.size = 0;
			this.arr = new int[10000];
		}

		public void pushFront(int x) {
			arr[front% arr.length] = x;
			front--;
			size++;
		}

		public void pushBack(int x) {
			arr[back% arr.length] = x;
			back++;
			size++;
		}

		public int popFront() {
			if (size == 0) {
				return -1;
			}
			front++;
			int a = arr[front% arr.length];
			arr[front% arr.length] = 0;
			size--;
			return a;
		}

		public int popBack() {
			if (size == 0) {
				return -1;
			}
			back--;
			int a = arr[back % arr.length];
			arr[back % arr.length] = 0;
			size--;
			return a;
		}

		public int size() {
			return size;
		}

		public int empty() {
			if (size == 0) {
				return 1;
			} else
				return 0;
		}

		public int back() {
			if (size == 0) {
				return -1;
			}
			return arr[(back-1)% arr.length];
		}

		public int front() {
			if (size == 0) {
				return -1;
			}
			return arr[(front+1) % arr.length];
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Deque q = new Main.Deque();

		int n = Integer.parseInt(bf.readLine());

		for (int i = 0; i < n; i++) {
			String s = bf.readLine();
			if (s.equals("size")) {
				bw.write(q.size() + "\n");
			} else if (s.equals("front")) {
				bw.write(q.front() + "\n");
			} else if (s.equals("back")) {
				bw.write(q.back() + "\n");
			} else if (s.equals("empty")) {
				bw.write(q.empty() + "\n");
			} else if (s.equals("pop_front")) {
				bw.write(q.popFront() + "\n");
			} else if (s.equals("pop_back")) {
				bw.write(q.popBack() + "\n");
			} else {
				String[] s2 = s.split(" ");
				if (s2[0].equals("push_front")) {
					q.pushFront(Integer.parseInt(s2[1]));
				} else
					q.pushBack(Integer.parseInt(s2[1]));
			}

		}

		bw.flush();
	}
}
