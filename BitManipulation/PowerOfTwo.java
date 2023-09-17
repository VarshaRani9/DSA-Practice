package bits;

public class PowerOfTwo {

	public static void main(String[] args) {
		int n = 16;
		System.out.println((n&(n-1))==0?"True":"False");
	}

}
