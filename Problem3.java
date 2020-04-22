import java.util.*;

public final class Problem3 implements EulerProblems{
		public static void main(String[] args) {
			System.out.println(new Problem3().run());
		}
	//The prime factors of 13195 are 5, 7, 13 and 29.
// What is the largest prime factor of the number 600851475143 ?
	public String run() {
		long p = 2;
		long ans = 600851475143L;
		long k = 600851475143L;
		while(p <= Math.sqrt(k)) {
			if(Isprime(p) && k%p == 0) {
				ans = p;
				k = k/p;
				System.out.println(ans);
				if(!Isprime(k)) {continue;}
				else {
				 ans = Math.max(ans, k);
				 return Long.toString(ans);
				}
			}
			p+=1;
		}
		return Long.toString(ans);
	}


	private boolean Isprime(long m) {
		int k = 2;
		while(k <= Math.sqrt(m)) {
			if(m%k == 0) return false;
			k+=1;
		}
		return true;
	
	}
}