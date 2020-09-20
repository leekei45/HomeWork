
public class Loader {
    public static void main(String[] args) {

            Cat cat = new Cat();
            String[] name = {"Пират", "Боливар", "Кристо", "Майк", "Джек", "Тонни", "Люци", "Грин", "Люк"};
            int n = (int) (Math.random() * 9);

            System.out.println(name[n] + ": " + cat.getWeight() + " грамм");


            Cat cat2 = cat.clon();
        System.out.println(name[n] + ": " + cat.getWeight() + " грамм");


    }
    public static Cat getKitten() {

        return  new Cat(1100.00);
    }
}