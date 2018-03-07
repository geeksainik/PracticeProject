package practicepackage;

public class ReferenceClass2 {
	
	ReferenceClass3 ref3;
	
	ReferenceClass2(ReferenceClass3 obj3)
	{
		this.ref3=obj3;
	}

	double square(double x)
	{
		double result=x*ref3.get(x);
		return result;
	}
}
