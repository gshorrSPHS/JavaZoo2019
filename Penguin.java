public class Penguin extends Animal implements Walking, Swimming
{    
public Penguin(String name, String desc)
    {
        super(name, desc);
    }
    
    @Override
    public String makeNoise()
    {
        return "peep";
    }
    
    @Override // same method name & params as the superclass
              // this class makes its own body that's different
    public String play()
    {
        return "The penguin glides on the floor on its stomach.";
    }
    
    @Override
    public String swim()
    {
        return "The penguin dives into the icy water";
    }
    
    @Override
    public String eat()
    {
        return "The penguin snatches a tuna from thin air.";
    }
    
    @Override
    public String walk()
    {
        return "The penguin waddles around you.";
    }
    
    
}