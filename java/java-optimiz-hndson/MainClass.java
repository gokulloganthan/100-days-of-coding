public class MainClass{

    public static void main(String[] args) {
        var status = OrderStatus.NEW;

        //discount service with map of lamda functions to eliminate if else
        DiscountService discountService = new DiscountService();
        var winterOffAmt = discountService.applyDiscount("WINTER_SALE",310);
        System.out.println(winterOffAmt);
    
        System.out.println(status);
    }
}