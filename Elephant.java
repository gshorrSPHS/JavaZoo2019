public class Elephant extends Animal implements Walking, Swimming
{
    public Elephant(String name, String desc)
    {
        super(name, desc);
    }
    
    public String makeNoise()
    {
        return "Trumpetttttt";
    }
    
    @Override
    public String play()
    {
        return "The elephant plays in mud and rolls around in it.";
    }
    
    @Override
    public String eat()
    {
        return "The elephant eats peanuts.";
    }
    
    @Override
    public String walk()
    {
        return "The elephant slowing moves towards the closest human.";
    }
    
    @Override
    public String swim()
    {
            return "The elephant had to cross the river so it swam across.";
    }
}
