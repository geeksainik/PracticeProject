package practicepackage;

public class ReferenceVariable {

	public static void main(String[] args) {
		
		ReferenceClass3 rf3= new ReferenceClass3();
		ReferenceClass2 rf2=new ReferenceClass2(rf3);
		ReferenceClass1 rf1=new ReferenceClass1(rf2);
		double result=rf1.cube(5);
		System.out.println("Cube of num is:"+ result);
		double result1=rf2.square(6);
		System.out.println("square of num is"+ result1);
		
		
		

	}

}
