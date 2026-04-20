public class SecondMain {
    public static void main(String[] args) {
        Developer dev = new Developer("Max", 20, "male", "Java", "Frankfurt");

        dev.writingcode();
        System.out.println(dev.getInfo());
    }
}

