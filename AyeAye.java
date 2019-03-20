
/**
 * Write a description of class AyeAye here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AyeAye extends Animal implements Walking, Climbing
{
    public AyeAye(String name, String desc)
    {super(name, desc);}
    @Override 
    public String makeNoise()
    {return "Someone accidently shines a light in the Aye-Ayes sensitive eyes, startled, the Aye-Aye makes a wierd noise that sound like metal scraping on metal.";}
    @Override
    public String play()
    {return "The Aye-Aye has started wildly tapping on the tree branch it is on with it's middle finger";}
    @Override
    public String eat()
    {return "The Aye-Aye plunges it's long middle finger inside of the tree and uses it to fish for insects to eat.";}
    @Override
    public String walk()
    {return "The Aye-Aye beguins walking around on four legs";}
    @Override
    public String climb()
    {return "The Aye-Aye climbs on the branch of a tree";} 
}

