public class DonaldDuck extends Duck
{
    private String toy;
 public DonaldDuck(String name, String desc, String toy)
 {
   super(name, desc);  
 }
    
    @Override
 public String makeNoise()
 {
   return "quack";    
 }
 
 @Override
 public String eat()
 {
   return "im gonna eat some grapes";  
 }
}