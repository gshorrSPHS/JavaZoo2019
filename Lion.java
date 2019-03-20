public class Lion extends Animal implements Walking, Climbing
{
    public Lion(String name, String desc)
    {
        super(name, desc);
    }
    
    @Override
    public String walk()
    {
        return "The lion begins running towards you on all four legs";
    }
    
    @Override 
    public String climb()
    {
        return "The lion climbs into his den";
    }
    
    @Override 
    public String play()
    {
    return "The lion starts chasing his cub and rolling around in the grass";
   }    
    @Override
   public String makeNoise()
    {
        return "roarrrr";
    }
   
   
}
