import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("身長,体重の順に入力をお願いします");
        double h = sc.nextDouble();
        double hs = sc.nextDouble();
        double w = sc.nextDouble();
        double ws = sc.nextDouble();
        double h_b = h / 100;
        double h_bs = hs / 100;
        double b = w / (h_b * h_b);
        double bs = ws / (h_bs * h_bs);
        String s = String.format("%.2f", b);
        String ss = String.format("%.2f", bs);
        double b2 = Double.parseDouble(s);
        double b2s = Double.parseDouble(ss);
        System.out.println("一番さんのBMI数値は" + b2 + "になります。");
        System.out.println("二番さんのBMI数値は" + b2s + "になります。");
    }
}
