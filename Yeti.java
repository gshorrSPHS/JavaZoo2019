public class Yeti extends Sasquatch
{
    private String toy;
    public Yeti(String name, String desc)
    {
        super(name, desc);
    }
    @Override
    public String play()
    {
        return "Yeti has a snowball fight.";
    }
    @Override
    public String swim()
    {
        return "The Yeti swims through the icey water.";
    }
    @Override
    public String eat()
    {
        return "The Yeti devours a seal.";
    }
}
