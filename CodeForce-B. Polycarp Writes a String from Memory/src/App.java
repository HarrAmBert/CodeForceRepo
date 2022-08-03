
import java.util.LinkedList;
import java.util.Scanner;

public class App {
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        int t = Integer.parseInt(scan.nextLine());
        while(t > 0)
        {
            solve();
            t --;
        }
    }

    public static void solve() {
        int count = 0;
        String s = scan.nextLine();
        char[] arr = s.toCharArray();
        LinkedList<Character> list = new LinkedList<>();
        for (int i = 0; i < arr.length; i++) {
            if(! list.contains(arr[i]))
            {
                list.add(arr[i]);
            }
            if (list.size() > 3)
            {
                list.clear();
                list.add(arr[i]);
                count++;
            }
        }
        if(list.size() != 0)
        {
            count ++;
        }
        System.out.println(count);
    }
}
