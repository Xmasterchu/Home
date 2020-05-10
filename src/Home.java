import java.util.Scanner;

public class Home {
    public static void main(String[] args) {
        System.out.println("Как вас зовут?");
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        if (a.equals("Аня"))
            System.out.println(a + ",я тебя люблю");
        else System.out.println("Попробуйте еще");
        sc.close();
    }
}
