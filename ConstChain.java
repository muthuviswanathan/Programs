public class ConstChain 
{
	ConstChain()
	{
		this(4); // calling the parameterized custom/user-defined constructor of integer type (constructor chaining)
		System.out.println("I'm a non parameterized custom/user-defined constructor");
	}
	ConstChain(int a)
	{
		this("Hi"); // calling the parameterized custom/user-defined constructor of String type (constructor chaining)
		System.out.println("I'm a parameterized custom/user-defined constructor of integer type");
	}
	ConstChain(String s)
	{
		System.out.println("I'm a parameterized custom/user-defined constructor of String type");
	}
	public static void main(String[] args) 
	{
		new ConstChain();
	}
}