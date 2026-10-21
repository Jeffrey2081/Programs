public class OverloadDisplay
{
    void display() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                if (j % 2 == 0) {
                    System.out.print("1  ");
                } else {
                    System.out.print("2  ");
                }
            }
            System.out.println();
        }
    }
    
    void display(int n, int m) {
        if (m > n) {
            double q = m / n;
            System.out.println("Quotient: " + q);
        } else {
            int sum = 2 * n + 3 * m;
            System.out.println("Sum: " + sum);
        }
    }
    
    double display(double a, double b, double c) {
        double p = (a + b) / c;
        double q = a + b + c;
        double z = p * q;
        System.out.println("Z = " + z);
        return z;
    }
}
