
class A {
	public  void methodA() {
		System.out.println("class A");
	}
}
class B  extends A
{
	public  void methodA() {
		System.out.println("class B");
	}
}

class Driver{
	public static void main(String[] args) {
		//		A a1=new A();
		//B b1=new B();

		A a=new B();
		a.methodA();
		B b=(B)a;
		b.methodA();

	}
}
