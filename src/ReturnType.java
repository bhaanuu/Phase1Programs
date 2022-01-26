class ReturnType
{
int add(int a, int b)
{
return a+b;
}
float sub(int a, int b)
{
return a-b;
}
void div(int a, int b)
{
System.out.println(a/b);
}

public static void main(String[] args)
{
ReturnType t = new ReturnType();
System.out.println(t.add(3,6));
System.out.println(t.sub(3,6));
t.div(6,6);
}
}