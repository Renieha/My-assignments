package week2.day2;

public class fibonacciseries {
	
	public static void main(String[] args) {
		int a = 0;
		int b = 1;
		int c;
		int range=8;
		System.out.println(a);
		System.out.println(b);
		for(int i =2; i<8; i++) {
			c=a+b;
			a=b;
			b=c;
			System.out.println(c);
			
		}
		
	}
	

}