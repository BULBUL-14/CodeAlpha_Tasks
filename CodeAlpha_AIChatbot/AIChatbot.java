import java.util.Scanner;
import java.time.LocalTime;

public class AIChatbot {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String userInput;

        // Time-based Greeting
        LocalTime currentTime = LocalTime.now();
        int hour = currentTime.getHour();

        if (hour < 12) {
            System.out.println("🤖 Chatbot: Good Morning!");
        } else if (hour < 18) {
            System.out.println("🤖 Chatbot: Good Afternoon!");
        } else {
            System.out.println("🤖 Chatbot: Good Evening!");
        }

        System.out.println("🤖 Chatbot: I am your AI Chatbot.");
        System.out.println("Type 'exit' to end the conversation.\n");

        while (true) {

            System.out.print("You: ");
            userInput = sc.nextLine().toLowerCase();

            if (userInput.equals("exit")) {
                System.out.println("🤖 Chatbot: Goodbye! Have a wonderful day!");
                break;
            }

            else if (userInput.contains("hello") || userInput.contains("hi")) {
                System.out.println("🤖 Chatbot: Hello! How can I assist you?");
            }

            else if (userInput.contains("how are you")) {
                System.out.println("🤖 Chatbot: I'm functioning perfectly! Thanks for asking 😊");
            }

            else if (userInput.contains("your name")) {
                System.out.println("🤖 Chatbot: I am a Java AI Chatbot created for CodeAlpha Internship.");
            }

            else if (userInput.contains("java")) {
                System.out.println("🤖 Chatbot: Java is a powerful object-oriented programming language widely used for applications.");
            }

            else if (userInput.contains("thank")) {
                System.out.println("🤖 Chatbot: You're welcome! 😊");
            }

            else if (userInput.contains("time")) {
                System.out.println("🤖 Chatbot: Current time is " + LocalTime.now());
            }

            else if (userInput.contains("joke")) {
                System.out.println("🤖 Chatbot: Why do programmers prefer dark mode? Because light attracts bugs! 😄");
            }

            else {
                System.out.println("🤖 Chatbot: Sorry, I didn't understand that. Can you try something else?");
            }
        }

        sc.close();
    }
}