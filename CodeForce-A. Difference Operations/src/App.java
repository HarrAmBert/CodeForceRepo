import java.util.Scanner;
import java.util.StringTokenizer;

public class App {
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        int n = Integer.parseInt(scan.nextLine());
        while (n > 0) {
            System.out.println(solve() ? "YES" : "NO");
            n--;
        }
    }

    public static boolean solve() {
        StringTokenizer st = new StringTokenizer("a b");

        int length = Integer.parseInt(scan.nextLine());
        int arr[] = new int[length];
        st = new StringTokenizer(scan.nextLine());

        for (int i = 0; i < length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            if(i >= 1)
            {
                if (arr[i] % arr[0] != 0) {
                    return false;
                }
            }
        }
        return true;
    }
}
