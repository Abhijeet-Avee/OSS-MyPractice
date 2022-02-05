package OCJP.sgganesh;

import java.util.Optional;

public class Ex1 {

	public static void main(String[] args) {
		
		Optional<String> string = Optional.of(" abracadabra ");
		string.map(String::trim).ifPresent(System.out::println);
		
//		DoubleStream.of(1.0, 4.0, 9.0)
//		.map(Math::sqrt)
//		.peek(System.out::println)
//		.sum();
		
//		List<Integer> ell = Arrays.asList(-11, 22, 33, -44, 55);
//		System.out.println("Before: " + ell);
//		ell.replaceAll(Math::abs);
//		System.out.println("After: " + ell);
//		
		
//		
//		AtomicInteger ints = new AtomicInteger(0);
//		Stream
//		.generate(ints::incrementAndGet)
//		.limit(10)
//		.forEach(System.out::println);
		
		
//		Function<String, Integer> parseInt = Integer::parseInt;
//		Function<Integer, Integer> absInt = Math::abs;
//		Function<String, Integer> parseAndAbsInt = parseInt.andThen(absInt);
//		Arrays.stream("4, -9, 16".split(", "))
//		.map(parseAndAbsInt)
//		.map(x-> x*x)
//		.forEach(System.out::println);
//		
		
//		Function<String, Integer> strLength = str -> str.length();
//		System.out.println(strLength.apply("hello java "));
		
//		Arrays.stream("4, -9, 16".split(", "))
//		.map(Integer::parseInt)
//		.map(i -> (i < 0) ? -i : i)
//		.forEach(System.out::println);
		
		
//		List<String> greeting = new ArrayList<>();
//		greeting.add("hello");
//		greeting.add("world");
//		
//		greeting.removeIf(str -> !str.startsWith("h"));
//		
//		greeting.forEach(System.out::println);
		
		
		
//		Stream.of("hello", "world")
//		.filter(str -> str.startsWith("h"))
//		.forEach(System.out::println);
	}
}