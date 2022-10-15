import java.util.Scanner;

import Basic.java;

public class armst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter n:");
		int n=sc.nextInt();
		int y=n;
		int c= java.count(n);
		int sum=0;
		while(n!=0) {
			int a=n%10;
			sum+=Math.pow(a, c);
			n=n/10;
		}
		if(sum==y) {
			System.out.println("Is Armstrong");
		}
	}

}
