package generics;

//Generic Method
//to compare any three object

public class GenericsMethod {

	public static void main(String[] args) {
		Employee employee = new Employee(121,"yash","raxaul",2000.00);
		Employee employee2 = new Employee(111,"abhi","patna",1000.00);
		Employee employee3 = new Employee(211,"jeet","delhi",4000.00);
//		Integer a,b,c;
//		a= 11;
//		b= 4;
//		c= -11;
//		
//		Integer largest = largestValue(a,b,c);
//		System.out.println(largest);
		
		Employee maxEmp = largestValue(employee,employee2,employee3);
		System.out.println(maxEmp);
		
	}

	//Employee class has implemented Comparable already based on ID
	private static <T extends Comparable<T>> T largestValue(T a, T b, T c) {
		T max = a;
		if(b.compareTo(max)>0) {
			max=b;
		}
		if(c.compareTo(max)>0) {
			max=c;
		}
		return max;
	}
}
