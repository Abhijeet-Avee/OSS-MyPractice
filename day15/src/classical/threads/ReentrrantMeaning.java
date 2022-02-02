package classical.threads;
//Reentrant lock: same lock can be used to call the other methods
//of the same class from inside the class method.
class Resource{

	public synchronized void foof() {
		
	}
}

class ResourceV2 extends Resource{
	
	//t1 t2
	public synchronized void foof() {
		super.foof();
	}
}
class MyJob implements Runnable{
	
	private Resource Resource;
	
	@Override
	public void run() {
		
	}
	
}

//Thread t1
public class ReentrrantMeaning {
	
	public static void main(String[] args) {
		
		Resource resource=new ResourceV2();
		
		//Thread thread=new Thread()
	}

}