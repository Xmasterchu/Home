import java.util.Scanner;

public class Anna {
    public static void main(String[] args) {
        System.out.println("Как вас зовут?");
        System.out.println("Только не врите");
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        if (a.equals("Аня"))
        {
            System.out.println("Прекрасное имя");
            System.out.println(a + ",я тебя люблю");
        }
        else System.out.println("Попробуйте еще");
        sc.close();
    }
}
