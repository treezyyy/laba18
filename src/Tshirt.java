public class Tshirt extends Clothing implements womenClothing, menClothing{


    public Tshirt(Size size, int price, String color) {
        super(size, price, color);
    }

    @Override
    public void DressAMen() {
    }

    @Override
    public void DressAWomen() {
    }

    @Override
    void info() {
        System.out.printf(String.valueOf(size), color, price);
    }
}
