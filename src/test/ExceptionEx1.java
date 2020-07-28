package test;

public class ExceptionEx1 {
	public void main() {
		A a = new B();
		try {
			a.method();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

class B implements A {
	public void method() {
		
	}
}

interface A {
	void method() throws Exception;
}
