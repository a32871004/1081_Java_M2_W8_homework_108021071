import java.util.Scanner;

public class wh804 {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        int n=sn.nextInt();
        long sum=1;
        for(int i=1;i<=n;i++){
            sum*=i;
        }
        System.out.println(sum);
    }
}
