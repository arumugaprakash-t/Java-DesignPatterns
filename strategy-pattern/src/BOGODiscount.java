public class BOGODiscount implements DiscountStrategy{

    @Override
    public double calculateDiscount(double price){
        return price/2;
    }
}
