package malicious;

/**
 * Created by framgia on 21/02/2017.
 */
public class CourseEdx {

    public static int fibonacci(int n) {
        if (n == 0 || n == 1) {
            System.out.println("1");
            return 1; // base cases
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2); // recursive step
        }
    }

    public static String subsequences(String word) {
        if (word.isEmpty()) {
            return ""; // base case
        } else {
            char firstLetter = word.charAt(0);
            String restOfWord = word.substring(1);

            String subsequencesOfRest = subsequences(restOfWord);
            String result = "";
            for (String subsequence : subsequencesOfRest.split(",", -1)) {
                result += "," + subsequence;
                result += "," + firstLetter + subsequence;
            }
            result = result.substring(1); // remove extra leading comma
            return result;
        }
    }

    private static String partialSubsequence = "";
    public static String subsequencesLouis(String word) {
        System.out.println(word + ": " + partialSubsequence);
        if (word.isEmpty()) {
            // base case
            return partialSubsequence;
        } else {
            // recursive step
            String withoutFirstLetter = subsequencesLouis(word.substring(1));
            partialSubsequence += word.charAt(0);
            String withFirstLetter = subsequencesLouis(word.substring(1));
            return withoutFirstLetter + "," + withFirstLetter;
        }
    }

    /**
     * @param n integer to convert to string
     * @param base base for the representation. Requires 2<=base<=10.
     * @return n represented as a string of digits in the specified base, with
     *           a minus sign if n<0.  No unnecessary leading zeros are included.
     */
    public static String stringValue(int n, int base) {
        if (n < 0) { return "-" + stringValue(-n, base); }
        else if (n < base) {
            return "" + n;
        } else {
            return stringValue(n/base, base)
                    + "0123456789ABCDEF".charAt(n%base);
        }
    }

    public static void main(String[] args) {
        System.out.println(subsequences("123456"));
    }
}
