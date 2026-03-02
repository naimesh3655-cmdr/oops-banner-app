

public class OOPSBANNERAPP {

    // Helper Method for Letter O
    static String[] getO() {
        return new String[]{
                " ***** ",
                "**   **",
                "**   **",
                "**   **",
                "**   **",
                "**   **",
                " ***** "
        };
    }

    // Helper Method for Letter P
    static String[] getP() {
        return new String[]{
                "****** ",
                "**   **",
                "**   **",
                "****** ",
                "**     ",
                "**     ",
                "**     "
        };
    }

    // Helper Method for Letter S
    static String[] getS() {
        return new String[]{
                " ***** ",
                "**     ",
                "**     ",
                " ***** ",
                "     **",
                "     **",
                " ***** "
        };
    }

    public static void main(String[] args) {

        String[] O1 = getO();
        String[] O2 = getO();
        String[] P = getP();
        String[] S = getS();

        // Build banner lines dynamically
        String[] banner = new String[7];

        for (int i = 0; i < 7; i++) {
            banner[i] = O1[i] + " " + O2[i] + " " + P[i] + " " + S[i];
        }

        // Display banner
        for (String line : banner) {
            System.out.println(line);
        }
    }
}