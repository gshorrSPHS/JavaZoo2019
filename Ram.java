public class Ram extends Animal implements Walking, Climbing
{
    public Ram(String name, String desc)
    {
        super(name, desc);
    }
    
    @Override
    public String makeNoise()
    {
        return "rawr";
    }
    
    @Override
    public String play()
    {
        return "The runs and rams into another ram due to an agressive fight.";
    }
    
    @Override
    public String eat()
    {
        return "The ram eats seeds, grass, and plants.";
    }
    
    @Override
    public String walk()
    {
        return "The ram strolls on some grass.";
    }
    
    @Override
    public String climb()
    {
        return "The ram walks on an almost vertical mountainside.";
    }
}