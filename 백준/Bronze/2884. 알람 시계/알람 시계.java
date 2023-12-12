import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int H,M;
		Scanner sc=new Scanner(System.in);
		
		H= sc.nextInt();
		M= sc.nextInt();
		
		if (M>=45) {
			System.out.println(H);
			System.out.println(M-45);
		}
		else {
			if (H>0) {
			System.out.println(H-1);
			System.out.println(60+(M-45));
			}
			else {
			System.out.println(23);
			System.out.println(60+(M-45));
			}
		}
			
	
	
	}
}
