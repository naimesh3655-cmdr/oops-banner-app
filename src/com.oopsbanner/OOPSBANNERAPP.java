/**
 * OOPSBannerApp UC3 - OOPS Banner Application (Use Case 3)
 *
 * This class extends the functionality of Use Case 2 by improving the way the "OOPS" banner
 * is constructed and displayed. It focuses on enhancing code readability and efficiency
 * by utilizing the String.join() method to create each line of the banner. This approach
 * overcomes the drawbacks of using the + operator for string concatenation, which can lead
 * to code inefficiency due to the creation of multiple intermediate String objects in memory.
 *
 * @author Developer
 * @version 3.0
 */

// Extend use case UC2 to use String.join() method to create each line of the "OOPS" banner
// instead of concatenating strings with the + operator. This is essentially to overcome the
// drawbacks of using the + operator for string concatenation which essentially creates
// multiple intermediate String objects in memory leading to inefficiency.

// Hint: Use String.join(" ", ...) to join the parts of each line with spaces.

public class OOPSBANNERAPP {

    // Main method to run the banner display
    // Use System.out.println() to print each line of the OOPS banner to create
    // the visual effect for the message "OOPS". Construct each line using
    // String.join() method for better readability and efficiency.
    // Each line corresponds to a row in the banner for the letters O, O, P, S.

    public static void main(String[] args) {
     {

        String line1 = String.join("  ",
                " ***** ",
                " ***** ",
                " ***** ",
                " ***** ");

        String line2 = String.join("  ",
                " *   * ",
                " *   * ",
                " *   * ",
                " *     ");

        String line3 = String.join("  ",
                " *   * ",
                " *   * ",
                " *   * ",
                " *     ");

        String line4 = String.join("  ",
                " ***** ",
                " ***** ",
                " ***** ",
                " ***** ");

        String line5 = String.join("  ",
                " *   * ",
                " *   * ",
                " *   * ",
                "     * ");

        String line6 = String.join("  ",
                " *   * ",
                " *   * ",
                " *   * ",
                "     * ");

        String line7 = String.join("  ",
                " ***** ",
                " ***** ",
                " ***** ",
                " ***** ");

        System.out.println(line1);
        System.out.println(line2);
        System.out.println(line3);
        System.out.println(line4);
        System.out.println(line5);
        System.out.println(line6);
        System.out.println(line7);
    }
}
}


