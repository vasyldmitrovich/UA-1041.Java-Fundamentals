public class Main {
    public static void main(String[] args) {
        String text = "abz";
        int shift = 3;

        System.out.println("Encrypted: " + encrypt(text, shift));
        System.out.println("Decrypted: " + decrypt(encrypt(text, shift), shift));
    }

    public static String encrypt(String s, int n) {
        StringBuilder encrypted = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetter(c)) {
                char base = Character.isLowerCase(c) ? 'a' : 'A';
                encrypted.append((char) ((c - base + n) % 26 + base));
            } else {
                encrypted.append(c);
            }
        }
        return encrypted.toString();
    }

    public static String decrypt(String s, int n) {
        return encrypt(s, 26 - n);
    }

}