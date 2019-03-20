public class FootballRam extends Ram
{
    private String toy;
    
    public FootballRam(String name, String desc, String toy)
    {
        super(name, desc);
        this.toy = toy;
    }
    
    @Override
    public String play()
    {
        return "The ram runs around the football field and cheers for the football team when the team scores points.";
    }
    
    @Override
    public String makeNoise()
    {
        return "Go Rams!";
    }
    
    @Override
    public String eat()
    {
        return "The ram stadium nachos and hot dog.";
    }
    
    @Override
    public String walk()
    {
        return "The ram runs to the fifty yard line.";
    }
    
    @Override
    public String climb()
    {
        return "The ram climbs up into the stands to greet fans!";
    }
}