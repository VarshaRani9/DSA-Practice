package bits;

public class Set_ithBit {

	public static void main(String[] args) {
		int n = 12;
		int k = 1;
		int mask = 1<<k;
		System.out.println((n|mask));
	}

}