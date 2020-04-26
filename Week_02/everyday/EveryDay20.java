package April;

import java.util.HashMap;
import java.util.Map;

/**
 * 299. 猜数字游戏
 * 说明: 你可以假设秘密数字和朋友的猜测数都只包含数字，并且它们的长度永远相等。
 *
 * bulls就是猜对并且位置也对的数字
 * cows是猜对但是位置不对的数字
 * -->  也就是secret有的guess也有但是位置不对
 * -->  转化为  secret所有数字 减去  bull  再减去 secret有的但是guess没有的
 */
public class EveryDay20 {

    public String getHint(String secret, String guess) {
        int bulls = 0;
        int cows = 0;
        int[] countNums = new int[10];
        for (int i = 0; i < secret.length(); ++i) {
            if (secret.charAt(i) == guess.charAt(i)) {
                bulls++;
            } else {
                countNums[secret.charAt(i)-'0']++;
                countNums[guess.charAt(i)-'0']--;
            }
        }
        cows = secret.length() - bulls;
        for (int i = 0; i < 10; ++i) {
            if (countNums[i] > 0) {
                cows -= countNums[i];
            }
        }
        return bulls + "A" + cows + "B";
    }

    public static void main(String[] args) {
        EveryDay20 everyDay20 = new EveryDay20();
        everyDay20.getHint("1123", "0111");
    }


    /**
     * 290. 单词规律
     * map的put返回值为
     *      1：put的key不存在的话返回null
     *      2：put的key存在的话返回旧值
     * @param pattern
     * @param str
     * @return
     */
    public boolean wordPattern(String pattern, String str) {
        String[] words = str.split(" ");
        if (words.length != pattern.length()) {
            return false;
        }
        Map map = new HashMap<>();
        for (int i = 0; i < words.length; ++i) {
            if (map.put(pattern.charAt(i), i) != map.put(words[i], i)) {
                return false;
            }
        }
        return true;
    }

}
