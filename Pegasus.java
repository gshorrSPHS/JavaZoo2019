public class Pegasus extends Animal implements Walking, Flying 
{
    public Pegasus(String name, String desc)
    {
        super(name, desc);
    }
    
    @Override 
    public String makeNoise()
    {
        return "elo";
    }
    
    @Override 
    public String play()
    {
        return "The pegasus runs through the rainbow";
    }
    
    @Override 
    public String eat()
    {
        return "The pegasus munches on a carrot";
    }
    
    @Override 
    public String walk()
    {
        return "The pegasus walks";
    }
    
    @Override 
    public String fly()
    {
        return "The pegasus flaps its wing and flies out of sight";
    }
}