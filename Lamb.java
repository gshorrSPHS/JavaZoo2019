public class Lamb extends Animal implements Walking
{
    public Lamb(String name, String desc)
    {
        super(name, desc);
    }
    @Override
    public String makeNoise()
    {
        return "baaa";
    }
    @Override
    public String play()
    {
        return "The lamb rolls over and jumps up";
    }
    @Override
    public String eat()
    {
        return "The lamb chews on the grass";
    }
    @Override
    public String walk()
    {
        return "The lamb saunters over to greet you";
    }

}
