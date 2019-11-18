package arl;

import java.util.LinkedList;
import java.util.Queue;
import java.util.stream.Collectors;

/**
 * @author shenhan
 * @create 2019/11/15 17:08
 * @description
 */
class UglyNumber {
    static long findUglyNum(int index) {
        Queue<Long> num = new LinkedList<>();
        num.offer(1L);
        return doFindAction(num, index);
    }

    private static long doFindAction(Queue<Long> num, int index) {
        int count = 2;
        while (count <= index) {
            long integer = num.poll();
            long temp1 = integer * 2;
            long temp2 = integer * 3;
            long temp3 = integer * 5;
            num.offer(temp1);
            num.offer(temp2);
            num.offer(temp3);
            num = num.stream().distinct().sorted(Long::compareTo).collect(Collectors.toCollection(LinkedList::new));
//            System.out.println(num);
            count++;
        }
        return num.poll();
    }
}
