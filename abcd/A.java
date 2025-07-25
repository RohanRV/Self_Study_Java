package abcd;

public class A{
	protected int x = 10;

	public static void main(String args[]){
		A a = new A();
		System.out.println("a "+a.x); }

	public void b() {
		A a = new A();
		System.out.println("b "+a.x); }}