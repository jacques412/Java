
public class Cat extends Animal {

	int livesleft = 9;
	
	public Cat(String Name, int livesleft)
	{
		super(Name);
		livesleft = this.livesleft;

	}
	public int getLivesLeft()
	{
		return livesleft;
	}
	
	public void loselife()
	{
		if (livesleft>0)
		{
		livesleft -= 1;
		}
		else
		{
			System.out.println("The cat is dead");
		}
	}
	public String toString()
		{
		    return super.toString() + " lives left: " + livesleft;
		}		
}	
	