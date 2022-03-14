public class Animal {

    public static String getDefaultGreeting() {
        return "Hello!";
    }

    public static String getBirdGreeting() {
        return "Tweet!";
    }

    public static String getCatGreeting() {
        return "Meow!";
    }

    public static void main(String[] args) {
        String messageDefault = getDefaultGreeting();
        String messageCat = getCatGreeting();
        System.out.println(messageDefault);
        System.out.println(messageCat);
    }
}
