public class AlterKoala extends Koala
{
    public AlterKoala(String name, String desc)
    {
        super(name, desc);
    }

    @Override
    public String makeNoise()
    {
        return "Do koalas make noice? ";
    }
    
    @Override
    public String eat()
    {
        return "The koala eats... fresh meat. ";
    }
    
    @Override
    public String play()
    {
        return "He is messing up with the fish (??where??).";
    }
    
    @Override
    public String climb()
    {
        return "He moves quickly between branches. ";
    }
    
    public String fly()
    {
         return "The alterKoala is floating!! WHAT??";
    }
}