
public class Cake {
	
	private int bites = 10;
	
	public Cake()
	{
		// nothing to implement
	}
	
	public void takeABite()
	{
		bites--;
		System.out.println("Hmm.. good");
	}

	public boolean isEmpty()
	{
		return bites == 0;
	}
}
