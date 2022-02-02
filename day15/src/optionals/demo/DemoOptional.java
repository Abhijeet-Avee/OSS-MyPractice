package optionals.demo;

import java.util.Optional;

//Otional:
class NameNotFoundExcetion extends RuntimeException {
}

public class DemoOptional {

	public static void main(String[] args) {
		
		Optional<String> welcomeString= welcomeUser("fdfdf");
		System.out.println(welcomeString.orElse("not found"));
		
		
//		Optional<String> optString = Optional.ofNullable(null);
//		
//		String name = optString.orElseThrow(()-> new NameNotFoundExcetion());


//		String name=optString.orElse("not found");
//		
//		System.out.println(name);

//		System.out.println("---------------");
//		if(optString.isPresent()) {
//		System.out.println(optString.get());//bad programming practice to use get() directlay
//		}else
//			System.out.println("not found");

//		if(optString.isPresent()) {
//			System.out.println("yes");
//		}else
//			System.out.println("no");

//		String a=null;
//		System.out.println(a.toString());

		// String welcomeString =welcomeUser("raj");

		// System.out.println(welcomeString.toString());
	}

	// amit
	public static Optional<String> welcomeUser(String name) {
		// db..
		if (name.contains("raj"))
			return Optional.ofNullable("welcome: " + name);
		else
			return Optional.empty();
	}
}
