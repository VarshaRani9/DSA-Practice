
package bits;

public class Find_ithBit {

	public static void main(String[] args) {
		int n = 20;
		int k = 2;
		int mask = (1<<k);
		System.out.println((n&mask)>0?"1":"0");
	}

}
