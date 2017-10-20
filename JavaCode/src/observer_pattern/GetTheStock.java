package observer_pattern;

import java.text.DecimalFormat;

public class GetTheStock implements Runnable{
	
	private int startTime;
	private String stock;
	private double price;
	
	private Subject stockGrabber;
	
	public GetTheStock(Subject stockGrabber, int newStartTime, String newStock,
			double newPrice) {
		
		this.stockGrabber = stockGrabber;
		this.startTime = newStartTime;
		this.stock = newStock;
		this.price = newPrice;
	}

	@Override
	public void run() {
		
		for(int i=1; i <= 20; i++) { // change price 20 times
			try {
				Thread.sleep(2000); // pause 2 seconds before execute program
			}catch(InterruptedException e) {}
			
			double randNum = (Math.random() * (.06)) - .03;
			
			DecimalFormat df = new DecimalFormat("#.##");
			
			price = Double.valueOf(df.format(price + randNum).replace(',', '.'));
			
			if (stock == "IBM") ((StockGrabber) stockGrabber).setIbmPrice(price);
			
			if (stock == "AAPL") ((StockGrabber) stockGrabber).setAaplPrice((price));
			
			if (stock == "GOOG") ((StockGrabber) stockGrabber).setGoogPrice((price));
			
			System.out.println(stock + ":" + df.format((price + randNum)) +
					" " + df.format(randNum));
			
			System.out.println();
			
		}
	}

}
