public class atelier {
    public void dressMan(Clothing[] cloths) {
        System.out.println("Men's clothing:");
        for (Clothing cloth: cloths){
            if(cloth instanceof menClothing){
                cloth.info();
                ((menClothing) cloth).DressAMen();
            }
        }
    }

    public void dressWoman(Clothing[] cloths) {
        System.out.println("Women's clothing:");
        for (Clothing cloth: cloths){
            if(cloth instanceof womenClothing){
                cloth.info();
                ((womenClothing) cloth).DressAWomen();
            }
        }
    }
}