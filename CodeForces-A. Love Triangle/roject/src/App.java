import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

import javax.swing.InputMap;

public class App {
    public static void main(String[] args) throws Exception 
    {
        final InputStreamReader reader = new InputStreamReader(System.in);
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        StringTokenizer inp = new StringTokenizer(scan.nextLine());
        int [] arr = new int[n];
        for(int i = 0; i< n; i++)
        {
            arr[i] = Integer.parseInt(inp.nextToken());
        }
        System.out.println(solve(arr, n) ? "YES" : "NO");
    }
    public static boolean solve(int [] arr, int n)
    {
        int plane1,plane2,plane3;
        for(int i = 0; i< n; i++)
        {
            plane1 = arr[i];
            plane2 = arr[plane1 - 1];
            plane3 = arr[plane2 - 1];
            if(arr[arr[arr[i] - 1] - 1] == arr[i] 
                && Arrays.asList(arr).indexOf(plane1) != Arrays.asList(arr).indexOf(plane2)
                && Arrays.asList(arr).indexOf(plane1) != Arrays.asList(arr).indexOf(plane3)
                && Arrays.asList(arr).indexOf(plane3) != Arrays.asList(arr).indexOf(plane2))
            {
                return true;
            }
        }
        return false;
    }
}
