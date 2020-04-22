import java.util.*;

public final class Problem6 implements EulerProblems{
	public static void main(String[] args) {
		System.out.println(new Problem6().run());
	}
	
	public String run() {
		int ans = 0 , sqans=0,i=1;
		while(i < 100+1) {
			sqans = sqans + (int)Math.pow(i, 2);
			ans = ans + i;
			i++;
		}
		ans = (int)Math.pow(ans, 2)-sqans;
		return Integer.toString(ans);
	}
}

