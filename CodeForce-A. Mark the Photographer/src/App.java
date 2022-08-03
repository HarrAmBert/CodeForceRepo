import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class App 
{
    public static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) throws Exception 
    {
        int t = Integer.parseInt(scan.nextLine());
        while(t > 0)
        {
            System.out.println(solve() ? "YES" : "NO");
            t --;
        }
    }
    public static boolean solve() 
    {
        StringTokenizer st = new StringTokenizer(scan.nextLine());
        int n = Integer.parseInt(st.nextToken());
        int [] arr = new int[n * 2];
        int x = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(scan.nextLine());
        for (int i = 0; i < arr.length; i++) 
        {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        for (int i = 0; i < n; i++) {
            if(!(arr[i + n] - arr[i] >= x))
            {
                return false;
            }
        }
        return true;
    }
}
