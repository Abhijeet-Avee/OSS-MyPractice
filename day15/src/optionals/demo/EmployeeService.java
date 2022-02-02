package optionals.demo;

import java.util.Optional;

public class EmployeeService {

	public Optional<Emp> getById(int id) {
		if(id==4)
			return Optional.ofNullable(new Emp(4, "raj", 56000.00, "it"));
		else
			return Optional.ofNullable(null);
		
	}
}