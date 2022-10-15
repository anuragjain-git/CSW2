public class fibonacci {
	public static void main(String[] args) {
		int a=0;
		int b=1;
		int c=0;
		int count=4;
		int sum=0;
//		int pos=0;
		for(int i=0;i<count*2;i++) {
			c=a+b;
			if(i%2==0) {
				System.out.print(a+" ");
				sum+=a;
			}
//			pos++;
			a=b;
			b=c;
		}
		System.out.println("\nsum is "+sum);
	}
}
