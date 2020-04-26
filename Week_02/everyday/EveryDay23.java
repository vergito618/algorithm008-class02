package April;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class EveryDay23 {

    /**
     * 412. Fizz Buzz
     * @param n
     * @return
     */
    public List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<>();
        for (int i = 1; i <= n; ++i) {
            String str = "";
            boolean isFizz = (i % 3 == 0);
            boolean isBuzz = (i % 5 == 0);
            if (isFizz) {
                str += "Fizz";
            }
            if (isBuzz) {
                str += "Buzz";
            }
            if ("".equals(str)) {
                str += Integer.toString(i);
            }
            list.add(str);
        }
        return list;
    }

    public static void main(String[] args) {
        EveryDay23 everyDay23 = new EveryDay23();
        everyDay23.fizzBuzz(3);
    }

    /**
     * 258. 各位相加
     * @param num
     * @return
     */
//    public int addDigits(int num) {
//
//    }





}
