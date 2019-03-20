public class Axolotl extends Animal implements Walking, Swimming
{
 public Axolotl(String name, String desc)
 {
     super(name, desc);
     
    }
    public String makeNoise()
    {
        return "blub";
    }
    public String play()
    {
        return "The axolotl swims in a loop";
    }
    public String eat()
    {
     return "The axolotl slurps up some blood worms";   
    }
    public String walk()
    {
        return "The axolotl struts his stuff";
    }
    public String swim()
    {
        return "The axolotl shwims";
    }

}