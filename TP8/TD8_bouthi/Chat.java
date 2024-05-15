public class Chat extends Animal{


    private int longueur_moustache;

    public Chat(int unAge, int unPoids, int long_mous){
        super(unAge,unPoids);
        this.longueur_moustache = long_mous;
    }

    public int getLongMous(){
        return this.longueur_moustache;
    }

    public boolean equals(Object o){
        if (o == null)
			return false ;

		if (this.getClass() != o.getClass())
			return false ;

        /* o pointe sur un objet de meme classe que this */
				/* (au moins la classe Animal ou un descendant)  */

        Chat c = (Chat) o ;

		return super.equals(o) && this.getLongMous()== c.getLongMous();
    }

    public String toString()
	{
		return "Chat"                     + "\n" +
		      super.toString()          +  
			   "longueur moustache : " + this.getLongMous() + "\n" ;  
	}

    public void crier()
	{
		System.out.println("je miaule") ;
	}
}

