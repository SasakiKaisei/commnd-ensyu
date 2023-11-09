import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("身長,体重の順に入力をお願いします");
        double h = sc.nextDouble();
        double w = sc.nextDouble();
        double h_b = h / 100;
        double b = w / (h_b * h_b);
        String s = String.format("%.2f", b);
        double b2 = Double.parseDouble(s);
        System.out.println("あなたのBMI数値は" + b2 + "になります。");
    }
}
