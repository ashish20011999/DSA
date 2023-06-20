public class PasswordSecurity {
    public static int countMinimumFlips(String pwd) {
        int flips = 0;

        if (pwd.length() % 2 != 0) {
            flips += 1;
        }

        for (int i = 0; i < pwd.length(); i += 2) {
            String substring = pwd.substring(i, i + 2);
            if (substring.contains("0") && substring.contains("1")) {
                int zeros = countOccurrences(substring, '0');
                int ones = countOccurrences(substring, '1');
                flips += Math.min(zeros, ones);
            }
        }

        return flips;
    }

    public static int countOccurrences(String str, char target) {
        int count = 0;
        for (char c : str.toCharArray()) {
            if (c == target) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String password = "1110011000";
        int minFlips = countMinimumFlips(password);
        System.out.println("Minimum number of flips: " + minFlips);
    }
}
