import java.util.HashMap;
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
            solve();
            t --;
        }
    }
    public static void solve() 
    {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = Integer.parseInt(scan.nextLine());
        int [] arr = new int[n];
        StringTokenizer st = new StringTokenizer(scan.nextLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            map.putIfAbsent(arr[i], 0);
            map.put(arr[i], map.get(arr[i]) + 1);
        }

        var entrySet = map.entrySet();
        int count = 0;
        for (var entry : entrySet) 
        {
            count += map.get(entry.getKey()) - 1;
        }
        System.out.println(count);
    }
}
