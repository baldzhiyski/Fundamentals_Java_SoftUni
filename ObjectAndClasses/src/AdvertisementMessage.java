import java.util.Random;
import java.util.Scanner;

public class AdvertisementMessage {
    public static void main(String[] args) {
        Scanner  scan = new Scanner(System.in);
        int times = Integer.parseInt(scan.nextLine());
        Random random= new Random();
        for (int i = 1; i <=times ; i++) {
        String[] phrases = { "Excellent product.",
                "Such a great product.",
                "I always use that product.",
                "Best product of its category.",
                "Exceptional product.","I can’t live without this product."
        };
        String[] events = {"Now I feel good.",
                "I have succeeded with this product.",
                "Makes miracles. I am happy of the results!",
                "I cannot believe but now I feel awesome.",
                "Try it yourself, I am very satisfied.",
                "I feel great!"};
        String[] authors = {
                "Diana",
                "Petya",
                "Stella",
                "Elena",
                "Katya",
                "Iva",
                "Annie",
                 "Eva"
        };
        String[] cities={"Burgas","Plovdiv","Sofia","Varna","Ruse"};
        int firstIndex = random.nextInt(phrases.length);
        int secondIndex = random.nextInt(events.length);
        int thirdIndex = random.nextInt(authors.length);
        int forthIndex = random.nextInt(cities.length);
            System.out.printf("%s %s %s - %s.%n",phrases[firstIndex],events[secondIndex],authors[thirdIndex]
                    ,cities[forthIndex]);
        }
    }
}
