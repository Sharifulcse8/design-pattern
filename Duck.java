abstract class Duck{
   protected FlyBehavior fb;
   protected QuackBehavior qb;

   public void performFly(){
    fb.fly();
   }

   public void performQuack(){
    qb.quack();
   }

   public void setFlyBehavior(FlyBehavior fb){
    this.fb=fb;
   }

   public void setQuackBehavior(QuackBehavior qb){
    this.qb=qb;
   }

   public abstract void display();
}