
public class Unicorn extends Animal implements Walking, Swimming
{
    public Unicorn(String name, String desc)
    {
        super(name, desc);
    }

    public String makeNoise()
    {
        return "Neigh *but magical*";
    }

    public String play()
    {
        return "The Unicorn plays tag with a friendly puppy";
    }

    @Override 
    public String eat()
    {
        return "The unicorn eats lucky charms";
    }
    
    public String walk()
    {
        return "The unicorn walks with style and magic";
    }
    public String swim()
    {
        return "The unicorn uses its magical powers to walk over the water";
        
    }
}
