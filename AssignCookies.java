import java.util.Arrays;

public class AssignCookies {

    static int findContentChildren(int[] g, int[] s) {

        Arrays.sort(g);
        Arrays.sort(s);
        int count = 0;
        int j = 0;

        for (int i = 0; i < g.length; i++) {
            while (j < s.length && s[j] < g[i]) {
                j++;
            } 
            if (j >= s.length) {
                break;
            }
            if (s[j] >= g[i]) {
                count++;
                j++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] g = {10, 9 , 8, 7};
        int[] s = {5, 6, 7, 8};
        System.out.println(findContentChildren(g, s));
    }
}
