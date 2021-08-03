package dataTypesExercises;
//15. Write a Java program to get the next floating-point adjacent in the direction of positive and negative infinity from a given float/double number
class Question15 {

	public static void main(String[] args) {
		System.out.println("Any double value");
		Double k=Math.PI;
		System.out.println(k);
		System.out.println("Next double increment of the variable");
		k=Math.nextUp(k);
		System.out.println(k);
		
		System.out.println("Any float value");
		float a=(float) Math.PI;
		System.out.println(a);
		System.out.println("Next float increment of the variable");
		a=Math.nextUp(a);
		System.out.println(a);
	}

}
