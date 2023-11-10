import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public int xx(int n) {
		n--;
		int first = 0;
		if (n >= 3700) {
			first = n / 3700;
			n -= 3700 * first;
			first *= 1000000;
		}
		int mid = 0;
		if (n >= 2800) {
			n -= 2800;
			if (n <= 3) {
				mid = 667666;
				mid += n * 1000;
			} else if (n > 3 && n <= 3 * 20) {
				n -= 3;
				mid = 670666;
				mid += (n / 19) * 10000;
				n = n % 19;
				if (n >= 6 && n < 16) {
					n -= 6;
					mid += 6000 + n - 6;
				} else if (n < 6) {
					mid += 1000 * n;
				} else if (n >= 16) {
					n -= 9;
					mid += 1000 * n;
				}
			} else if (n > 3 * 20 && n <= 900) {
				if (n % 280 == 0) {
					mid = 667666 + n / 280 * 100000;
				} else {

					n -= 60;
					mid = 700666;

					mid += (n / 280) * 100000;
					n = n % 280;
					if (n >= 20 * 6 && n <= 20 * 6 + 100) {
						n -= 20 * 6;
						mid += 66 * 1000 + n - 66;
					} else if (n < 120 && n > 0) {
						mid += (n / 19) * 10000;
						n = n % 19;
						if (n >= 6 && n < 16) {
							n -= 6;
							mid += 6000 + n - 6;
						} else if (n >= 16) {
							n -= 9;
							mid += n * 1000;
						} else if (n < 6) {
							mid += n * 1000;
						}

					} else if (n > 20 * 6 + 100) {
						n -= 220;
						mid += 67000 + (n / 19) * 10000;
						n = n % 19;
						if (n >= 9) {
							n -= 9;
							mid += 9000 + n - 6;
						} else {
							mid += n * 1000;
						}
					}
				}
			}
			return first + mid;
		}

		else if (n >= 1800 && n < 2800) {
			n -= 1800;
			mid = 666000 + n;
		} else if (n < 1800) {
			mid = 666 + (n / 280) * 100000;
			n = n % 280;
			if (n >= 120 && n < 220) {
				n -= 120;
				mid += 66000 - 66 + n;
			} else if (n < 120) {
				mid += (n / 19) * 10000;
				n = n % 19;
				if (n >= 6 && n < 16) {
					n -= 6;
					mid += 6000 + n - 6;
				} else if (n >= 16) {
					n -= 9;
					mid += n * 1000;
				} else if (n < 6) {
					mid += n * 1000;
				}
			} else if (n >= 220) {
				n -= 220;
				mid += 67000 + (n / 19) * 10000;
				n = n % 19;
				if (n >= 9) {
					n -= 9;
					mid += 9000 + n - 6;
				} else {
					mid += n * 1000;
				}
			}

		}
		return first + mid;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(bf.readLine());
		Main ins = new Main();
		System.out.println(ins.xx(n));
	}
}
