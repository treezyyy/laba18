public class atelier {
    public void dressMan(Clothing[] cloths) {
        System.out.println("Мужская одежда: ");
        for (Clothing cloth: cloths){
            if(cloth instanceof menClothing){
                cloth.info();
                ((menClothing) cloth).DressAMen();
            }
        }
    }

    public void dressWoman(Clothing[] cloths) {
        System.out.println("\nЖенская одежда: ");
        for (Clothing cloth: cloths){
            if(cloth instanceof womenClothing){
                cloth.info();
                ((womenClothing) cloth).DressAWomen();
            }
        }
    }
}