public class Blobfish extends Animal implements Swimming
{
   public Blobfish(String name, String desc)
   {
       super(name, desc); 
   }
    
   @Override 
   public String makeNoise()
   {
       return "bloop";
   }
   
   @Override
   public String play()
   {
       return "The blobfish floats under the sea";
   }
   
   @Override
   public String eat()
   {
       return "The blobfish eats crabs filled with bacteria";
   }
   
   @Override
   public String swim()
   {
       return "The bear casually strides toward you.";
   }
   
   
}
