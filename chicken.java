public class chicken extends Animal implements Walking, Climbing, Flying, Swimming
{
   public chicken(String name, String desc)
   {
       super(name, desc);
   }
   @Override
   public String makeNoise()
   {
       return "bawk bawk";
   }
   @Override 
   public String eat()
   {
       return "The chicken eats grass for breakfast, lunch and dinner";
   }
   @Override
   public String play()
   {
       return "The chicken flaps its wings 100 times.";
   }
   @Override
   public String walk()
   {
       return "The chicken walks for " + MAX_DISTANCE + "feet.";
   }
   @Override
   public String climb()
   {
       return "The chicken tries to climb but falls back down.";
   }
   @Override
   public String fly()
   {
       return "The chicken keeps flapping its wings but cannot fly.";
   } 
   @Override
   public String swim()
   {
       return "Chicken tries to swim but drowns.";
   }
   public String eggs()
   {
       return "The chicken takes care of its " + "eggs";
   }
}