import java.util.*;
public final class Problem7 implements EulerProblems{
	public static void main(String[] args) {
		System.out.println(new Problem7().run());
	}
	public String run() {
		int count = 0, i = 1;
		while(count < 10001) {
			i++;
			if(Isprime(i)) {
				count++;
			}
		}
		return Integer.toString(i);
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
