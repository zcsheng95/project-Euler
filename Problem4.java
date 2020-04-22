import java.util.*;
public final class Problem4 implements EulerProblems{
	public static void main(String[] args) {
		System.out.println(new Problem4().run());
	}
	
// A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
// Find the largest palindrome made from the product of two 3-digit numbers.
	public String run() {
		int ans = 0;
		for(int i = (int)Math.pow(10, 3-1);i < Math.pow(10, 3);i++) {
			for(int j = (int)Math.pow(10, 3-1);j < Math.pow(10, 3); j+=1) {
				if(IsPalindromic(i*j)&& i*j > ans) {
					 ans = i*j;
				}
			}
		}
		return Integer.toString(ans);
	}
	
	
	private boolean IsPalindromic(int num) {
		String str = Integer.toString(num);
		int strlen = str.length();
		if(strlen %2 != 0) {
			return false;
		}
		else {
			StringBuilder input = new StringBuilder();
			input.append(str);
			input = input.reverse();
			String revstr = input.toString();
			if(str.equals(revstr)) {
				return true;
			}
			else {
				return false;
			}
		}
		
		
	}
	

}
