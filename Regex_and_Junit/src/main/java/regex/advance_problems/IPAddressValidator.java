package regex.advance_problems;

import java.util.regex.*;

public class IPAddressValidator {
    // Regex pattern for IPv4 address validation
    private static final String IPV4_PATTERN =
            "^((25[0-5]|2[0-4][0-9]|1[0-9]{2}|[1-9]?[0-9])\\.){3}" +
                    "(25[0-5]|2[0-4][0-9]|1[0-9]{2}|[1-9]?[0-9])$";

    public static boolean isValidIPAddress(String ip) {
        return Pattern.matches(IPV4_PATTERN, ip);
    }

    public static void main(String[] args) {
        String[] testIPs = {"192.168.1.1", "255.255.255.255", "0.0.0.0", "256.100.50.25", "192.168.1.999"};

        for (String ip : testIPs) {
            System.out.println(ip + " → " + (isValidIPAddress(ip) ? "Valid" : "Invalid"));
        }
    }
}
