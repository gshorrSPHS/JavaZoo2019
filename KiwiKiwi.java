public class KiwiKiwi extends Kiwi implements Flying
{
    private String clothes;
    
    public KiwiKiwi(String name, String desc, String clothes)
    {
        super(name, desc);
        this.clothes = clothes;
    }
    
    @Override
    public String eat()
    {
        return "The kiwi bird who eats kiwis eats kiwis quietly while looking cute.";
    }
    
    @Override
    public String fly()
    {
        return "The kiwi bird who eats kiwis does not know how to fly, \n"
                            + "but looks over the edge of a cliff and jumps off, \n"
                            + "only to find that the kiwi bird who eats kiwis \n"
                            + "can, in fact, fly.";
    }
    
    public String dress()
    {
        return "The kiwi bird that eats kiwis wears its scarf that \n"
                            + "is covered in kiwis. The scarf is its \n"
                            + "favorite scarf because the pattern is \n"
                            + "his favorite food.";
    }
    
}
