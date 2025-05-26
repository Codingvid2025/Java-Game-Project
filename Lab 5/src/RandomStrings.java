package strings;
public class RandomStrings {
    class RandomString {
        private static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        private static final Random RANDOM = new Random();

        public static String nextString(int n) {
            if (n <= 0) return "";
            char firstChar = CHARACTERS.charAt(RANDOM.nextInt(52));
            StringBuilder sb = new StringBuilder().append(firstChar);
            for (int i = 1; i < n; i++) {
                sb.append(CHARACTERS.charAt(RANDOM.nextInt(CHARACTERS.length())));
            }
            return sb.toString();
        }
    }
}
