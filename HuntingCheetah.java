public class HuntingCheetah extends Cheetah
{
    private int depth;
    
    public HuntingCheetah(String name, String desc, int depth)
    {
        super(name, desc);
        this.depth = depth;
    }
    
    @Override
    public String swim()
    {
        return "This hunting cheetah can swim up to a depth of " + depth + " feet.";
    }
    
    @Override
    public String walk()
    {
        return "The cheetah run at a maximum speed of 75 mph \nwhen hunting its prey.";
    }
}