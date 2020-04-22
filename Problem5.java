import java.util.*;

public final class Problem5 implements EulerProblems{
	public static void main(String[] args) {
		System.out.println(new Problem5().run());
	}
// 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

// What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?

	public String run() {
		int ans = 1;
		for(int i = 2; i < 20; i++) {
			int check = findMax(i, 20);
			if(check == i && Isprime(i)) {
				ans = ans * i;
			}
			else if(check != i && ans%check!=0)ans = ans * check;
			else continue;

			System.out.println(ans);
		}
		
		return Integer.toString(ans);
		
	}
	
	
	private boolean Isprime(int m) {
		int k = 2;
		while(k <= Math.sqrt(m)) {
			if(m%k == 0) return false;
			k+=1;
		}
		return true;
	
	}
	
	private int findMax(int input, int max) {
		int cp = input;
		while(cp < max) {
		if(cp * input > max) {
		 break;
		}
		cp = cp * input;
		}
		
		return cp;
		
	}

}
