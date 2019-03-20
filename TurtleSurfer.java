public class TurtleSurfer extends SeaTurtle
{
   private String toy;
   
   public TurtleSurfer(String name, String desc, String toy)
   {
       super(name, desc);
       this.toy = toy;
   }
   
   @Override
   public String makeNoise()
   {
       return "Surfs up dudes!";
   }
   
   @Override
   public String play()
   {
       return "The Turtle Surfer jumps into the water and hops onto his surfboard.";
    }
    
   public String toy()
   {
       return "The Turtle Surfer loves to play in the water with his surfboard";
   }
}
