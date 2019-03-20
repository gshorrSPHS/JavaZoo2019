

public class Babygiraffe extends Giraffe 
{
    private int age = 0;
    public Babygiraffe(String name, String desc, int age)
    {
        super(name, desc);
    }
    @Override
    public String makeNoise()
    {
        return "slurp slurp";
    }
    @Override
    public String play()
    {
        return "The baby frolics around.";
    }
    @Override
    public String eat()
    {
        return "The baby reaches for a leave, but can't reach.";
    }
    @Override
    public String walk()
    {
        return "The baby stumbles around before being able to stand up.";
    }
}
