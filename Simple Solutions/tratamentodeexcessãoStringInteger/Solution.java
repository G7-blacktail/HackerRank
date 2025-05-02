// Problem: Bad String
// Contest: HackerRank - Java Exception Handling (Try-catch)
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Logger;


class Solution {
    private static final Logger logger = Logger.getLogger(Solution.class.getName());
    public static void main(String[] args) throws IOException {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
        String inputString = bufferedReader.readLine();
            try {
                int n = Integer.parseInt(inputString);
                if (logger.isLoggable(java.util.logging.Level.INFO)) {
                    logger.info(String.valueOf(n));
                }
            } catch (NumberFormatException e) {
                logger.warning("Bad String");
            }
        }
    }
}