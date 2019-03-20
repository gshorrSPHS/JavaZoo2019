public class Duck extends Animal implements Flying
{
 public Duck(String name, String desc)
 {
   super(name,desc);    
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
 
 @Override 
 public String play()
 {
   return "i like to play in the water";    
 }
 
 @Override
 public String fly()
 {
   return "I believe I can fly";    
 }
}
