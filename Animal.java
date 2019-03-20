// abstract class is a concept, not
// a concrete thing that should be constructed
// abstract classes CANNOT BE CONSTRUCTED
// can have a mix of abstrcat and concrete methods
public abstract class Animal
{
    private String name;
    private String desc;
    
    public Animal(String name, String desc)
    {
        this.name = name;
        this.desc = desc;
    }
    
    public String getName()
    {
        return name;
    }
    
    public String getDesc()
    {
        return desc;
    }
    
    // since they eat, play, and makeNoise in different 
    // ways, subclasses will need to override these methods
    // and we'll make them abstract here
    public abstract String eat();
    public abstract String play();
    public abstract String makeNoise();
}




