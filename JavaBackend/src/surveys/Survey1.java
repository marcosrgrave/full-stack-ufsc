package surveys;

public class Survey1 {

    public static void main(String[] args) {
        System.out.println(Q1());
        System.out.println(Q2());
        System.out.println(Q3());
        System.out.println(Q4());
        System.out.println(Q5());
        System.out.println(Q6());
        System.out.println(Q7());
    }

    private static int Q1() {
        int a = 1, b = 2, c = 3, r = 1;

        if (a + b + c > 4) {
            r = r + 20;
        } else {
            r = r + 10;
        }

        return r;
    }

    private static int Q2() {
        int a = 1, b = 2, c = 3, r = 1;

        if (a + b + c < 4) {
            r = r * 2;
        } else if (a + b < 3) {
            r = r + 10 * 2;
        } else {
            r = a + b + c * 3;
        }

        return r;
    }

    private static float Q3() {
        float r = 1;
        for (int i = 10; i < 13; i++) {
            if (i == 11) {
                r = r + i * 2;
            } else {
                r = r - i;
            }
        }
        return r;
    }

    private static float Q4() {
        int i = 0;
        float r = 0;
        while (i < 5) {
            r = r + i * 2;
            i++;
        }
        return r;
    }

    private static float Q5() {
        float r = 1;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                r = r + i + j;
            }
        }
        return r;
    }

    private static int Q6() {
        int a = 10, b = 20, c = 30, r;
        r = a + b + a + c;
        r = r - a + r - 5;
        return r;
    }

    private static int Q7() {
        int v[] = { 1, 2, 3, 4, 5 };
        int r = 0;
        v[0] = -1;
        for (int i = 1; i < v.length; i++) {
            v[i] = v[i] + 1;
            r = r + v[i];
        }
        return r;
    }

}
