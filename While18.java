package while18;
import java.util.Scanner;
public class While18 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("N = ");
        int n = in.nextInt();
        int k=0,x;
        while(n>0){
            x = n % 10;     // n nin` axirgi cifrin x ozgeriwshige menshikleydi
            k = k*10 + x;   // n nin cifrlarin keri tartipte jazadi
            n = n/10;       // n nin` axirgi cifrin alip taslaydi
        }
        System.out.println(k);


    }
    
}
