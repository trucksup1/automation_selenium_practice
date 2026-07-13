import java.util.Scanner;
public class Multiplication_table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Here the table is of : ");
        int num=sc.nextInt();
        int i=1;
        while(i<=10){
            System.out.println(num+"*"+i+"="+(num*i));
            i++;
        }
        
    }
    
}





/*import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int i = 1;  // initialization

        while (i <= 10) {
            System.out.println(n + " x " + i + " = " + (n * i));
            i++;  // increment
        }

        sc.close();
    }
}*/