import java.util.Scanner;

public class App 
{
    public static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) throws Exception 
    {
        System.out.println(solve());
    }
    public static int solve() 
    {
        int n = Integer.parseInt(scan.nextLine());
        if(n == 1) return 3;
        if(n == 2) return 4;
        return n - 2;
    }
}
