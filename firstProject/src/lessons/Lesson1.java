package lessons;

import java.util.Arrays;

public class Lesson1 {
    public static void main(String[] args) throws Exception {
        // this is a single line comment

        /*
         * multiple lines comment
         */

        System.out.println("Hello, World!");

        float number = 10.5f;
        System.out.println(number);

        String str = "this is a string";
        System.out.println(str);

        for (int i = 0; i <= 4; i = i + 2) {
            System.out.println(i);
        }

        int[] vector = new int[3];
        System.out.println(Arrays.toString(vector));

    }
}
