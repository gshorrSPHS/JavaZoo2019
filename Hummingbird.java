public class Hummingbird extends Animal implements Flying, Climbing

{
    public Hummingbird(String name, String desc)
    {
        super(name, desc);
    }

    @Override
    public String makeNoise()
    {
        return "Hum Hummmm";
    }
    @Override
    public String play()
    {
        return "The Hummingbird flies around a lemon tree.";
    }
    @Override
    public String eat()
    {
        return "The Hummingbird eats insects to protect her lemon tree.";
    }
    @Override
    public String fly()
    {
        return "The Hummingbird flies with 10000 of her friends.";
    }
    @Override 
    public String climb()
    {
        return "The Hummingbird climbs to the top of the lemon tree.";
    }
}
