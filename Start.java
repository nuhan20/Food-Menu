class Start
{

	public static void main(String[] args)
	{
		Pizza p=new Pizza();
		p.display1();
		Pizza p1=new Pizza("big",120.00,"Pizza");
		p1.display1();
		
		Burger b=new Burger();
		b.display2();
		Burger b1=new Burger(8,130,"Burger");
		b1.display2();
	}

}