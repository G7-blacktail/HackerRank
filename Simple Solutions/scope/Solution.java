package scope;

import java.util.Scanner;
import java.util.logging.Logger;
import scope.classes.Difference;

public class Solution {

    public static void main(String[] args) {
        int[] a;
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
        }

        Difference difference = new Difference(a);

        difference.computeDifference();
        Logger logger = Logger.getLogger(Solution.class.getName());
        logger.info(() -> String.valueOf(difference.getMaximumDifference()));
    }
}
