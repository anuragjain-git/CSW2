import java.util.*;
import Basic.java;
public class prime {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int n=10;
//		System.out.print("1 "+"2 ");
//		for (int i=4;i<=n;i++) {
//			if(i%2!=0 || i%3!=0) {
//				System.out.print(i+" ");
//			}
//		}
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter n:");
		int n=sc.nextInt();
		
		for (int i=2;i<=n;i++) {
			if(java.prime(i)) {
				System.out.print(i+" ");
			}
		}
	}

}
