package ipa;

class St1 {
	static {
		System.out.println("hii 1 static");
	}
}

class St2 {
	static {
		System.out.println("hii 2 static");
	}
	public St2() {
		System.out.println("st2 const call");
	}
}

public class StaticCheck {
	static{
		System.out.println("main static");
	}
	static String e3;
	public static void main(String[] args) {
		System.out.println(e3.length());
		St2 s2 = new St2();
	}
}
