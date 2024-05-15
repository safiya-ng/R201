public class Animal 
{
	private int age ;
	private int poids ;

	public Animal(int unAge, int unPoids)
	{
		this.age   = unAge ;
		this.poids = unPoids ;
	}

	public boolean equals(Object o)
	{
		if (o == null)
			return false ;

		if (this.getClass() != o.getClass())
			return false ;

				/* o pointe sur un objet de meme classe que this */
				/* (au moins la classe Animal ou un descendant)  */
		Animal a = (Animal) o ;

		return this.getAge()    == a.getAge() &&
		        this.getPoids() == a.getPoids() ;
	}

	public int getPoids()
	{
		return this.poids ;
	}

	public int getAge()
	{
		return this.age ;
	}

	public String toString()
	{
		return "Animal"                     + "\n" +
		       "age   : " + this.getAge()   + "\n" +
			   "poids : " + this.getPoids() + "\n" ;  
	}

	public void crier()
	{
		System.out.println("je crie") ;
	}
}
