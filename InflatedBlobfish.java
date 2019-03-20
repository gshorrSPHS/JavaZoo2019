public class InflatedBlobfish extends Blobfish implements Flying
{
    
    public InflatedBlobfish(String name, String desc)
    {
        super(name, desc);
    }

    @Override
    public String fly()
    {
        return "*Flies away*";
    }
}
