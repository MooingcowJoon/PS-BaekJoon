import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int	AA1,AA2,a, b, c,d,e,f,T,T2,T3;
	Scanner sc=new Scanner(System.in);
	AA1=sc.nextInt();
	AA2=sc.nextInt();
	a=AA1/100;
	b=(AA1/10)%10;
	c=(AA1%100)%10;
	d=AA2/100;
	e=(AA2/10)%10;
	f=(AA2%100)%10;
	T=((a*100)+(b*10)+c)*f;	
	T2=( ((a*1000)+(b*100)+(c*10)) *e)/10;
	T3=( ((a*1000)+(b*100)+(c*10)) *d)/10;
	
System.out.println(T);	
System.out.println(T2);
System.out.println(T3);
System.out.println(((a*100)+(b*10)+c)*((d*100)+(e*10)+f));	
	}
}