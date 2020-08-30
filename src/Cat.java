
public class Cat
{
    private double originWeight;
    private double weight;
    private double weightPlus;
    private double result;

    private double minWeight;
    private double maxWeight;
    private static Integer count = 0;

    public Cat()
    {
        count++;
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        minWeight = 1000.0;
        maxWeight = 9000.0;

    }

    public static Integer getCount() {
        return count;
    }

    public double minWeight() {
        return minWeight;
}

    public double maxWeight() {
        return maxWeight;
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
        if(weight < minWeight) {
            count--;
            return "Dead";
        }
        else if(weight > maxWeight) {
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