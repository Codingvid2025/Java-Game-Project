
package strings;

// Class to summarize strings
class StringSummarizer {
    public static String summarize(String input) {
        StringBuilder result = new StringBuilder();
        int count = 1;
        for (int i = 1; i <= input.length(); i++) {
            if (i < input.length() && input.charAt(i) == input.charAt(i - 1)) {
                count++;
            } else {
                result.append(input.charAt(i - 1));
                if (count > 1) result.append(count);
                count = 1;
            }
        }
        return result.toString();
    }
}
