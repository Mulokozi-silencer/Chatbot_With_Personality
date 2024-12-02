import java.util.Scanner;

public class ChatbotWithPersonality {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Initialize Scanner
        System.out.println("Hi! I'm Chatbot GT. What's on your mind?");
        
        while (true) {
            System.out.print("You: "); // Prompt the user
            String userInput = scanner.nextLine(); // Read input
            
            // Debugging: Check if input is captured
            System.out.println("[DEBUG] You entered: " + userInput);

            // Exit condition
            if (userInput.equalsIgnoreCase("bye")) {
                System.out.println("Chatbot GT: It was nice talking to you! Goodbye!");
                break;
            }

            // Check if input is blank
            if (userInput.trim().isEmpty()) {
                System.out.println("Chatbot GT: I didn't catch that. Try typing something.");
                continue;
            }

            // Get chatbot's response
            String response = getResponse(userInput);
            System.out.println("Chatbot GT: " + response);
        }

        scanner.close(); // Close the scanner
    }

    public static String getResponse(String input) {
        String lowerInput = input.toLowerCase();

        // Greetings
        if (lowerInput.contains("hello") || lowerInput.contains("hi")) {
            return "Hey there! How can I brighten your day?";
        }else if (lowerInput.contains("MG")) {
            return "Hey!, So happy to see you here!";
     } else if (lowerInput.contains("how are you")) {
            return "I'm just a bunch of code, but I'm feeling great! How about you?";
        } else if (lowerInput.contains("bye")) {
            return "It was great chatting! Come back soon.";
        } else if (lowerInput.contains("what's up") || lowerInput.contains("hello MG")) {
            return "Hello, friend! How are doing today";
        }
       //Love
       if (lowerInput.contains("love")) {
           String[] loves = {
            "Love is a beautiful feeling that brings people together. It's wonderful to experience!",
            "Love makes the world go round, It's one of the most powerful forces",
            "Love can be complex, but it's important to communicate openly and listen to each other.",
            "Building a strong connection in a relationship takes time, effort, and patience.",
            "It's hard to feel unappreciated, but remember that self-love and healing are important parts of moving forward.",
            "Sometimes Love can be challenging, but it's okay to take time for yourself to heal and grow.",
            "There are many kinds of love -Romantic, Familiar, Platonic--and each one can shape our lives in a meaningful ways."
           };
           return loves[(int) (Math.random() * loves.length)];
       }

        // Jokes
        if (lowerInput.contains("joke")) {
            String[] jokes = {
                "Why don't programmers like nature? It has too many bugs!",
                "Why did the programmer quit his job? Because he didn’t get arrays.",
                "Why do programmers prefer dark mode? Because light attracts bugs!",
                "What do you call a lazy Kangaroo? A pouch potato.",
                "Why do programmers always confuse Halloween with Christmas?\nBecause Oct 31 == Dec 25!",

            };
            return jokes[(int) (Math.random() * jokes.length)];
        }

        // Fun Facts
        if (lowerInput.contains("fact")) {
            String[] facts = {
                "Did you know? The first computer virus was created in 1983.",
                "Fun fact: A day on Venus is longer than a year on Venus!",
                "Did you know? Honey never spoils; archaeologists have found pots of honey in ancient tombs.",
                "Bananas are berries, but Strawberries are not"
            };
            return facts[(int) (Math.random() * facts.length)];
        }

        // Motivational Quotes
        if (lowerInput.contains("motivation") || lowerInput.contains("inspire")) {
            String[] quotes = {
                "Success is not final, failure is not fatal: It is the courage to continue that counts.",
                "The only way to do great work is to love what you do.",
                "Don't watch the clock; do what it does. Keep going.",
                "Your Limitation-its only your imagination.",
                "It always seems impossible until it's done.",
                "Opportunities don't Happen, you create them.",
                "The way to get started is to quit talking and being doing."
            };
            return quotes[(int) (Math.random() * quotes.length)];
        }

        // Random Replies
        String[] randomReplies = {
            "That's interesting! Tell me more.",
            "Hmm, I'm not sure about that. What do you think?",
            "Oh, fascinating! What's next?",
            "Can you explain that a bit more?"
        };
        return randomReplies[(int) (Math.random() * randomReplies.length)];
    }
}
