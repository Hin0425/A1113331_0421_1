import java.util.Scanner;

public class A1113331_0421_1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("請輸入一個正確格式的電子郵件地址：");
        String email = input.nextLine();

        if (isValidEmail(email)) {
            System.out.println("這是一個有效的電子郵件地址。");
        } else {
            System.out.println("這不是一個有效的電子郵件地址。");
        }
    }

    public static boolean isValidEmail(String email) {
        String regex = "^[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,}$";
        return email.matches(regex);
    }
}