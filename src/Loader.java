
public class Loader {
    public static void main(String[] args) {
        int i;
        for ( i = 1; i<8; i++) {
            Cat cat = new Cat();
            String[] name = {"Пират", "Боливар", "Кристо", "Майк", "Джек", "Тонни", "Люци", "Грин", "Люк"};
            int n = (int) (Math.random() * 9);

            System.out.println(name[n] + ": " + cat.getWeight() + " грамм");
            cat.feed(cat.getWeight() * .1);
            System.out.println(cat.getFoodWheigh());
            cat.feed(cat.getWeight() * .1);
            System.out.println(cat.getFoodWheigh());
            cat.feed(cat.getWeight() * .1);
            System.out.println(cat.getFoodWheigh());
            cat.pee();
            System.out.println(cat.getFoodWheigh());
            System.out.println(cat.getCount());
        }

    }
}