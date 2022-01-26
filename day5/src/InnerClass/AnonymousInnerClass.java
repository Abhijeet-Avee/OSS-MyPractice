package InnerClass;

interface Cookable{
	void cook();
}

//class StreetFood implements Cookable{
//	@Override
//	public void cook() {
//		System.out.println("Sounds good...");
//	}
//}

public class AnonymousInnerClass {
	public static void main(String[] args) {
		Cookable cookable = new Cookable(){
			@Override
			public void cook() {
				System.out.println("Sounds good....");
			}
		};
		cookable.cook();
	//Lambda expression
		Cookable cookable2=()->{
			System.out.println("using lamba exp..");
		};
	}
}
