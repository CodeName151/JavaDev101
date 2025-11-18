public class Son extends Father implements Basics , Family{

    public void presence(){
        System.out.println("This is member of family");
    }
    @Override
    public void talk() {
        System.out.println("Son is talking in dad language!");
    }

    public void eat(){
        System.out.println("Son is eating.........");
    }

    public void dance(){
        System.out.println("Son is dancing although it ist something my dad would not do");
    }

    @Override
    public void walk() {
        System.out.println("Son is walking");
    }
}
