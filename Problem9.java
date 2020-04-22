public final class Problem9 implements EulerProblems{
		public static void main(String[] args) {
			System.out.println(new Problem9().run());
		}
	public String run() {
		for(int a = 1; a < 333; a++) {
			for(int b = a + 1; b < 1000;b++) {
				int c = 1000 - a - b;
				if(c <= b) break;
				if(Math.pow(c, 2) == Math.pow(a,2)+Math.pow(b, 2)) {
					return Integer.toString(a*b*c);
				}
			}
		}
		return Integer.toString(0);
	}
}
