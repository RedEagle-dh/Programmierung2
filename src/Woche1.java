public class Woche1 {

    public static void main(String[] args) {
        System.out.println(checkPredecessor(new int[]{1, 2, 3}));
        System.out.println(computeNorm(new double[]{1., 1., 1.}));
        System.out.println(containsMultipleOf(new int[] {1, 1, 1}, 2));
        System.out.println(containsMultipleOfHoechstensEins(new int[] {1, 1, 1}, 2));
        System.out.println(istPalindrom("tote"));
        System.out.println(fromBinaryString("100"));
    }



    public static boolean checkPredecessor(int[] x) {
        int counter = 0;

        for (int i = 0; i < x.length - 1; i++) {
            int newValue = x[i+1];
            if (newValue > x[i]) {
                counter++;
            }
        }

        // Bei der Aufgabenstellung, bei dem es mindestens 2 sein sollen, einfach "<" zu ">" ändern.
        return counter <= 2;
    }

    public static double computeNorm(double[] x) {
        double sum = 0.;
        for (double elem : x ) {
            sum += elem * elem;
        }
        return sum;
    }

    public static boolean containsMultipleOf(int[] x, int base) {
        for (int num : x) {
            if (num % base == 0) {
                return true;
            }
        }
        return false;
    }

    public static boolean containsMultipleOfHoechstensEins(int[] x, int base) {
        int counter = 0;
        for (int num : x) {
            if (num % base == 0) {
                counter ++;
            }
        }
        return counter <= 1;
    }

    public static boolean istPalindrom(String x) {
        int length = x.length() - 1;
        for (int i = 0; i < x.length(); i++) {
            if (x.charAt(i) != x.charAt(length)) {
                return false;
            }
            length--;
        }
        return true;
    }

    public static int fromBinaryString(String x) {
        int decimal = 0;
        int exp = x.length() - 1;
        for (int i = 0; i < x.length(); i++) {

            // Wieso - 48? x.charAt(i) liefert uns den ASCII-Wert der Zahl. 48 ist die 0, 49 die 1, und so weiter.
            // Daher müssen wir von dem Wert 48 abziehen, somit bekommen wir die gesuchte Zahl.
            // Vorher typecasten wir den Char noch, um sicherzugehen, dass nichts schiefläuft.
            decimal += ((int) x.charAt(i) - 48) * Math.pow(2, exp);
            exp --;
        }
        return decimal;
    }

}
