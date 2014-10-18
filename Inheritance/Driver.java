public class Driver {

    public static void main(String[] args){
	Basechar c = new Basechar(),c2;
	Warrior w = new Warrior(),w2;
	Mage m = new Mage(),m2;

	w.setName("Groo");
	m.setName("Mr. Sage");

	w.attack(m);
	m.attack(w);
	w.attack(w);

<<<<<<< HEAD
	System.out.println(w.toString());
=======
	b2 = m1; // a superclass can be called into a subclass
	b2 = m2;
	b2 = new Warrior();
	

	w.setName("Groo");
	m.setName("Mr.Sage");
	
	w.attack(m);
	m.attack(w);
	attck(w);
	Warrior w = new Warrior("Groo");
>>>>>>> b753c631054fe780cdeeac3bcb164ffb28538210
	System.out.println(w);
    }


}
