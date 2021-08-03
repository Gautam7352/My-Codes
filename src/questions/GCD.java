package questions;

class GCD {

	public static void main(String[] args) {
		int a=12;
		int b=-18;
		int gcd=0;
		for(int i=1;i<Math.abs(a)&&i<Math.abs(b);i++) {
			if(a%i==0&&b%i==0) {
				gcd=i;
			}
		}
		System.out.println(gcd);
	}
}
