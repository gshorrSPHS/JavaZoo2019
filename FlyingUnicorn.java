
public class FlyingUnicorn extends Unicorn implements Flying
{
    public FlyingUnicorn (String name, String desc)
    {
        super(name, desc);
    }
    public String fly()
    {
        return super.getName() + "begins to spin its horn rapidly \n" +
        "and lifts into the air";
    }
    public String play()
    {
        return "The unicorn flies up and dunks on the nearest basketball hoop";
    }
}
