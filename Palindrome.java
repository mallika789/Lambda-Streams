package epamAssignment10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;


public class Palindrome {
	public static List<String> getPalindromeList(List<String> list){
		
		ListIterator<String> iterator = list.listIterator();
		List<String> result = new ArrayList<>();
		
		while(iterator.hasNext()){
			String s = iterator.next();
			if(isPalindrome(s)){
				result.add(s);
			}
		}
		return result;
	}
	public static boolean isPalindrome(String s) {
		int i = 0, j = s.length() - 1;
		while(i < j){
			if(s.charAt(i) != s.charAt(j)){
				return false;
			}
			i += 1;
			j -= 1;
		}
		return true;
	}

		public static void main(String args[]){
			String[] strArray = {"aaba","lol","mallika","dad", "cabac"};
			List<String> strList = Arrays.asList(strArray);
			List<String> resList = getPalindromeList(strList);
			System.out.println(resList);
		}
}