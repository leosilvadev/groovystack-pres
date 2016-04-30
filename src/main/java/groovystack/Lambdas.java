package groovystack;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Lambdas {
	
	public static void main(String[] args){
		Function<String, String> addPre = (name) -> {
			return "pre-"+name;
		};
		
		List<String> names = Arrays.asList("leo", "jao", "maria", "jose");
		names.stream()
			.map(addPre)
			.forEach(System.out::println);
	}

}
