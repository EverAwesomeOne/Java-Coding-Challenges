package TopInterview150;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Subsequence {
    public static void main(String[] args) {
        System.out.println(isSubsequence("abc", "ahbgdc"));
        System.out.println(isSubsequence("axc", "ahbgdc"));
        System.out.println(isSubsequence("", "ahbgdc"));
        System.out.println(isSubsequence("bc", "ahbgdc"));
    }

    // exceeds time limit in some instances
    public static boolean isSubsequenceInitialSolution(String s, String t) {
        String temp = "";
        if (s.length() > 0) {
            for (int i = 0; i < s.length(); i++) {
                temp += ".*" + s.charAt(i);
            }
            temp += ".*";
        } else {
            temp = ".*";
        }

        Pattern p = Pattern.compile(temp);
        Matcher m = p.matcher(t);
        return m.matches();
    }

    public static boolean isSubsequence(String s, String t) {
        int i = 0,j = 0;
        int n = t.length();
        int m = s.length();
        char[] ss = s.toCharArray();
        char[] tt = t.toCharArray();

        if (m < 1) return true;

        while (i < n){
            if (tt[i] == ss[j]) {
                j++;
            }
            i++;

            if (j == m) return true;
        }
        return false;
    }

}
