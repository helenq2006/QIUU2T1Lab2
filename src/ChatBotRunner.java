public class ChatBotRunner {
    public static void main(String[] args)
    {
        ChatBot michael = new ChatBot( "Michael",28 );

        //void methods
        michael.greeting("Helen");
        michael.favoriteNumber(17);
        michael.weather();
        michael.favoriteSubject();

        double meters = michael.convertFeetToMeters(10);
        System.out.println("There are " + meters + " in 10 feet");

        int sum = michael.addNumbers(15,26,14);
        System.out.println("The sum is " + sum);

        String color = michael.favColor();
        System.out.println(color);

        String message = michael.goodbye();
        System.out.println(message);
    }
}
