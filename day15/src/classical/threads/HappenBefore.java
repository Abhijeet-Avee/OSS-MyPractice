package classical.threads;

class Demo {
	int a = 0;
	int b = 0;
	int c = 0;
	volatile int x=0;

	void writeThread() {
		a=1;
		b=1;
		c=1;
		
		x=1;
		
	}

	void readerThread() {
		
			int m=x;
			
			int d1=a;
			int d2=b;
			int d3=c;
	}
}

public class HappenBefore {

	public static void main(String[] args) {

	}

}