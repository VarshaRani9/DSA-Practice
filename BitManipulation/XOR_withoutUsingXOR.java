package bits;

public class XOR_withoutUsingXOR {

	public static void main(String[] args) {
		int n1 = 5;
		int n2 = 6;
		System.out.println((n1&~n2)|(n2&~n1));
		System.out.println((n1|n2)-(n2&n1));
	}

}
