public class Mammoth extends Elephant
{
     private String toy;
     
     public Mammoth(String name, String desc, String toy)
     {
         super(name, desc);
         this.toy = toy;
     }
     
     @Override
     public String play()
     {
         return "The mammoth rolls around in snow.";
     }
     
     @Override
    public String eat()
    {
        return "The mammoth eats grass.";
    }
    
    public String toy()
    {
        return "The mammoth plays with a ball of snow, constantly making it bigger and bigger the more it rolls around.";
    }
}
