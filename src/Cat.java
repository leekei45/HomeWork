
public class Cat
{
    private double originWeight;
    private double weight;
    private double weightPlus;
    private double result;
    public static final int NUMBER_OF_EYES = 2;

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
        weight = weight - 1;
        System.out.println("Meow");
    }

    public double getFoodWheigh() {
        return result;
            }

    public void pee()
    {
        weight = weight - (weight * .05);
        System.out.println("...");
    }

    public void feed(Double amount)
    {
        weight = weight + amount;
        weightPlus = amount;
        result = result + weightPlus;
    }

    public void drink(Double amount)
    {
        weight = weight + amount;
    }

    public Double getWeight()
    {
        return weight;
    }

    public String getStatus()
    {
        if(weight < MIN_WEIGHT) {
            count--;
            return "Dead";
        }
        else if(weight > MAX_WEIGHT) {
            count--;
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