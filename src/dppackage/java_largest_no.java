package dppackage;

public class java_largest_no {
    public static void main(String[] args) {
        // Initialize array
        int[] ary = new int[]{1, 3, 6, 3, 7};
        int max = ary[0];

        int i;
        int send = 0;
        for (i = 1; i < ary.length; i++) {
            for (int j = i + 1; j < ary.length; j++) {
                if (ary[j] > ary[i]) {
                    send = ary[j];
                    ary[i] = ary[j];
                }

            }

            if (max < ary[i]) {

                max = ary[i];
            }
        }
        System.out.println("largest number is " + max);
System.out.println(send);
    }
}
