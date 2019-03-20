public class Macaw extends Parrot
{
    public Macaw(String name, String desc)
    {
        super(name, desc);
    }
    
    @Override
    public String eat()
    {
        return "The macaw eats Brazil Nuts";
    }
    
    @Override
    public String makeNoise()
    {
        return "The macaw says Hello, how are you?";
    }
    
    @Override
    public String play()
    {
        return "The macaw gives you a high-five";
    }
    
    @Override
    public String walk()
    {
        return "The macaw rides a skateboard because he doesn't want to walk";
    }
}