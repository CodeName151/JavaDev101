import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Family> arraylist = new ArrayList<>();
        Father f1 = new Father();
        Father son = new Son();
        Father daughter = new Daughter();
        arraylist.add(f1);
        System.out.println("-----Father added------");
        f1.talk();
        f1.dance();
        f1.eat();
        f1.walk();
        arraylist.add(son);
        System.out.println("------Son added------");
        son.talk();
        son.dance();
        son.eat();
        son.walk();
        arraylist.add(daughter);
        System.out.println("-----Daughter added-----");
        daughter.talk();
        daughter.dance();
        daughter.eat();
        daughter.walk();
    }
}