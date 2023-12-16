import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A,B,C;
		Scanner sc=new Scanner(System.in);
		
		A= sc.nextInt();
		B= sc.nextInt();
		C= sc.nextInt();
		
		if (B+C>=60) {
				System.out.println((A+(B+C)/60)%24+" "+(B+C)%60);
			}
		
		else 			System.out.println(A+" "+(B+C));
	
	
	}
}
