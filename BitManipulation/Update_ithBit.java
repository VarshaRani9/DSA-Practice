package bits;

public class Update_ithBit {

	public static void main(String[] args) {
		int n = 7;
		int k = 2;
		int bit = 0;
//		clear i-th bit
		n = n&(~(1<<k));
		int mask = bit<<k;
		System.out.println(n|mask);
	}

}
