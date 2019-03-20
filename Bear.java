public class Bear extends Animal implements Walking, Climbing
{
    public Bear(String name, String desc)
    {
        super(name, desc);
    }
    
    @Override
    public String makeNoise()
    {
        return "rawr";
    }
    
    @Override // same method name & params as the superclass
              // this class makes its own body that's different
    public String play()
    {
        return "The bear rolls over and paws the air";
    }
    
    @Override
    public String eat()
    {
        return "The bear eats fish in a huckleberry sauce.";
    }
    
    @Override
    public String walk()
    {
        return "The bear casually strides toward you.";
    }
    
    @Override
    public String climb()
    {
        return "The bear gives a bear hug to the tree and shimmies up.";
    }
    
}