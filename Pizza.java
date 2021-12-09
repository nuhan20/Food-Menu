class Pizza  extends Fooditem
	{
		String size;
		
		Pizza()
		{
			super();
			size="big";
		}
		
		Pizza(String size,double price,String name)
		{
			super(price,name);
			this.size=size;
		}
		
		void setsize(String size)
		{
			this.size=size;
		}
		
		String getside()
		{
			return size;
		}
		
		void display1()
		{
			showdetails();
			System.out.println(size);
		}

	}