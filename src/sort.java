import java.util.*;

public class sort {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(8);
        list.add(3);
        list.add(3);
        list.add(9);
        list.add(7);
        list.add(2);
        list.add(3);
        list.add(1);
        list.add(5);

        sort(list);

        System.out.println(list);
    }

    public static List sort(List<Integer> list) {
        int i = 1;
        int n = 0;

        while (i < list.size()) {
            n = 0;
            for (int j = i; j > 0; j--) {
                if (list.get(i) < list.get(j - 1)) {
                    n++;
                } else break;
            }
            if (n == 0) {
            } else {
                int unsortedEl = list.get(i);
                list.remove(i);
                list.add(i - n, unsortedEl);
            }
            i++;
        }

        return list;
    }
}
