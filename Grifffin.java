public class Grifffin extends Animal implements Walking, Climbing, Flying, Swimming
{
    public Grifffin(String name, String desc)
    {
        super(name, desc);
    }
    @Override
    public String play()
    {
        int r  = (int)(Math.random() * 6);
        if(r ==1 )
        {
            return "* rolls over *";
        }
        else if(r == 2)
        {
            return "* does nothing *";
        }
        else if(r == 3)
        
        {
           return "* looks at you blankly *";
        }
        else if(r == 4)
        {
            return "* stands up, turns around, lays down, and ignores you *";

        }
        else if(r == 5)
        {
            return "* Runs in cirlces *";

        }
        else 
        {
            return "* digs with its paws playfully *";

        }
    }
    @Override
    public String eat()
    {
        int r  = (int)(Math.random() * 4);
        if(r ==1 )
        {
            return "* licks its lips and eats the meal *";
        }
        else if(r == 2)
        {
            return "* stares blankly at the meal *";
        }
        else if(r == 3)
        
        {
           return "* scared of food, so it runs away *";
        }
        else 
        {
            return "* stands up, turns around, lays down, and ignores the food *";

        }
        
    }
    @Override
    public String makeNoise()
    {
        int r  = (int)(Math.random() * 4);
        if(r ==1 )
        {
            return "* roof *";
        }
        else if(r == 2)
        {
            return "* yawn *";
        }
        else if(r == 3)
        
        {
           return "* bark *";
        }
        else 
        {
            return "* hiss *";
        }
    }
    @Override
    public String walk()
    {
        int r  = (int)(Math.random() * 2);
        if(r ==1 )
        {
            return "* walks slowly *";
        }
        else
        {
            return "* walks quickly *"; 
        }
    }
    @Override
    public String climb()
    {
        int r  = (int)(Math.random() * 2);
        if(r ==1 )
        {
            return "* climbs slowly *";
        }
        else
        {
            return "* climbs quickly *"; 
        }
    }
    @Override
    public String fly()
    {
        int r  = (int)(Math.random() * 2);
        if(r ==1 )
        {
            return "* flys slowly *";
        }
        else
        {
            return "* flys quickly *"; 
        }
    }
    @Override
    public String swim()
    {
        int r  = (int)(Math.random() * 2);
        if(r ==1 )
        {
            return "* swims slowly *";
        }
        else
        {
            return "* swims quickly *"; 
        }
    }
}
