class Typecasting {
	public static void main(String args[]) {
		byte   a = 5;
		short  b = a;
		char   c = 'b'; // c = b throws error
		int    d = c;
		long   e = d;
		float  f = e;
		double g = f;
		System.out.println("a " +a);
		System.out.println("b " +b);
		System.out.println("c " +c);
		System.out.println("d " +d);
		System.out.println("e " +e);
		System.out.println("f " +f);
		System.out.println("g " +g);

		System.out.println("------------");

		double a1 = 60.12345678901234567890;
		float  b1 = (float)a1;
		long   c1 = (long)b1;
		int    d1 = (int)c1;
		char   e1 = (char)d1;
		short  f1 = (short)e1;
		byte   g1 = (byte)f1;
		System.out.println("a1 " +a1);
		System.out.println("b1 " +b1);
		System.out.println("c1 " +c1);
		System.out.println("d1 " +d1);
		System.out.println("e1 " +e1);
		System.out.println("f1 " +f1);
		System.out.println("g1 " +g1); }}