public class AxolotlNinja extends Axolotl implements Flying, Climbing
{
    public AxolotlNinja(String name, String desc)
    {
     super(name, desc);   
    }
    public String fly()
    {
        return super.getName() + "soars through the sky";
    }
    public String climb()
    {
     return super.getName() + "waddles up the wall";
    }
    public String play(String toy)
    {
        toy = "ninja star";
        return super.getName() + "plays with his " + toy;
    }
}