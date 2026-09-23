package src;

public class Pattern_Printing {
    public static void main(String[] args) {
     // 1. Simple square printing:-
        // int n = 4;
        // for(int row = 1; row <= n; row++){
        //     for(int col = 1; col <= n; col++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

     // 2. Simple Rectangle Printing:-
        // int n = 3;
        // for(int row = 1; row <= n; row++){
        //     for(int col = 1; col <= 5; col++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

     // 3. Right angle traingle Printing:-

   //   int n = 5;
   //   for(int row = 1; row <= n; row++){
   //        for(int col = 1; col <= row; col++){
   //          System.out.print("* ");
   //        }
   //        System.out.println();
   //  }
   // 4. Reverse Right Angle triangle printing:-

   //  int n = 5;
   //  for(int row = 1; row <= n; row++){
   //    for(int col = 1; col <= n-row+1; col++){
   //       System.out.print("* ");
   //    }
   //    System.out.println();
   //  }

   
   // 5. Rhombus pattern printing:-
      // int n = 5;
      // for(int row = 1; row <= n; row++){
      //    for(int col = 1; col <= n-row; col++){
      //       System.out.print(" ");
      //    }
      //    for(int col = 1; col <= n; col++ ){
      //       System.out.print("* ");
      //    }
      //    System.out.println();
      // }

   // 6. Right Angle triangle:-
      // int n = 5;

      // for(int row = 1; row <= n; row++){
      //    for(int col = 1; col <= n-row; col++){
      //       System.out.print("  ");
      //    }
      //    for(int col = 1; col <= 2*row-1; col++){
      //       System.out.print("* ");
      //    }
      //    System.out.println();
      // }

   // 7. Reverse Right angle triangle:- 
      // int n = 4;

      // for(int row = 1; row <= n; row++){
      //    for(int col =1; col <= row-1; col++){
      //       System.out.print("  ");
      //    }
      //    for(int col = 1; col <= 2*n - 2*row + 1; col++){
      //       System.out.print("* ");
      //    }
      //    System.out.println();
      // }

      // 8. Hollow Rectangle Pattern:-

      // int n = 4;

      // for(int row = 1; row <= n; row++){
      //    for(int col = 1; col <= 5; col++){
      //       if(row == 1||row == n){
      //          System.out.print("* ");
      //       }
      //       else{
      //          if(col == 1){
      //             System.out.print("* ");
      //          }
      //          else if(col == 5){
      //             System.out.print("* ");
      //          }

      //          else{
      //             System.out.print("  ");
      //          }
      //       }
      //    }
      //    System.out.println();
      // }

      // 9. Hollow right angle triangle:-
      // int n = 10;
      // for(int row = 1; row <= n; row++){
         
      //       if(row ==1|| row == 2|| row == n){
      //        for(int col = 1; col <= row; col++){
      //          System.out.print("* ");
      //        }
      //       }
      //       else{
      //          System.out.print("* ");

      //          for(int col = 1; col <= row -2; col++){
      //             System.out.print("  ");
      //          }

      //          System.out.print("* ");
      //       }
      //       System.out.println();
         
      // }

      // 10. Hollow Equilateral triangle:-
      int n = 5;

      for(int row = 1; row <= n; row++){
         for(int col = 1; col <= n-row; col++){
             System.out.print("  ");
            }
         if(row == 1|| row == n){
            for(int col =1 ; col <= 2*row-1; col++){
            System.out.print("* ");
           }
         }
         else{
            System.out.print("* ");

            for(int col =1; col <= 2*row-3; col++){
               System.out.print("  ");
            }

            System.out.print("* ");
         }
         System.out.println();
      }
   
   
   }
     
}
