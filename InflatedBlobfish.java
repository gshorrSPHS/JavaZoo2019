public class InflatedBlobfish extends Blobfish implements Flying
{
    private String air;
    
    public InflatedBlobfish(String name, String desc, String air)
    {
        super(name, desc);
        this.air = air;
    }

    @Override
    public String fly()
    {
        return "The blobfish will fly after being inflated from air.";
    }
}
