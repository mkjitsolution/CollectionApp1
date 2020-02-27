package p1;

class Test{
	
	void hello() {}
}

public class DemoClass {

	public static void main(String[] args) {
		
		Test t = new Test();
		
		t.hello();
		
		new Test().hello();
	}
}
