import java.util.Scanner;

public class JavaEndOfFile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = 1;
        while (scan.hasNextLine()) {
            System.out.println(i + " " + scan.nextLine());
            i++;
        }
        scan.close();
    }
}