
/**
 * Write a description of class CelestialRhino here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CelestialRhino extends Rhinoceros implements Flying, Digging
{
    private String dream;
    public CelestialRhino(String name, String desc, String dream)
    {
        super(name, desc);
        this.dream = dream;
    }
    @Override
    public String fly()
    {
        return "The Rhino gently goes into his dream and fly ø...ø";
    }
    @Override
    public String dig()
    {
        return "The Rhino starts to dig on the bottom of the pond $...$";
    }
}
