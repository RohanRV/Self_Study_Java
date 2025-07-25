class A
{
	int y;
	void a(){
		int x;
		System.out.println("a");
		System.out.println(y);
	}
}
/*interface A
{
	void a(){
		System.out.println("a");
	}	
}*/

class B extends A
{
	void b(){
		System.out.println("b");
	}
}
class C
{
	public static void main(String args[])
	{
		A obj = new B();
		//obj.b();
		obj.a();
	}
}