public class Koala extends Animal implements Climbing
{
    public Koala(String name, String desc)
    {
        super(name, desc);
    }

    @Override
    public String makeNoise()
    {
        return "Do koala make noice?";
    }
    
    @Override
    public String eat()
    {
        return "The koala eats eucalyptus leaves. ";
    }
    
    @Override
    public String play()
    {
        return "...";
    }
    
    @Override
    public String climb()
    {
        return "This is koala's favorite tree. \n " +
        "She is up there for 6 hours already.";
    }
}
