public class Flerken extends Animal implements Walking, Climbing
{
    public Flerken(String name, String desc)
    {
        super(name, desc);        
    }
    
    @Override
    public String makeNoise()
    {
        return "Meow";
    }
    
    @Override
    public String play()
    {
        return "The flerken stretches and rolls around, purring in delight.";
    }
    
    @Override
    public String eat()
    {
        return "The flerken nibbles on some fish.";
    }
    
    @Override
    public String walk()
    {
        return "The flerken strides quietly towards you.";
    }
    
    @Override
    public String climb()
    {
        return "The flerken disappears around a corner and reappears on a tree nearby.";
    }
}
