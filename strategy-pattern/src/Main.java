public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        DiscountStrategy discountStrategy = new BOGODiscount();
        Cart cart = new Cart(100);
        cart.setDiscountStrategy(discountStrategy);
        cart.showPriceAfterDiscount();

        DiscountStrategy percentageDiscount = new PercentageDiscount();
        cart.setDiscountStrategy(percentageDiscount);
        cart.showPriceAfterDiscount();

    }
}