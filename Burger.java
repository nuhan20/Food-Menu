class Burger extends Fooditem
{

	int numberofpatties;
	
	Burger()
	{
		super();
		numberofpatties=3;
	}
	
	Burger(int numberofpatties,double price,String name)
	{
		super(price,name);
		this.numberofpatties=numberofpatties;
	
	}
	
	
	void setnumberpatties(int numberofpatties)
	{
		this.numberofpatties=numberofpatties;
	
	}
	
	int getnumberpatties()
	{
		return numberofpatties;
	
	}
	
	void display2()
	{
	showdetails();
	System.out.println(numberofpatties);
	}
}