package demoGenerics;

interface Flowable{}
interface Drinkable{}

class Cake{}
class Petrol implements Flowable{}
class Water implements Flowable,Drinkable{}
class Juice implements Flowable,Drinkable{}
class Wine implements Flowable,Drinkable{}

class Glass<T extends Flowable & Drinkable>{
	private T obj;

	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}
	
}

public class RealLiefExOFSuperAndExtends {
	public static void main(String[] args) {
		Glass<Juice> glass = new Glass<>();
		glass.setObj(new Juice());
		Juice juice = glass.getObj();
		
	}
}
