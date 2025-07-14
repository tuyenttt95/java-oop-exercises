package lab_06;

public class ConvertTime {

    // TODO
    /**
     * Given input string: "2hrs and 5 minutes"
     * Please calculate how many minutes in total
    */

    public static void main(String[] args) {
        String input = "2hrs and 5 minutes";
        int hours = 0;
        int minutes = 0;

        // Split string by spaces
        String[] parts = input.split("and");
        for (String part : parts) {
            part = part.trim(); // Remove excess space

            if (part.contains("hr")) {
                hours = Integer.parseInt(part.replaceAll("[^0-9]", ""));
            } else if (part.contains("min")) {
                minutes = Integer.parseInt(part.replaceAll("[^0-9]", ""));
            }
        }

        int totalMinutes = hours * 60 + minutes;
        System.out.println("Total minutes: " + totalMinutes);
    }


}
