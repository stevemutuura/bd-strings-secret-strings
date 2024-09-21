package strings;

import java.util.Scanner;

public class  App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a verb: ");
        String verb = scan.nextLine();

        System.out.println("Enter a noun: ");
        String noun1 = scan.nextLine();

        System.out.println("Enter another noun: ");
        String noun2 = scan.nextLine();

        System.out.println("Enter an adverb: ");
        String adverb = scan.nextLine();

        System.out.println("Enter one last noun: ");
        String noun3 = scan.nextLine();

        String beginning = " your ";
        beginning =  verb + ", " + verb + ", " + verb + beginning + noun1 + '\n';

        String middle = "gently down the ";
        middle = middle.concat(noun2 + "." + '\n');

        String end = "life is but a";
        //end = String.format("%s %s %s %s, %s %s", adverb, adverb, adverb, adverb, end, noun3);
        end = String.format("%1$s %1$s %1$s %1$s %2$s %3$s%n", adverb, end, noun3);
        // --> The last %n is for new line. The 1$ is for numbering your variables directly in the format method.

        System.out.println("Your Song: ");
        System.out.println(beginning + middle + end);
    }
}
