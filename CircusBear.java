public class CircusBear extends Bear implements Flying
{
    private String toy;
    
    public CircusBear(String name, String desc, String toy)
    {
        super(name, desc);
        this.toy = toy;
    }
    
    @Override
    public String play()
    {
        return "The Circus Bear jumps onto its tricycle and rides\n" +
        " around juggling its " + toy + ".";
    }
    
    @Override
    public String fly()
    {
        return "The Circus Bear gets into the cannon and \n" +
        "launches itself across the tent. \n" +
        "WHEEEEEEEEEEEEEEEEE RAWWWRRRRRRR.";
    }
    
    // CircusBear can climb and walk just like Bear can because
    // it inherits that from Bear
}
