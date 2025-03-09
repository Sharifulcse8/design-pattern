public class Main{
    public static void main(String[] args) {
        Duck mallerDuck= new MallerDuck();

        mallerDuck.display();
        mallerDuck.performFly();
        mallerDuck.performQuack();

        System.out.println("\nChanging Behavior dynamically...\n");

        Duck rubberDuck=new RubberDuck();

        rubberDuck.display();
        rubberDuck.performFly();
        rubberDuck.performQuack();

        rubberDuck.setFlyBehavior(new FlywithWings());
        rubberDuck.setQuackBehavior(new CanQuack());

        System.out.println("\n After Changing behavior dynamically...\n");
         
        rubberDuck.performFly();
        rubberDuck.performQuack();


    }
}