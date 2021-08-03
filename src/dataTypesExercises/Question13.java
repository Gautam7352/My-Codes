package dataTypesExercises;
//13. Write a Java program to compute the floor division and the floor modulus of the given dividend and divisor.
//floor modulus and floor division are lower values in division of negative integers
class Question13 {

	public static void main(String[] args) {
		int x = -2365;
        int y = 125;

        System.out.println("Floor division using '/' operator: " + (x / y));
        System.out.println("Floor division using floorDiv() method is: " + Math.floorDiv(x, y));
        System.out.println();
        System.out.println("Floor modulus using '%' operator: " + (x % y));
        System.out.println("Floor modulus using floorMod() method is: " + Math.floorMod(x, y));
	}
}
