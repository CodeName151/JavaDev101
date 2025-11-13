public class E extends MyException {

    public E(String message) {
        super(message);
        System.out.println("This is a 2nd Custom Exception");
    }
}
