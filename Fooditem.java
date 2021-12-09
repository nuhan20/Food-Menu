class Fooditem
	{
		double price;
		String name;
		
		Fooditem()
		{
			price=100;
			name="sokipur food";
		}
		
		Fooditem(double price,String name)
		{
			this.price=price;
			this.name=name;
		}
		
		void setprice(double price)
		{
			this.price=price;
			
		}
		
		void setname(String name)
		{
			this.name=name;
		}
		
		double getprice()
		{
			return price;
		}
		
		String getname()
		{
			return name;
		}
		
		void showdetails()
		{
			System.out.println("food price:"+price+"food name:"+name);
		
		}


	}