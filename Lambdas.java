package epamAssignment10;

import java.util.*;
import java.util.stream.Collectors;

public class Lambdas {
	public Lambdas() {
		// TODO Auto-generated constructor stub
	}

	public static double average(List<Integer> list){
		return list.stream().mapToInt(i -> i).average().getAsDouble();
	}
	
	public static void main(String args[]){
		List<Integer> list1=Arrays.asList(29, 21, 99, 98, 1, 31, 0, 4);
		double res=average(list1);
		System.out.println(res);
		
	}

}