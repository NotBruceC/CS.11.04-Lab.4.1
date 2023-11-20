public class Main {
    // 1. parenthesesCheck
    public static boolean parenthesesCheck(String str) {
        if (str.substring(0, 1).equals("(")) {
            if (str.substring(str.length() - 1, str.length()).equals(")")) {
                return true;
            } else return false;
        } else {
            return false;
        }
    }

    // 2. reverseInteger
    public static String reverseInteger(int str) {
        String result = "";
        String ok = Integer.toString(str);
        for (int i = ok.length() - 1; i >= 0; i--) {
            result += ok.charAt(i);
        }
        return result;
    }

    // 3. encryptThis
    public static String encryptThis(String str) {
        String result = "";

        String[] words = str.split(" ");

        for (int i = 0; i < words.length; i++) {
            String word = words[i];

            if (word.length() > 0) {
                char[] chars = word.toCharArray();
                if (chars.length > 1) {
                    char temp = chars[1];
                    chars[1] = chars[chars.length - 1];
                    chars[chars.length - 1] = temp;
                }
                int code = (int) chars[0];
                String codeStr = Integer.toString(code);
                String modWord = codeStr + new String(chars, 1, chars.length - 1);

                result += modWord;
            }

            if (i < words.length - 1) {
                result += " ";
            }
        }
        return result;
    }

    public static String decipherThis(String str) {
        String result = "";

        String[] words = str.split(" ");

        for (String word : words) {
                int len = word.length();
                int first = 0;
                int i = 0;
            String sec = "";
                String other = "";
                while (i < len && Character.isDigit(word.charAt(i))) { // if i digit
                    first = first * 10 + (word.charAt(i) - '0');
                    i++;
                } char ok = (char) first;
                if (len - i > 1) { // until last
                    sec = word.substring(len - 1, len);// the last char
                    other = word.substring(i + 1, len - 1); // the middle chars until last
                } char last = word.charAt(i); // second char
                result = result + ok + sec + other + last + " ";
            }
            return result.trim();

    }


}
