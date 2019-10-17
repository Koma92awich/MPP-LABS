package lesson8Labs;

import java.util.function.Function;

public class MyClass {

	String k;
	int m;

	public MyClass(String k, int m) {
		this.k = k;
		this.m = m;

	}

	@Override

	public boolean equals(Object obj) {

		if (obj == null)
			return false;

		if (!(obj instanceof MyClass))
			return false;

		MyClass myclass = (MyClass) obj;
		return myclass.k.equals(k) && myclass.m == m;

	}

	public boolean myMethod(MyClass ob) {
		Function<MyClass, Boolean> bif = this::equals;  // x -> this.equals(x)
		return bif.apply(ob);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyClass mc = new MyClass("Godfrey", 17);
		MyClass mc1 = new MyClass("Gody", 17);
		System.out.println(mc.myMethod(mc));
		System.out.println(mc.myMethod(mc1));

	}

}
