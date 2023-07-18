import java.util.Scanner;

public class Power {

    static int powerWithModules(int a, int b , int c){
        a=a%c;
        int result=1;
        for(int i=1;i<=b;i++){
            result= (result*a) %c;
        }
        return(result % c);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        System.out.println(powerWithModules(a, b,c));
    }
}
/*
Power with Modules
You are given A, B and C .
Calculate the value of (A ^ B) % C

Example Input

Input 1:
A = 2 B = 3 C = 3
Input 2:
A = 5 B = 2 C = 4


Example Output

Output 1: 2
Output 2: 1
 */