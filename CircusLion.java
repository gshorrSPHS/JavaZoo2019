public class CircusLion extends Lion implements Flying
{
   private int height;
    
   public CircusLion(String name, String desc)
    {
       super(name,desc);
       this.height = height;
    }
   
   @Override
   public String fly()
   {
       return "This lion can fly up to a height of" + height + "."; 
    }
    
}