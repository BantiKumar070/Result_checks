package google.compant;
import java.util.Scanner;
public class result_marks_pass_or_fail {
    public static void main(String[] args) {
       float a,b,c;
             Scanner sc =new Scanner(System.in);
                System.out.println("Enter your physics marks");
                a = sc.nextFloat();
                System.out.println("Enter your Chemistry marks");
                b = sc.nextFloat();
                System.out.println("Enter your English marks");
                c = sc.nextFloat();

                float ft = a + b + c;
                float total = ft / 3;
                System.out.println(total);

                if(a<=30){
                    System.out.println("physics * (F)");
                }
                if(b<=30){
                    System.out.println("chemistry * (F)");
                }
                if(c<=30){
                    System.out.println("English * (F)");
                }
                else if (total>=40) {
                    System.out.println("Pass");
                }
                else {
                    System.out.println("Fail");
                }

    }
}
