
public final class p12 implements EulerProblems {
	public static void main(String[] args) {
		long startTime = System.nanoTime();	
		System.out.println(new p12().run());
		long endTime = System.nanoTime();
	    System.out.println((endTime - startTime)/1000000000.0); 
	}
	
	public String run() {
		//triangle numbers
		int N = 500;
		boolean t =  true;
		long n = 1;
		long x = 1;
		//x = n(n+1)/2
		while(t) {
			int count = 0;
			x = n * (n+1)/2;
			for(long j = 1; j <= Math.sqrt(x); j++) {
				if(x % j ==0) {
					count+=2;
				}
				if (count == N) {
					t = false;
					break;
				}
			}
			n+=1;
			
		}
		return Long.toString(x);
	}
}


