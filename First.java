import java.util.Scanner;
public class First {
    public static void main(String[] args) {
    {   //Assigning re return value of sum in ans and show the output of ans.
        int ans = sum();
        System.out.println("You answer is:- "+ans);
        }

    {   //Printing the value of sum2 in main
        System.out.println("The output is:- "+ sum2(45, 67));
        }

    {   // Asigning the value of greet in message and then print message.
        String message = greet();
        System.out.println(message);
        }

    {   //Same as in String
        Scanner gr = new Scanner(System.in);
            System.out.print("Enter your name:- ");
            String naam = gr.next();
        System.out.println(greetings(naam));
        }
        
    }

    // First Method :- sum of two numbers without any .
    static int sum(){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the value of first number:-");
        int num1 = sc.nextInt();
        System.out.print("Enter the value of Second number:-");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        return sum; //Return the value
        }

        // Returing a String 
        static String greet(){
            String greetings = "Hii, How are you?";
            return greetings;
            
        }

        //Pass the value of numbers when you calling the method in main()
        static int sum2(int a, int b){

            return a+b;

        }

        //same as in String
        static String greetings(String name){
            
            return "Hello " + name +" How are you?";

        }

}
