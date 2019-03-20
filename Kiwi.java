public class Kiwi extends Animal implements Swimming, Walking
{
    public Kiwi(String name, String desc)
    {
        super(name, desc);
    }
    
    @Override
    public String makeNoise()
    {
        return "cheep";
    }
    
    @Override
    public String play()
    {
        return "The kiwi bird pokes the ground, and falls over.";
    }
    
    public String eat()
    {
        return "The kiwi bird eats grass and worms.";
    }
    
    @Override
    public String walk()
    {
        return "The kiwi bird is very small and has to hop instead of walking.";
    }
    
    @Override
    public String swim()
    {
        return "The kiwi bird floats along the water, looking cute.";
    }
    
}
