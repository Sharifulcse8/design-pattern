class MallerDuck extends Duck{
    public MallerDuck(){
        fb=new FlywithWings();
        qb=new CanQuack();
    }

    public void display(){
        System.out.println("I am a MallerDuck.");
    }
}