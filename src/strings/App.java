package strings;

import java.util.Scanner;

import static java.lang.String.format;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter a verb: ");
        String verb = scanner.nextLine();

        System.out.println("Enter a noun: ");
        String noun1 = scanner.nextLine();

        System.out.println("Enter another noun: ");
        String noun2 = scanner.nextLine();

        System.out.println("Enter an adverb: ");
        String adverb = scanner.nextLine();

        System.out.println("Enter one last noun: ");
        String noun3 = scanner.nextLine();

        String beginning = " your ";
        beginning = verb + ", " + verb + ", " + verb + ", " + beginning + noun1 + '\n';

        String middle = "gently down the ";
        middle = middle.concat(noun2 + "." + '\n');

        String end = "life is but a";
        //end = String.format("%s, %s, %s, %s, %s, %s", adverb, adverb, adverb,adverb, end, noun3);
        end = String.format("%1$s, %1$s, %1$s, %1$s, %2$s, %3$s%n", adverb, end, noun3);

        // uppercase the first letter of beginning, middle, and end
        beginning = Character.toUpperCase(beginning.charAt(0)) + beginning.substring(1);
        middle = Character.toUpperCase(middle.charAt(0)) + middle.substring(1);
        end = end.substring(0, 1).toUpperCase() + end.substring(1);

        System.out.println("Your Song: ");
        System.out.println(beginning + middle + end);
    }
}
