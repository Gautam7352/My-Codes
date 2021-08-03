package dataTypesExercises;
//11. Write a Java program to test whether a given double/float value is a finite floating-point value or not
class Question11 {

	public static void main(String[] args) {
		System.out.println("\nFinite doubles\n--------------");
		
        Double dn1 = 0.000213456321d;
        boolean d1 = Double.isFinite(dn1);
        System.out.println("Is "+dn1 + " is finite? " + d1);
        
        Double dn2 = dn1 / 0;
        boolean d2 = Double.isFinite(dn2);
        System.out.println("Is "+dn2 + " (dn1/0) is finite? " + d2);
        
        Double dn3 = Double.POSITIVE_INFINITY * 0;
        boolean d3 = Double.isFinite(dn3);
        System.out.println("Is "+dn3 + " is finite? " + d3);
		      
        System.out.println("\n\nFinite floats\n-------------");
        
        Float fn1 = 5.3f;
        boolean f1 = Float.isFinite(fn1);
        System.out.println("Is "+fn1 + " is finite? " + f1);
        
        Float fn2 = fn1 / 0;
        boolean f2 = Float.isFinite(fn2);
        System.out.println("Is "+fn2 + " (fn1/0) is finite? " + f2);
        
        Float fn3 = 0f / 0f;
        boolean f3 = Float.isFinite(fn3);
        System.out.println("Is "+fn3 + " is finite? " + f3);
	}
}