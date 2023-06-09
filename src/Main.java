public class Main {
    public static void main(String[] args) {
        Clothing[] clothes = new Clothing[4];

        clothes[0] = new Tshirt(Size.XXS, 123, "Амарантово-розовый");
        clothes[1] = new Pants(Size.XS, 1234, "Бледно-каштановый");
        clothes[2] = new Skirts(Size.M, 12345, "Темный желто-зеленый");
        clothes[3] = new necktie(Size.L, 123456, "Каменно-серый");

        atelier atelier = new atelier();

        atelier.dressMan(clothes);
        atelier.dressWoman(clothes);
    }
}