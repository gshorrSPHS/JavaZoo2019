public class PossiblyAFerret extends Ferret implements Walking
{
  public PossiblyAFerret(String n,String i){super(n,i);} 
  @Override public String eat(){return"The ferret gnaws on some chiken wings";}
  @Override public String play(){return "it looks at you \"but why would you force it to have fun?\" and goes back to resting ";}
  @Override public String makeNoise(){return "dook dook";}
  @Override public String walk(){return "The ferret runs across it's cage and back";}
}
