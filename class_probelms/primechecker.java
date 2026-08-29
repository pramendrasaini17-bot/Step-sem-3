import java.util.Scanner;

public class primechecker{
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    boolean isPrime=true;
    int a;
    System.out.println("Enter no");
    a=sc.nextInt();

    for(int i=2;i<a;i++){
        if(isPrime){
            isPrime=false;
            break;
        }
    }
    if(isPrime){
        System.out.println("Is prime");
    }
    else{
        System.out.println("Is not prime");
    }
    sc.close();
}

}
