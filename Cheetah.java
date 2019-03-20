public class Cheetah extends Animal implements Walking, Climbing, Swimming
{
    public Cheetah(String name, String desc)
    {
        super(name, desc);
    }
    
    @Override
    public String makeNoise()
    {
        return "purrr";
    }
    
    @Override
    public String play()
    {
        return "The cheetah stretches and rolls in the grass.";
    }
    
    @Override
    public String eat()
    {
        return "The cheetah eats a rabbit.";
    }
    
    @Override
    public String walk()
    {
        return "The cheetah walks slowly.";
    }
    
    @Override
    public String climb()
    {
        return "The cheetah leaps into the tree.";
    }
    
    @Override
    public String swim()
    {
        return "The cheetah prefers not to be in the water.";
    }
}