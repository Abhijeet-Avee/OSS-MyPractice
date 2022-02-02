package basics.revision.java8;

//lambda --->
//class Foo2 {
//	private int temp = 90;
//
//	public void foof() {
//		
//		Runnable runnable = () -> {
//	
//			System.out.println("it is an anonymous inner class..." + this.temp);
//
//		};
//
//		runnable.run();
//	}
//
//	public void myMethod(Runnable runnable) {
//		System.out.println("use this runnable");
//	}
//}

class Foo2 {
	private int temp=90;
	
	public void foof() {
		
		 int c=1;// local variable: "effective final" Java 8
		 		 
		Runnable runnable = new Runnable() {
			private int temp=99;
			@Override
			public void run() {
				System.out.println(c);
				System.out.println("it is an annoymous innner class..."+ this);
			}
		};
		
		myMethod(runnable);
		
		runnable.run();
	}
	
	public void myMethod(Runnable runnable) {
		System.out.println("use this runnable");
	}
}

public class DiffBwAnnoymonusInnerClassAndLamda {

	public static void main(String[] args) {

		Foo2 foo2 = new Foo2();
		foo2.foof();

		
		Runnable runnable=()-> System.out.println("it is the job");
		
		Thread thread=new Thread(runnable);
		thread.start();
	}

}















