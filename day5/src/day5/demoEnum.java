package day5;
//Enum: special class in java
//what is the need?
//38,40,42,44,46...
//S, M, L, XL, XXL

//Enum ShirtShize{
//	S, M, L, XL, XXL;
//}

enum ShirtShize{
	S(38), M(40), L(42), XL(44), XXL(46);

	private int size;
	
	private  ShirtShize(int size) {
		this.size=size;
	}

	public int getSize() {
		return size;
	}
}

class Shirt{
	private int id;
	private String color;
	
	private ShirtShize size;// constract : 
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	
	
	public ShirtShize getSize() {
		return size;
	}
	public void setSize(ShirtShize size) {
		this.size = size;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Shirt [id=").append(id).append(", color=")
		.append(color).append(", size=").append(size)
				.append("]");
		return builder.toString();
	}
	
	
}
public class demoEnum {
	
	public static void main(String[] args) {
		Shirt shirt=new Shirt();
		shirt.setId(121);
		shirt.setColor("light blue");
		shirt.setSize(ShirtShize.M);
		System.out.println(shirt);
		
		
		ShirtShize shirtShize=ShirtShize.M;
		System.out.println(shirtShize.getSize()+": "+shirtShize );
		
		System.out.println("how to iterate through all enum constants");
		
		ShirtShize[] values = ShirtShize.values();
		
		for(ShirtShize shirtShize2: values) {
			System.out.println(shirtShize2.ordinal()+ ": "+ shirtShize2.getSize() + " : "+ shirtShize2.name());
		}
		
	}

}



