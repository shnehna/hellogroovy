package arl;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author shenhan
 * @create 2019/11/15 17:08
 * @description
 */
public class UglyNumber {
    public static int findUglyNum(int index) {
        Queue<Integer> num = new LinkedList<>();
        num.add(1);
        return doFindAction(num, index);
    }

    private static int doFindAction(Queue<Integer> num, int index) {
        int count = 1;
        while (count < index) {
            Integer integer = num.element();
            int temp1 = integer * 2;
            int temp2 = integer * 3;
            int temp3 = integer * 5;
            num.add(temp1);
            num.add(temp2);
            num.add(temp3);
        }
        return 0;
    }
}
