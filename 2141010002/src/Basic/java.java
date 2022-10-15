package Basic;

public class java {
	//factorial_recursion
	public static int fact(int a) {
		if (a==0) {
			return 1;
		}
		return a*fact(a-1);
	}
	
	//armstrong
	public static int count(int x) {
		int count=0;
		while(x!=0) {
			x=x/10;
			count++;
		}
		return count;
	}
	
	//prime
	public static boolean prime(int x) {
//		int c=0;
//		for(int i=1;i<=x;i++) {
//			if(x%i==0) {
//				c++;
//			}
//		}
//		if(c==2)
//			return true;
//		return false;
//	}
		
		for (int i=2;i<=x/2;i++) {
			if(x%i==0) {
				return false;
			}
		}
		return true;
	}
	
}
