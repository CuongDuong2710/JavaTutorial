package observer_pattern;

/**
 * Player in stock market will be update about stock price
 * @author QUOC CUONG
 *
 */
public class StockObserver implements Observer {

	// Prices of stock player is grabbed
	private double ibmPrice;
	private double aaplPrice;
	private double googPrice;
	
	// To be used as a counter. 
	private static int observerIDTracker = 0;
	
	// Attach a special number to track each one of the observers
	private int observerID;
	
	private Subject stockGrabber;
	
	/**
	 * Each player registers stock market and have its own ID
	 * @param stockGrabber
	 */
	public StockObserver(Subject stockGrabber) {
		
		this.stockGrabber = stockGrabber;
		
		// give each observer its own ID
		this.observerID = ++observerIDTracker;
		
		System.out.println("New Observer " + this.observerID);
		
		// Player registers into stock market
		this.stockGrabber.register(this);
	}
	
	/**
	 * Each player will be notify about any state changes of stock
	 */
	@Override
	public void update(double ibmPrice, double aaplPrice, double googPrice) {
		this.ibmPrice = ibmPrice;
		this.aaplPrice = aaplPrice;
		this.googPrice = googPrice;
		
		printThePrices();
	}

	/**
	 * Printing the stock price of IBM, Apple and Google
	 */
	private void printThePrices() {
		System.out.println(observerID + "\nIBM: " + ibmPrice +
				"\nAAPL: " + aaplPrice + "\nGOOG: " + googPrice + "\n");
	}

}
