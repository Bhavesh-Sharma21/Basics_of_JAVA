import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
            
           {
            Scanner bh = new Scanner(System.in);
            System.out.print("Enter you target number:- ");
            int target = bh.nextInt();
            whiletest(target);
            
            System.out.print("Enter Your Number where you want to start your countdown:-");
            int count = bh.nextInt();
            countdown(count);

            Dices();
            countprint(5);
            evenNumber(8);
           }


            
               
           
           
            
        }
        static void whiletest(int targetNumber){
        
            int i = 0;
            while(i <= targetNumber){
                System.out.println(i);
                i++;
            }
        }
        
        static void countdown(int countdown){
            
            while(countdown > 0){
                System.out.println(countdown);
                countdown--;
            }
            System.out.println("Happy New year!!");
            
        }

        static void Dices(){
            int dice = 1; 
           while(dice <= 6){
               if(dice == 6){
                   System.out.println("yatzy!");
               }
               else{
                   System.out.println("No Yatzy...");
               }
               dice = dice + 1;
           }
        }
        
        static void countprint(int c){
            

            for(int i = 1; i <= c; i++){
                System.out.println(i);
            }
        }

        static void evenNumber(int n){
            
            for(int i = 2; i<= n; i+=2){
                System.out.println(i);
            }
        }
        
}
