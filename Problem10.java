
public final class Problem10 implements EulerProblems{
		public static void main(String[] args) {
			long startTime = System.nanoTime();
			System.out.println(new Problem10().run());
			long endTime = System.nanoTime();
		    System.out.println((endTime - startTime)/1000000000.0); 			
		    }
		
	public String run() {
		long ans = 0, i = 2;
		while(i <= 2e6) {
			if(Isprime(i))ans = ans + i;
			i+=1;
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

