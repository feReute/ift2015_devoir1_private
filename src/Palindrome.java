public class Palindrome {
    public static boolean checker(String input) {
        String s = rmSpaces(input);
        int taille = s.length() - 1;

        for (int i = 0; 2 * i < taille; i++) {
            if (s.charAt(i) != s.charAt(taille - i)) {
                return false;
            }
        }

        return true;
    }

    public static boolean checker_recursive(String input) {
        String s = rmSpaces(input);
        return recursif(s, 0);
    }

    public static boolean recursif(String s, int index) {
        int taille = s.length() - 1;

        if (2 * index >= taille) return true;
        if (s.charAt(index) == s.charAt(taille - index)) {
            index++;
            return recursif(s, index);
        }

        return false;
    }

    public static String reverse(String input) {
        char[] mot = toCharTab(input, 0);
        int taille = input.length();

        for (int i = 0; 2 * i < taille; i++) {
            swap(mot, i, taille - 1 - i);
        }

        return new String(mot);
    }

    public static void swap(char[] tab, int i, int j) {
        char temp = tab[i];
        tab[i] = tab[j];
        tab[j] = temp;
    }

    public static String transforme_palindrome(String input) {
        return input.concat(reverse(input));
    }

    public static String transforme_palindrome_compacte(String input) {
        int taille = input.length();
        String temp = input;
        String s = "";

        for (int i = 0; i < taille; i++) {
            if (checker(temp)) break;

            char[] tab = new char[]{temp.charAt(0)};
            s = s.concat(new String(tab));
            char[] mot = toCharTab(input, i + 1);
            temp = new String(mot);
        }

        return input.concat(reverse(s));
    }

    public static char[] toCharTab(String s, int debut) {
        int taille = s.length() - debut;
        char[] tab = new char[taille];

        for (int i = 0; i < taille; i++, debut++) {
            tab[i] = s.charAt(debut);
        }

        return tab;
    }

    public static String rmSpaces(String mot) {
        int taille = mot.length();
        String s = "";

        for (int i = 0; i < taille; i++) {
            char c = mot.charAt(i);

            if (c != 32) {
                char[] tab = new char[]{c};
                s = s.concat(new String(tab));
            }
        }

        return s;
    }
}