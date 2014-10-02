package stock;

import java.util.Date;
import java.util.Observable;
import java.util.Observer;

public class StockDataPriceDisplay implements Observer
{
	private double price;
	private Observable data;
	
	public StockDataPriceDisplay(Observable data)
	{
		this.data = data;
		data.addObserver(this);
	}
	

	@Override
	public void update(Observable arg0, Object arg1) 
	{
		if(arg0 instanceof StockData)
		{
			StockData data = (StockData) arg0;
			if(data.hasChanged())
			{
				this.price = data.getPrice();
			}
			
		}
	}
	
	private void display()
	{
		System.out.println("the price is " + price);
	}

}
