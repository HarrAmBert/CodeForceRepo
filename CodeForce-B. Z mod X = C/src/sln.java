import java.util.Scanner;
import java.util.StringTokenizer;

public class sln {
    public static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        int n = Integer.parseInt(scan.nextLine());
        while(n >= 0)
        {
            solve();
            n--;
        }
    }
    public static void solve()
    {
        StringTokenizer st = new StringTokenizer(scan.nextLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        a = a + b + c;
        b = b + c;
        System.out.println(a + " " + b + " " + c);
    }
}
