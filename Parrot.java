public class Parrot extends Animal implements Walking, Climbing, Flying
{
    public Parrot(String name, String desc)
    {
        super(name, desc);
        
    }
   
    @Override
    public String makeNoise()
    {
        return "Hoot! Hoot! Hoot! ";
    }
    
    @Override
    public String play()
    {
        return "The parrot flys around you";
    }
    
    @Override
    public String eat()
    {
        return "The parrot eats penuts";
    }
    
    @Override
    public String walk()
    {
        return "The parrot walks slowly";
    }
    
    @Override
    public String climb()
    {
        return "The parrot climbs a tree like a champ";
    }
    
    @Override
    public String fly()
    {
        return "The parrot flys with its colorful wings";
    }
}