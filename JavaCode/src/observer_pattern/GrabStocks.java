package observer_pattern;

public class GrabStocks {
	
	public static void main(String[] args) {
		
		// Initialize subject
		StockGrabber stockGrabber = new StockGrabber();
		
		// New observer 1 (player) registers stock market
		StockObserver observer1 = new StockObserver(stockGrabber);
		
		// Notify stock price to observer 1
		stockGrabber.setIbmPrice(197.00);
		stockGrabber.setAaplPrice(677.00);
		stockGrabber.setGoogPrice(676.40);
		
		// New observer 2 (player) registers stock market
		StockObserver observer2 = new StockObserver(stockGrabber);
		
		// Notify stock price to both observer 1 and 2
		stockGrabber.setIbmPrice(197.00);
		stockGrabber.setAaplPrice(677.00);
		stockGrabber.setGoogPrice(676.40);
		
		// Unregister observer1. Observer 1 do not play stock market
		stockGrabber.unregister(observer1);
		
		// Notify only to observer 2
		stockGrabber.setIbmPrice(197.00);
		stockGrabber.setAaplPrice(677.00);
		stockGrabber.setGoogPrice(676.40);
		
		Runnable getIBM = new GetTheStock(stockGrabber, 2, "IBM", 197.00);
		Runnable getAAP = new GetTheStock(stockGrabber, 2, "AAP", 677.60);
		Runnable getGOOG = new GetTheStock(stockGrabber, 2, "GOOG", 676.40);
		
		new Thread(getIBM).start();
		new Thread(getAAP).start();
		new Thread(getGOOG).start();
	}

}
