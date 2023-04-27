import java.util.Arrays;

public class Woche2 {
    public static void main(String[] args) {
        //System.out.println(hat222(22102211));
        //System.out.println(hatHoechstens(33322, 1));
        //System.out.println(hatKein222(22102211));
        //System.out.println(hatMindestens(3332, 1));
        //System.out.println(pruefsumme(new int[] { 10, 10, 11 }, 5));
        //System.out.println(quersumme(333));
        //System.out.println(quersummeN(333, 1));
        //System.out.println(sumOfMatrix(new double[][] { { 1., 1., 1. }, { 2., 2., 2. }, { 3., 3., 3. } }));
        //System.out.println(sumOfSquares(new double[] { 1., 1., 1. }));
        //System.out.println(Arrays.deepToString(modelExample(new double[][] { { 1., 1., 1. }, { 2., 2., 2. }, { 3., 3., 3. } })));
        //System.out.println(Arrays.deepToString(modelExample2(new double[][] { { 1., 1., 1. }, { 2., 2., 2. }, { 3., 3., 3. } })));
        System.out.println(sumOfColOne(new double[][] { { 1., 1., 1. }, { 2., 2., 2. }, { 3., 3., 3. } }));
    }

    public static boolean hat222(int x) {
        boolean result = false;
        while (x != 0) {
            if (x % 10 == 2 && x / 10 % 10 == 2 && x / 100 % 10 == 2) {
                result = true;
                break;
            }
            x /= 10;
        }
        return result;
    }

    public static boolean hatHoechstens(int x, int n)
    {
        int count = 0;
        while (x != 0) {
            if (x % 10 == 2) {
                count++;
            }
            x /= 10;
        }

        return count <= n;
    }

    public static boolean hatKein222(int x)
    {
        boolean result = true;
        while (x != 0) {
            if (x % 10 == 2 && x / 10 % 10 == 2 && x / 100 % 10 == 2) {
                result = false;
                break;
            }
            x /= 10;
        }
        return result;
    }

    public static boolean hatMindestens(int x, int n)
    {
        int count = 0;
        while (x != 0) {
            if (x % 10 == 2) {
                count++;
            }
            x /= 10;
        }

        return count >= n;
    }

    public static int pruefsumme(int[] x, int mod)
    {
        int summe = 0;
        for (int y : x) {
            summe += y;
        }
        return summe % mod;
    }

    public static int quersumme(int x)
    {
        int summe = 0;
        while (x != 0) {
            summe += x % 10;
            x /= 10;
        }
        return summe;
    }

    public static int quersummeN(int x, int N)
    {
        int summe = 0;
        for (int i = 0; i < N; i++) {
            summe += x % 10;
            x /= 10;
        }
        return summe;
    }

    public static double sumOfMatrix(double[][] x){
        int sum = 0;
        for (double[] doubles : x) {
            for (double aDouble : doubles) {
                sum += aDouble;
            }
        }
        return sum;
    }

    public static double sumOfSquares(double[] x){
        int sum = 0;
        for (double squares : x) {
            sum += Math.pow(squares, 2);
        }

        return sum;
    }

    public static double[][] modelExample(double[][] x){
            double[][] result = new double[x.length][1];
            for (int i = 0; i < x.length; i++) {
                Arrays.fill(result[i], x[i][0]);
            }
            return result;
    }

    public static double[][] modelExample2(double[][] x){
        double[][] result = new double[1][x[0].length];

        for (int i = 0; i < x[0].length; i++) {
            double sum = 0;
            for (double[] doubles : x) {
                sum += doubles[i];
            }
            result[0][i] = sum;
        }

        return result;
    }

    public static double sumOfColOne(double[][] x){
        if (x.length > 0) {
            int sum = 0;
            for (int i = 0; i < x.length; i++) {
                sum += x[i][1];
            }
            return sum;
        } else {
            return 0.0;
        }
    }

}
