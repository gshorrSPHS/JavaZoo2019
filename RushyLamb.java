public class RushyLamb extends Lamb
{
    private String toy;
    
    public RushyLamb(String name, String desc, String toy)
    {
        super(name, desc);
    }
    @Override
    public String makeNoise()
    {
        return "bark";
    }
        @Override
    public String eat()
    {
        return "The lamb demands a chicken treat";
    }
        @Override
    public String walk()
    {
        return "The lamb does not walk";
    
    }
}