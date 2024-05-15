public class Test
{

	public static void main(String[] args)
	{
		Animal a = new Animal(5, 25) ;
		System.out.println(a);


		Chat c1 = new Chat(4, 18, 3);
		System.out.println(c1.getAge());
		System.out.println(c1.getLongMous());

		System.out.println(c1);

		Chat c2 = new Chat(4, 18, 3);

		System.out.println(c1.equals(c2));

		c1.crier();
	}


}
