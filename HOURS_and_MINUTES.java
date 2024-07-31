import java.util.Scanner;
public class Solution
{
    public static void main(String args[])
    {
        Scanner read=new Scanner(System.in);
        int n;
        n=read.nextInt();
        int h=n/60;
        int m=n%60;
        System.out.println(h+" Hour(s) "+m+" Minute(s)");
    }
}