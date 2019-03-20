public class babyChick extends chicken
{
    private int eggs;
    public babyChick(String name, String desc, int eggs)
    {
        super(name, desc);
        this.eggs = eggs;
    }
    
    @Override
    public String play()
    {
        return "The baby chick jumps onto its tricycle and rides\n" +
        " around playing with its " + eggs + ".";
    }
    
    @Override
    public String fly()
    {
        return "The baby Chick gets into the cannon so he can fly \n" +
        "goes into space. \n" +
        "WHEEEEEEEEEEEEEEEEE RAWWWRRRRRRR.";
    }
}
