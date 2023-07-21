package test;
import java.util.Scanner;

public class jb {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int num = obj.nextInt();
        String mw = "";
        for (int i = 0; i < num; i++) {
            String w = obj.next();
            if (w.length() % 2 == 1 && w.length() > mw.length()) {
                mw = w;
            }
        }
        if (mw.equals("")) {
            System.out.println("Better luck next time");
        } else {
            System.out.println(mw);
        }
    }
}