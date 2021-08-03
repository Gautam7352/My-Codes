package questions;

class PrimeTest {
	
	static boolean prime(int n){
		boolean k=false;
		
		if(n==2)
			return true;
		
		for(int i=2;i<n;i++)
			if(n%i!=0)
				k=true;
			else {k=false;
			break;
			}
		return k;
	}
	
	
	public static void main(String[] args) {
		int n=6;
		System.out.println(prime(n));
	}
}
