public class Animal {

    public static String getDefaultGreeting() {
        return "Hello!";
    }

    public static String getBirdGreeting() {
        return "Tweet!";
    }

    public static void main(String[] args) {
        System.out.println(getDefaultGreeting());
        System.out.println(getBirdGreeting());
    }
}
