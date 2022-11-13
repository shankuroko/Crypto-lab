import java.util.*;

public class rail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String PT = sc.next();
        int n = PT.length();
        String CT = "";
        for (int i = 0; i < n; i += 2) {
            CT = CT + PT.charAt(i);
        }
        for (int i = 1; i < n; i += 2) {
            CT = CT + PT.charAt(i);
        }
        System.out.println("The Cipher Text is " + CT);
        int p = n % 2;
        String Pt = "";
        if (p == 0) {
            int j = 0;
            for (int i = n / 2; i < n; i++) {
                Pt = Pt + CT.charAt(j) + CT.charAt(i);
                j++;
            }
        } else {
            int j = 0;
            for (int i = ((n / 2) + 1); i < n; i++) {
                Pt = Pt + CT.charAt(j) + CT.charAt(i);
                j++;
            }
            Pt = Pt + CT.charAt(j);
        }

        System.out.println("The Plain Text is " + Pt);
    }
}
