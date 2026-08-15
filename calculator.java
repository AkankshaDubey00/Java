import java.util.*;
public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Take input from user till user does not press x or x
        int ans = 0;
        while(true){
            //take the operator as input
            System.out.println("Enter the operator :");
            char op = sc.next().trim().charAt(0);

            if( op == '*' || op =='+' || op =='-' || op =='/'|| op =='%'){
                //input two numbers
                System.out.println("Enter the two number");
                int num1 = sc.nextInt();
                int num2 = sc.nextInt();
                

                if(op =='+'){
                    ans = num1 + num2;
                }
                 if(op =='-'){
                    ans = num1 - num2;
                }

                 if(op =='*'){
                    ans = num1 * num2;
                }

                if(op =='/'){
                    if(num2 != 0){
                        ans = num1 / num2;
                    }
                    
                }

                if(op =='%'){
                    ans = num1 % num2;
                }

                else if (op == 'x'|| op == 'X'){
                    break;
                }

            }
            else{
                    System.out.println("Invalid Operation!!");
                }
                System.out.println(ans);

        }
    
    }
}
