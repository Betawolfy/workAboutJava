import java.util.Scanner;

public class compteurVoyelles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez entrer un mot : ");
        String word = scanner.nextLine();
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            char c = Character.toLowerCase(word.charAt(i));
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'y') {
                count++;
            }
        }
        scanner.close();
        System.out.println("Le mot \"" + word + "\" comprend " + count + " voyelles.");
    }
}
