public class TestAmpoule {

	public static void main(String[] args) {
		Ampoule amp1 = new Ampoule(3500, 500);
		Ampoule amp2 = new Ampoule(5000, 1000);
		System.out.println(amp1);
		System.out.println(amp2);
		Ampoule amp3 = new Ampoule(amp2);
		System.out.println(amp3);
		int i = 0;
		while (i<10){
			amp1.allumer();
			amp1.eteindre();
			amp2.allumer();
			amp2.eteindre();
			++i;
		}

	}
}
