import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

/* we can eliminate the multiple nested if else in java application by using this map of lamda functions coding pratice */
public class DiscountService{
    private Map<String,Function<Double,Double>> discountStrategies = new HashMap<>();

    public DiscountService(){
        discountStrategies.put("WINTER_SALE", price -> price * 0.9);
        discountStrategies.put("SUMMER_SALE", price -> price * 0.8);
    }

    /* getOrDefault fetches the lamdafunction based on discount code  matching map key*/
    /* if no key in map matches the discount code Function.identity() returns the function which returns value unchanged*/
    /* if matched key found appropriate function is returned to getOrDefault() */
    /* then we call the lamda function with price to9 get the offer price */
    public double applyDiscount(String discountCode,double price){
        return discountStrategies.getOrDefault(discountCode, Function.identity()).apply(price);
    }
    
}
