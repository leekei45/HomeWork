
public class Cat
{
    private double originWeight;
    private double weight;
    private double weightPlus;
    private double result;
    public static final int NUMBER_OF_EYES = 2;
    private String  color;


    private static final double MIN_WEIGHT = 1000.0;
    private static final double MAX_WEIGHT= 9000.0;
    private static Integer count = 0;
    private  double minWeight;
    private  double maxWeight;

    public Cat()
    {
        count++;
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;



    }

    public void setColor (String color){

         this.color = color;
    }
     public String getColor (){
        return color;
     }
    public Cat (double weight)
    {
        this.weight = weight;

    }

    public static Integer getCount() {
        return count;
    }

    public double minWeight() {
        return MIN_WEIGHT;
}

    public double maxWeight() {
        return MAX_WEIGHT;
    }

    public void meow()
    {
        if (weight > minWeight) {
            weight = weight - 1;
            System.out.println("Meow");
            if (weight <= minWeight) {
                getStatus();
                count--;
            }
        }
        else {getStatus();}
    }

    public double getFoodWheigh() {
        return result;
            }

    public void pee()
    {
        if (weight > minWeight) {
            weight = weight - (weight * .05);
            System.out.println("...");
             if (weight <= minWeight) {
             getStatus();
             count--;
            }
        }
        else {getStatus();}
    }

    public void feed(Double amount)
    {
        if (weight > minWeight) {
            weight = weight + amount;
            weightPlus = amount;
            result = result + weightPlus;
            if (weight <= minWeight) {
                getStatus();
                count--;
            }
        }
        else {getStatus();}
    }

    public void drink(Double amount)
    {
        if (weight > minWeight) {
            weight = weight + amount;
            weightPlus = amount;
            result = result + weightPlus;
            if (weight <= minWeight) {
                getStatus();
                count--;
            }
        }
        else {getStatus();}
    }

    public Double getWeight()
    {
        return weight;
    }

    public String getStatus()
    {
        if(weight < MIN_WEIGHT) {

            return "Dead";
        }
        else if(weight > MAX_WEIGHT) {

            return "Exploded";
        }
        else if(weight > originWeight) {
            return "Sleeping";
        }
        else {
            return "Playing";
        }
    }
}