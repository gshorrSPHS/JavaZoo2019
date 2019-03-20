public class SeaTurtle extends Animal implements Walking, Swimming
{
    public SeaTurtle(String name, String desc)
    {
        super(name, desc);
    }
    
    @Override
    public String makeNoise()
    {
        return "nom";
    }
    
    @Override
    public String play()
    {
        return "The turtle plays around in the water.";
    }
    
    @Override
    public String eat()
    {
        return "The turtle eats algae.";
    }
    
    @Override
    public String walk()
    {
        return "The turtle slowly walks along on the shore.";
    }
    
    @Override
    public String swim()
    {
        return "The turtle enjoys swimming with the other turtles.";
    }
}
