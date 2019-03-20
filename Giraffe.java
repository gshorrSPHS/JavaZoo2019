
public class Giraffe extends Animal implements Walking
{
    public Giraffe(String name, String desc)
    {
        super(name, desc);
    }
    
    @Override
    public String makeNoise()
    {
        return " chomp ";
    }
    @Override
    public String play()
    {
        return "The giraffe stick his toungue out and bend down to meet you.";
    }
    @Override
    public String eat()
    {
        return "The giraffe reaches up and eats the leaves off the top of the tree.";
    }
    @Override
    public String walk()
    {
        return "The giraffe walks along above everyone else";
    }
}

