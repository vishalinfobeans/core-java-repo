package ipa;


public class TryCatchReturnCheck {

	static
	int i;
	private static int myMeth() {
		try {
			System.out.println(9/80);
			return 1;
		} catch (Exception de) {
			System.out.println("catch " +de);
			return 2;
		} finally {
			System.out.println("finally"+i);
			return 3;
		}
		//System.out.println("resto fo\f");		//error line
		//return 8; //error line
	}

	public static void main(String[] args) {
		System.out.println(TryCatchReturnCheck.myMeth());
	}
}
