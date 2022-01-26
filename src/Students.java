
public class Students {
	int Id;
	String Name;
	String Subject;
	float Marks;
	Students()
	{
		System.out.println("0-arg Constructor");
	}
	Students(int Id, String Name, String Subject, float Marks)
	{
		System.out.println(this.Id = Id);
		System.out.println(this.Name = Name);
		System.out.println(this.Subject = Subject);
		System.out.println(this.Marks= Marks);
	}
	public static void main(String args[])
	{
		new Students();
		new Students(1, "Me", "Maths", 95);
		new Students(2, "U", "Maths", 90);
		
	}
}
