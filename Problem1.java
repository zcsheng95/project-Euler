import java.util.*;

public final class Problem1 implements EulerProblems{
	public static void main(String[] args) {
		System.out.println(new Problem1().run());
	}
  //If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
  //Find the sum of all the multiples of 3 or 5 below 1000.
	
	public String run() {
		int ans = 0;
		int i = 1;
		while(i < 1000) {
			if(i%3 == 0 | i% 5 == 0) {
			ans = ans + i;
			}
			i++;
			
		}
		return Integer.toString(ans);
	}
}
