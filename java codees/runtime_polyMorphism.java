class animal
{
    void make()
    {
        System.out.println("sound");
    }
}
class dog extends animal
{
    void make()
    {
        System.out.println("BARK");
    }
}
class cat extends animal
{
    void make()
    {
        System.out.println("meow");
    }
}

public class runtime_polyMorphism
{
    public static void main(String[] args) {
        animal a=new cat();
        a.make();
    }
}