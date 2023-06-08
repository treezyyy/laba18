public class Main {
    public static void main(String[] args) {
        Clothing[] cloths = new Clothing[][4];

        cloths[0] = new Tshirt(Size.XXS, 500, "black");
        cloths[1] = new Pants(Size.XS, 1200, "green");
        cloths[2] = new Skirts(Size.M, 1000, "blue");
        cloths[3] = new necktie(Size.L, 900, "yellow");

        atelier studio = new Atelier();

        studio.dressMan(cloths);
        studio.dressWoman(cloths);
    }
}