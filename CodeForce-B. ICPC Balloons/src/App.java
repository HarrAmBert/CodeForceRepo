
import java.util.HashMap;
import java.util.Scanner;

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
        int size = Integer.parseInt(scan.nextLine());
        String s = scan.nextLine();
        HashMap <Character, Integer> map = new HashMap<>();

        for(int i =0; i < size; i++)
        {
            Character key = s.charAt(i);
            map.putIfAbsent(key, 0);
            map.put(key, map.get(key) + 1);
        }

        int totalAdd = map.size();
        for(int i= 0; i < map.size(); i++)
        {
            totalAdd += map.get(s.charAt(i));
        }
        System.out.println(totalAdd);
    }
    
}
