package generics.Test;

public class RestrSome<A extends Number> {
	private A a;

	public RestrSome(A a) {
		super();
		this.a = a;
	}

	public A getA() {
		return a;
	}

	public void setA(A a) {
		this.a = a;
	}

	@Override
	public String toString() {
		return "RestrSome [a=" + a + "]";
	}
	

}
