
public class TestA implements Formula{

	public static void main(String[] args) {
TestA a=new TestA();
System.out.println(a.sqrt(5));
System.out.println(a.calculate(3));
	}

	@Override
	public double calculate(int a) {
		return 0;
	}

}
