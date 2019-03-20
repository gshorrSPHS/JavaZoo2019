public class TrippedHummingBird extends Hummingbird
{
    public TrippedHummingBird(String name, String desc)
    {
        super(name, desc);
    }
    
    @Override
    public String makeNoise()
    {
        return "OUCH! Hum Hummmm" + super.makeNoise();
    }
    @Override
    public String play()
    {
        return "The tripped Hummingbird falls off from the lemon tree.";
    }
    @Override
    public String eat()
    {
        return "The tripped Hummingbird doesn't want to eat anything.";
    }
    @Override
    public String fly()
    {
        return "The tripped Hummingbird can't fly anymore, but she still calls his friends over.";
    }
    @Override
    public String climb()
    {
        return "The tripped Hummingbird can't climb anymore.";
    }
}
