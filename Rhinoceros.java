/**
 * Write a description of class Rhinoceros here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Rhinoceros extends Animal implements Walking, Swimming
{
    public Rhinoceros(String name, String desc)
    {
        super(name, desc);
    }
    @Override 
    public String makeNoise()
    {
        return "ErrrrrrrrAHHHHHHHH";
    }
    @Override
    public String fight()
    {
        return "The Rhino starts to fight each other to death >...<";
    }
    @Override
    public String mate()
    {
        return "The Rhino starts to mate each other for the next 2 hours O...O";
    }
    @Override 
    public String eat()
    {
        return "The Rhino starts to chew mint ∏...∏";
    }
    @Override 
    public String play()
    {
        return "The Rhino starts to shoot gum to each other ¬...¬";
    }
    @Override 
    public String walk()
    {
        return "The Rhino starts to walk along the edge of the pond ˜...˜";
    }
    @Override 
    public String swim()
    {
        return "The Rhino starts to swim along the edge of the pond ◊...◊";
    }
}


