package lab_06;

public class ExtractDigit {

    // TODO
    /**
     * String myStr = "100 minutes";
     * NOT using REGEX, extract digit character from that String
     * Expected output: "100".
     * EX: "12345nabc678" -> "12345678"
     */

    String myPassword = "password123";
    public static void main(String[] args) {
        String myStr = "100 minutes";
        StringBuilder digits = new StringBuilder();

        for (char output : myStr.toCharArray()) {
            if (Character.isDigit(output)) {
                digits.append(output);
            }
        }

        System.out.println("Extracted digits: " + digits.toString());
    }
}
