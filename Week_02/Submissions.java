package week2;

/**
 * 242. 有效的字母异位词
 */
public class Submissions {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {return false;}
        int[] state = new int[26];
        char[] characterS = s.toCharArray();
        char[] characterT = t.toCharArray();
        for (int i = 0; i < characterS.length; ++i) {
            state[characterS[i]-97]++;
        }
        for (int i = 0; i < characterT.length; ++i) {
            state[characterT[i]-97]--;
        }
        for (int i = 0; i < 26; ++i) {
            if (state[i] > 0) {
                return false;
            }
        }
        return true;
    }
}
