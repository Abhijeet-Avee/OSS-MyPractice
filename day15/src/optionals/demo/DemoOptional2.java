package optionals.demo;

import java.util.Optional;
import java.util.function.Supplier;

/*
 * 		may have a	 may hv ins		but must have name
 * Person -----> Car---> Insurance--> name=> comviva
 */
class Insurance {
	private String companayName;

	public String getCompanayName() {
		return companayName;
	}

	public void setCompanayName(String companayName) {
		this.companayName = companayName;
	}

}

// car may or may not have insurence !
class Car {
	private Optional<Insurance> insurance;

	public Optional<Insurance> getInsurance() {
		return insurance;
	}

	public void setInsurance(Optional<Insurance> insurance) {
		this.insurance = insurance;
	}

}

class Person {
	private Optional<Car> car;

	public Optional<Car> getCar() {
		return car;
	}

	public void setCar(Optional<Car> car) {
		this.car = car;
	}

}

public class DemoOptional2 {

	public static void main(String[] args) {

//		Insurance insurance=new Insurance();
//		insurance.setCompanayName("comviva");
		Optional<Insurance> optInsurance = Optional.ofNullable(null);

		Car car = new Car();
		car.setInsurance(optInsurance);

		Optional<Car> optCar = Optional.ofNullable(car);

		// as car dont insurance now
		Person person = new Person();

		person.setCar(optCar);

		Optional<Person> optPerson = Optional.ofNullable(person);

		String companyName = getCompanyName(optPerson);
		System.out.println(companyName);

	}

	private static String getCompanyName(Optional<Person> optPerson) {
		return optPerson.flatMap(opP -> opP.getCar()).flatMap(opCar -> opCar.getInsurance())
				.map(opIns -> opIns.getCompanayName()).orElse("not found");

		// get the copmany name if there...
		// from optional of person---> optional of car --> opt of ins--> name of company
		// or return not found

		// Optional<Optional<Car>> map = optPerson.map(pOpt-> pOpt.getCar());

//		Optional<Car> optCar = optPerson.flatMap(pOpt-> pOpt.getCar());
//		Optional<Insurance> optIns=optCar.flatMap(cOpt-> cOpt.getInsurance());
//		
//		Optional<String> map = optIns.map(optIns1-> optIns1.getCompanayName());
//		
//		return map.orElse("not found");
	}
}

////What is Optional : class in java 8 used to deal with null in better way
//
//EmployeeService employeeService=new EmployeeService();
//Optional<Emp> empOpt=employeeService.getById(40);
//
//String name = empOpt
//		.map(emp-> emp.getName())
//		.orElse("name not found");
//
//System.out.println(name);
////Emp emp2=empOpt.orElseThrow(EmpNotFoundEx::new);
//
////I want to print the name of the emp if there otherwise i want to print emp not found
//
