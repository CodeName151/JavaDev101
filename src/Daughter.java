public class Daughter extends Father implements Basics , Family {
    @Override
    public void presence(){
        System.out.println("This is member of family");
    }

    public void talk() {
        System.out.println("Daughter is talking in dad language!");
    }

    public void eat(){
        System.out.println("Daughter is eating.........");
    }

    public void dance(){
        System.out.println("Daughter is dancing although it ist something my dad would not do");
    }

    @Override
    public void walk() {
        System.out.println("Daughter is walking");
    }
}
