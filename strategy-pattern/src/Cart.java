public class Cart {
    private double price;
    private DiscountStrategy discountStrategy;

    public Cart(double price){
        this.price = price;
    }

    public void showPriceAfterDiscount(){
        if(discountStrategy==null){
            System.out.printf("Cart price is %f \n",price);
        }
        System.out.printf("Cart price is %f \n",price - discountStrategy.calculateDiscount(price));
    }

    public void setDiscountStrategy(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }
}
