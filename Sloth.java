public class Sloth extends Animal implements Climbing
{
    public Sloth(String name, String desc)
    {
        super(name, desc);
    }
    
    @Override
    public String makeNoise()
    {
        return "The sloth lets out a litle yawn, 'Eaaah'";
}

    @Override
    public String eat()
    {
        return "The sloth eats a handful of cecropia leaves hanging from a tree.";
}

    @Override
    public String play()
    {
        return "The sloth climbs onto the rope apparatus and rolls around.";
}

    @Override
    public String climb()
    {
        return "The sloth moves very slowly as it climbs from one tree to another.";
}
}