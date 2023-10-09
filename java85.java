public class java85
{
	static int x = 11;
	private int y = 33;
	public void method1(int x)
	{
		java85 t = new java85();
		this.x = 22;
		y = 44;

		System.out.println("Test.x: " + java85.x);
		System.out.println("t.x: " + t.x);
		System.out.println("t.y: " + t.y);
		System.out.println("y: " + y);
	}

	public static void main(String args[])
	{
		java85 t = new java85();
		t.method1(5);
	}
}
