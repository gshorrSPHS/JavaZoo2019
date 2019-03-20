public class Sasquatch extends Animal implements Swimming, Walking, Climbing
{
    public Sasquatch(String name, String desc)
    {
      super(name, desc);  
    }
    
    @Override
    public String makeNoise()
    {
        return "Grahh humbug!";
    }
    
    @Override
    public String swim()
    {
        return "The sasquatch swims across the lake.";
    }
    
    @Override
    public String climb()
    {
        return "The sasquatch slowly climbs the tree.";
    }
    
    @Override
    public String walk()
    {
        return "The sasquatch walks with a cocky strut";
    }
    
    @Override
    public String eat()
    {
        return "The sasquatch devours the silly campers, eating them whole.";
    }
    
    @Override
    public String play()
    {
        return "The sasquatch plays jumprope with his other sasquatch friends.";
    }
    
}