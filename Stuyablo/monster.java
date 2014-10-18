public class monster extends basechar { 
    public void monster() { 
	setHealth(60);
	setStrength(60);
    }
    public void evilAttack(basechar, other) {
	System.out.println(this + "evilAtacked"+other);
    } 
}
