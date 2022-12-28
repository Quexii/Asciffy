package dev.shoroa.asciffy;
public class Asciffycator {
    public static String getAsciiString(String input) {
        StringBuilder sb = new StringBuilder();
        for (char c : input.toCharArray()) {
            sb.append("\\u00"+Integer.toHexString(c));
        }

        return sb.toString();
    }
}
