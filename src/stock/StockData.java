package stock;

import java.util.Observable;

public class StockData extends Observable 
{
	private long time;
	private double price;
	
	private void getData()
	{
		//make connection to server and get data back
		this.time = System.currentTimeMillis();
		this.price = Math.random();
	}
	
	public long getTime()
	{
		return time;
	}
	
	public double getPrice()
	{
		return price;
	}

}
