public class Shark extends Animal implements Swimming
{
    public Shark(String name, String desc)
    {
        super(name, desc);       
    }
    
    @Override
    public String makeNoise()
    {
        return "You hear the sound of water swishing around very quickly";
    }
    
    public String swim()
    {
       return "The shark swims 50 feet deep";
    }
    
    @Override
    public String play()
    {
        return "It dosen't seem very smart to try and play with a shark";
    }
    
    @Override
    public String eat()
    {
        return "The shark eats his fish";
    }   
}
