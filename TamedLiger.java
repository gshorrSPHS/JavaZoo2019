
public class TamedLiger extends Liger
{
    public String trick;
    public TamedLiger(String name, String desc, String learnedTrick)
    {
        super(name, desc);
        trick = learnedTrick;
    }
    @Override
    public String eat()
    {
        int r = (int)(Math.random() * 2);
        if(r == 1)
        {
            return "The liger hungrily eats a delicious meal of steak and potatos";
        }
        else
        {
            return "The liger tries a vegan meal of tofu and spits it out angrily";
        }
    }
    @Override
    public String swim()
    {
        return "The liger goes into the heated pool with pool noodles and floaties";
    }
    @Override
    public String play()
    {
        return "The liger practices his new trick, " + trick;
    }
}
