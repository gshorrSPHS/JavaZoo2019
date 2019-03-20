public class Griffin extends Animal implements Flying
{
  public Griffin(String name, String desc)
  {
    super(name, desc);       
  }
   
  @Override
  public String makeNoise()
  {
      return "The Griffin caws loudly";
  }
    
  @Override
  public String play()
  {
     return "It dosen't seem very smart to try and play with a griffin";
  }
  
  public String fly()
  {
     return "The griffin glides beautifully across it's habitat";
  }
    
  @Override
  public String eat()
  {
      return "The griffin snacks on some delicious goat meat";
  }
}
