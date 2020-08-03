
public class Loader
{
    public static void main(String[] args)
    {
        int i;
        for ( i = 1; i<8; i++) {
        Cat cat = new Cat();
        String[] name = {"Пират", "Боливар", "Кристо", "Майк", "Джек", "Тонни", "Люци", "Грин", "Люк"};
        int n = (int) (Math.random() * 9);

        System.out.println(name[n] + ": " + cat.getWeight() + " грамм");
        if ( i == 6) {
            while (cat.getWeight() >= cat.minWeight()){
                cat.meow();
                if (cat.getWeight() <= cat.minWeight()) {
                    System.out.println(name[n] + " : " + cat.getStatus());
                    System.out.println(cat.getWeight() + " грамм");
                }
            }
        }
            if ( i == 7) {
                while (cat.getWeight() <= cat.maxWeight()){
                    cat.feed(cat.getWeight()/100);
                    if (cat.getWeight() >= cat.maxWeight()) {
                        System.out.println(name[n] + " : " + cat.getStatus());
                        System.out.println(cat.getWeight() + " грамм");
                    }
                }
            }
    }
    }
}