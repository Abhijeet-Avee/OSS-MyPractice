package com.equalandhashcode;

class Foo{
	private int i;
	private int j;
	
	public int getI() {
		return i;
	}
	public void setI(int i) {
		this.i = i;
	}
	public int getJ() {
		return j;
	}
	public void setJ(int j) {
		this.j = j;
	}
	
	
	public Foo(int i, int j) {
		this.i = i;
		this.j = j;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + i;
		result = prime * result + j;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Foo other = (Foo) obj;
		if (i != other.i)
			return false;
		if (j != other.j)
			return false;
		return true;
	}
	
	
	
}

public class DemoEqAndHashCode {
	
	public static void main(String[] args) {
		Foo foo1=new Foo(2, 10);
		Foo foo2=new Foo(29, 10);
		
		//contract bw eq and hashcode
		
		
	}

}