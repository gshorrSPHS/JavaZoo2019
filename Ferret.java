public class Ferret extends Animal implements Walking
{
  public Ferret(String n,String i){super(n,i);} 
  @Override public String eat(){return"The ferret gnaws on some chiken wings";}
  @Override public String play(){return "It runs aroound to exhaust itself";}
  @Override public String makeNoise(){return "dook";}
  @Override public String walk(){return "The ferret runs across it's cage";}
}
