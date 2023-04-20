import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        System.out.println("Enter Your Number");
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        for(int i=1;i<=a;i++){

            if(i%2==0){

                System.out.println("Even No. "+i);
            }

            else System.out.println("Odd No. "+i);
        }




    }
}