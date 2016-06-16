
package salary.with.bonus;
import java.math.BigDecimal;
import java.util.*;
import java.lang.*;
import javax.swing.JOptionPane;


public class SalaryWithBonus {

    
    public static void main(String[] args) {
        
        
        String s;
       double s1,s2,sum,sum2;
      
        Scanner in=new Scanner(System.in);
        s=in.next();
        s1=in.nextDouble();
        s2=in.nextDouble();
        sum=s1+(s2*.15);
       System.out.println(sum);
        sum2=sum;
        sum2=sum2*100;
        int k=(int)sum2;
        sum=(double)k;
        sum/=100;
        System.out.print("TOTAL = R$ ");
        System.out.printf("%.2f",sum);
        System.out.println();
   
        
        
    }
}
