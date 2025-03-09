class RubberDuck extends Duck{
    public RubberDuck(){
        fb=new NoFly();
        qb=new NoQuack();
    }

    public void display(){
        System.out.println("I am Rubber Duck.");
    }
}