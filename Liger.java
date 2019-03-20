
public class Liger extends Animal implements Walking, Climbing, Swimming
{
    public Liger(String name, String desc)
    {
        super(name, desc);
    }
    @Override
    public String makeNoise()
    {
        int r = (int)(Math.random() * 3);
        if(r == 1)
        {
            return "ROAR";
        }
        else if(r==2)
        {
            return "Gruff";
        }
        else
        {
            return "Meow";
        }
    }
    @Override
    public String eat()
    {
        int r = (int)(Math.random() * 2);
        if(r == 1)
        {
            return "The liger hungrily eats a delicious meal of wild deer";
        }
        else
        {
            return "The liger tries a vegan meal of tofu and spits it out angrily";
        }
    }
    @Override
    public String play()
    {
        int r = (int)(Math.random() * 2);
        if(r == 1)
        {
            return "The liger plays with the wild deer instead of eating him";
        }
        else
        {
            return "The liger plays with the wild deer before eating him for dinner";
        }
    }
    @Override
    public String walk()
    {
        return "The liger walks to the the local BBQ resturant";
    }
    @Override
    public String swim()
    {
        return "The liger puts on floaties and swims in the lake";
    }
    @Override
    public String climb()
    {
        return "The liger puts gets his rope ready and starts scaling the cliff";
    }
}
