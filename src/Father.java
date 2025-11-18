public class Father implements Basics, Family
{
public Father(){
    presence();
}
    @Override

        public void presence () {
            System.out.println("This is member of family");
        }

    public void talk() {
        System.out.println("Dad is talking in dad language....!");
    }

    public void eat(){
        System.out.println("Dad is eating.........");
    }

    public void dance(){
        System.out.println("Dad is dancing.....");
    }

    @Override
    public void walk() {
        System.out.println("Dad is walking");
    }
}
