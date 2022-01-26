package day3;

interface Jumpable{
	public void jump();
}

class Kid implements Jumpable{
	@Override
	public void jump() {
		System.out.println("I jump higher than monkey");
	}
	public void study() {
		
	}
}

class Monkey implements Jumpable{
	void eatOnTree() {
		
	}
	void stayInTree() {
		
	}
	@Override
	public void jump() {
		System.out.println("Monkey jumps");
	}
}

public class InterfaceBreakTheHierarchy {
 public static void main(String[] args) {
	
}
}
