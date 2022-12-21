import java.util.Arrays;

public class H1Q1 {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5, 6};
        System.out.println(Arrays.toString(a));
        reverse(a);
        System.out.println(Arrays.toString(a));
    }

    public static void reverse(int s[]) {
        int n = s.length - 1;
        for (int i = 0; i < s.length / 2; i++) {
            int temp = s[i];
            s[i] = s[n];
            s[n] = temp;
            n--;


    }
}


}
