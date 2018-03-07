package practicepackage;

public class ReferenceClass1 {
	
	ReferenceClass2 ref2;
	
	ReferenceClass1(ReferenceClass2 obj2)
	{
		this.ref2= obj2;
		
	}
	
	double cube(double x)
	{
		double result= x*ref2.square(x);
		return result;
	}

}
