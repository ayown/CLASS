import java.util.*;
public class p1 {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number: ");
        int n=sc.nextInt();
        char a='A';
        char b='a';
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                if((i+j)%2==0)
                    System.out.print(a);
                else
                    System.out.print(b);
                a++;
                b++;
            }
            System.out.print("\n");
        }
    }
}