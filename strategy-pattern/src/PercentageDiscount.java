public class PercentageDiscount implements DiscountStrategy {

    @Override
    public double calculateDiscount(double price){
        if(price < 1000){
            return (price/100)*10;
        }else if(price > 2000){
            return (price/100)*20;
        }else if(price >5000){
            return (price/100)*30;
        }
        return 0;
    }
}
