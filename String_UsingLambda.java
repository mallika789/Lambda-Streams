package epamAssignment10;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class String_UsingLambda {

	public String_UsingLambda() {
		// TODO Auto-generated constructor stub
	}
	public static List<String> search(List<String> list){
		return list.stream().filter(s -> s.startsWith("a")).filter(s -> s.length()==3)
				.collect(Collectors.toList());
	}
	public static void main(String args[]){
		List<String> list2=Arrays.asList("grapes", "ape", "ace", "mango", "app", "amla", "dates");
		System.out.println(search(list2));
	}

}

