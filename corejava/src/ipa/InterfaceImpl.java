package ipa;

public class InterfaceImpl implements Interface1,Interface2{

	@Override
	public void add1() {
		System.out.println("overriden call");
	}
	public static void main(String[] args) {
		InterfaceImpl i1 = new InterfaceImpl();
		i1.add1();
	}

}
