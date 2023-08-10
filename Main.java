import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Person1 p1 = new Person1();
        Person2 p2 = new Person2();
        Subject s = new Subject();
        s.register(p1);
        s.register(p2);

        while (true) {
            System.out.printf("Enter Score  ");
            Scanner sc = new Scanner(System.in);
            String score = sc.nextLine();
            if (score.equals("")) {
                break;
            }
            s.setScore(score);
        }
    }
}
