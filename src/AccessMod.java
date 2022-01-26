public class AccessMod {
	private AccessMod()
	{
		System.out.println("Private Constructor");
	}
	int Method()
	{
		System.out.println("Public Method");
		return 0;
	}
	public static void main(String[] args)
	{
		AccessMod a = new AccessMod();
		a.Method();
	}

}
