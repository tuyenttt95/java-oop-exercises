package lab_06;

public class UrlChecker {

    // TODO
    /**
     * String url = "https://www.example.com";
     * Check http OR https; domain name, .com OR .net
     */

    public static void main(String[] args) {

        String url = "https://www.example.com";

        // Check if the URL starts with "http://" or "https://"
        if (url.startsWith("http://") || url.startsWith("https://")) {
            System.out.println("Valid URL");

            // Check protocol
            if (url.startsWith("https://")) {
                System.out.println("Protocol: https");
            } else if (url.startsWith("http://")) {
                System.out.println("Protocol: http");
            } else {
                System.out.println("Unknown protocol");
            }

            // Extract domain name
            String domain = url.replaceFirst("https?://", "");
            int slashIndex = domain.indexOf('/');
            if (slashIndex != -1) {
                domain = domain.substring(0, slashIndex);
            }
            System.out.println("Domain: " + domain);

            // Check .com or .net
            if (domain.endsWith(".com")) {
                System.out.println("Domain ends with .com");
            } else if (domain.endsWith(".net")) {
                System.out.println("Domain ends with .net");
            } else {
                System.out.println("Domain does not end with .com or .net");
            }
        } else {
            System.out.println("Invalid URL");
        }
    }
}
