import java.util.*;

public class IsomorphicStrings {
    private static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;

        Map<Character, Character> st = new HashMap<>();
        Map<Character, Character> ts = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char sc = s.charAt(i);
            char tc = t.charAt(i);

            
            if (st.containsKey(sc) && st.get(sc) != tc) {
                return false;
            }

            
            if (ts.containsKey(tc) && ts.get(tc) != sc) {
                return false;
            }

            
            st.put(sc, tc);
            ts.put(tc, sc);
        }

        return true; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two strings: ");
        String s = sc.nextLine();
        String t = sc.nextLine();

        System.out.println(isIsomorphic(s, t) 
            ? "The strings are isomorphic." 
            : "The strings are not isomorphic.");

        sc.close();
    }
}
