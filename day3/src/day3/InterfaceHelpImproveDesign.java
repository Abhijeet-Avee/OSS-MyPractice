package day3;
//****SEPARATE WHAT VARIES****
interface Swimmable{
	public void swimming();
}
interface Flyable{
	public void flying();
}
class Bird{
	void eat() {
		System.out.println("eating....");
	}
}
class Duck extends Bird implements Swimmable{
	@Override
	public void swimming() {
		System.out.println("swimming like God...");
	}
}
class Eagle extends Bird implements Flyable{
	@Override
	public void flying() {
		System.out.println("Fly like god...");
	}
}

public class InterfaceHelpImproveDesign {
	public static void main(String[] args) {
		Bird duck = new Duck();
		((Swimmable)duck).swimming();
		Bird eagle = new Eagle();
		((Flyable)eagle).flying();
	}
}
