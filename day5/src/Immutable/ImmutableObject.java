package Immutable;

import java.util.Arrays;

final class MyImmutableObject {
    private final int i;
    private final int arr[];
    private final String name;
    private final Employee employee;
    public MyImmutableObject(int i, int arr[], String name, Employee employee) {
        this.i = i;
        // this.arr=arr;//make copy of the array
        this.arr = Arrays.copyOf(arr, arr.length);
        this.name = name;
        this.employee=employee;
 
    }
    public Employee getEmployee() throws CloneNotSupportedException {
        return (Employee) employee.clone();
    }
 

    public String getName() {
        return name;
    }
 
    public int[] getArr() {
        return Arrays.copyOf(arr, arr.length);
    }
 
    public int getI() {
        return i;
    }
 
    public void print() {
        System.out.println("i : " + i);
        System.out.println("arr: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println(name);
        System.out.println(employee);
    }
}
 
public class ImmutableObject {
 
    public static void main(String[] args) throws CloneNotSupportedException {


        int i = 66;
        int arr[] = { 3, 5, 7 };
        String name="raja";
        Employee employee=new Employee(121, "amit", 4000.00);


        MyImmutableObject immutable = new MyImmutableObject(i, arr, name, employee);
        immutable.print();

        Employee e=immutable.getEmployee();
        e.setName("sumit");

        immutable.print();
    }
 
}
