package day2;

class Box{
	private int l,b;
	public Box(int l, int b){
		this.l = l;
		this.b = b;
	}
	public void print() {
		System.out.println("l: "+l+" b: "+b);
	}
}

class Box3D extends Box{
	private int h;
	public Box3D(int l,int b,int h) {
		super(l,b);
		this.h=h;
	}
	public void print() {
		super.print();
		System.out.println("h: "+ h);
	}
}

class Box3DWithColor extends Box3D{
	private String color;
	public Box3DWithColor(int l,int b,int h, String color) {
		super(l,b,h);
		this.color = color;
	}
	public void print() {
		super.print();
		System.out.println("Color: "+ color);
	}
}

public class BoxExample {
	public static void main(String[] args) {
		Box3DWithColor box = new Box3DWithColor(10,20,30,"Red");
		box.print();
	}
}
