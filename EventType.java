public class EventType {

    private static double economyPrice = 200.0;
    private static double standardPrice = 300.0;
    private static double deluxePrice = 400.0;

    /**
     * Pull prices of all event types,
     * @param plus-price - true if it is weekend period, false otherwise
     * @return array of doubles - prices of events
     * */
    public static double[] getPrices(boolean plusPrice) {
        double[] prices = new double[3];

                  // apply plus-price if necessary
      //  prices[0] = discount ? economyPrice * 0.8 : economyPrice;
      //  prices[1] = discount ? standardPrice * 0.8 : standardPrice;
      //  prices[2] = deluxePrice;

      //  return prices;
    }

    /** Give back the name of the particular eventType
     * @param option - integer from 1 to 3
     * @return name of the eventType
     * */
    public static String getName(int option) {
        switch (option){
            case 1:
                return "Economy";
            case 2:
                return "Standard";
            case 3:
                return "De Luxe";
            default:
                return "";
        }
    }
}