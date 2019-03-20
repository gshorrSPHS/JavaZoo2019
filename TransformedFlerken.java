public class TransformedFlerken extends Flerken
{
    private int eaten;
    
    public TransformedFlerken(String name, String desc)
    {
        super(name, desc);       
    }
    
    @Override
    public String makeNoise()
    {
        return "GRAAAAWWWRRR";
    }
    
    @Override
    public String play()
    {
        return "The flerken vomits out a ball of yarn from its pocket dimension and plays with it.";
    }
    
    @Override
    public String eat()
    {
        eaten++;
        System.out.println("The flerken opens its tentacles from its mouth and consumes an unassuming animal nearby.");
        if (eaten == 1)
        {
            return "From your estimate, the flerken has thus far devoured 1 animal.";
        }
        else
        {
            return "From your estimate, the flerken has thus far devoured " + eaten + " animals.";
        }
    }

    @Override
    public String walk()
    {
        return "The flerken appears before you using its ability of dimensional travel.";
    }
    
    @Override
    public String climb()
    {
        return "The flerken disappears and reappears on a tree nearby using its ablitiy of dimensional travel.";
    }
}
