
public final class Problem12 implements EulerProblems {
	public static void main(String[] args) {
		long startTime = System.nanoTime();	
		System.out.println(new Problem12().run());
		long endTime = System.nanoTime();
	    System.out.println((endTime - startTime)/1000000000.0); 
	}
	
	public String run() {
		//triangle numbers
		int N = 500;
		int divisor = 1;
		int x = 2;
		int d1,store=1;
		while(divisor <= N) {
			//even
			if(x % 2 == 0 ) {
				d1 = numDiv(x+1);
				divisor = store * d1;
				store = d1;
			} else {
				d1 = numDiv((x +1)/2);
				divisor = store * d1;
				;
			}
			System.out.println(divisor);
			x++;
		}
		return Integer.toString(x*(x-1)/2);
	}
	
	private int numDiv(long num) {
		int total = 1;
		for(long j = 2;j <= num;j++) {
			if(Isprime(j)) {
				int count = 0;
				while(num % j == 0) {
					num = num / j;
					count++;
				}
				total = total * (count + 1);
			}
		}
		return total;
		
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
