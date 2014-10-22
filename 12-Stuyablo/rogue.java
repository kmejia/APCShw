import java.util.Random;
public class rogue extends basechar
{
	Random randomNumber = new Random();
    public rogue(String n)
    {
	setStrength(65 + randomNumber.nextInt(20));
	setHealth(65 + randomNumber.nextInt(20));
	setSpeed(140 + randomNumber.nextInt(20));
	setName(n);
    }
    public void slash(basechar other)
    {

	this.setAttackStrength(this.getSpeed()/10 + randomNumber.nextInt(20)); 
	System.out.println(this.getName() + " SLASHES " +other);
	other.setDefending(true);
    }
    public void dodge(basechar other)
    {
	System.out.println(this.getName() + " is trying to DODGE " + other.getName() + "'s attack");
	boolean success = new Random().nextInt(20) <= this.getSpeed();
	if (success)
	    {
		other.setAttackStrength(0);
		System.out.println("DODGE was effective! No damage is taken!");
	    }
	else
	    {
		System.out.println("DODGE failed." + this.getName() + " took damage");
	    }

    }
    






}
