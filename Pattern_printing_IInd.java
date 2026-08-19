public class Pattern_printing_IInd{
    public static void main(String[] args) {
       //  11. Diamond pattern printing:-
    //   int n = 7;

    //   for(int row = 1; row <= n; row++){
    //      for(int col = 1; col <= n-row; col++){
    //         System.out.print("  ");
    //      }
    //      for(int col = 1; col <= 2*row-1; col++){
    //         System.out.print("* ");
    //      }
    //      System.out.println();
    //   }

    //   for(int row = 1; row <= n; row++){
    //     if(row == 1){
    //         continue;
    //     }
    //      for(int col =1; col <= row-1; col++){
    //         System.out.print("  ");
    //      }
    //      for(int col = 1; col <= 2*n - 2*row + 1; col++){
    //         System.out.print("* ");
    //      }
    //      System.out.println();
    //   }

    
    //   12. Hollow Diamond pattern printing:-

    //  int n = 4;
    // //  part 1

    //    for(int row = 1; row <= n; row++){
    //       for(int col = 1; col <= n-row; col++){
    //           System.out.print("  ");
    //          }
    //       if(row == 1){
    //          for(int col =1 ; col <= 2*row-1; col++){
    //          System.out.print("* ");
    //         }
    //       }
    //       else{
    //          System.out.print("* ");
 
    //          for(int col =1; col <= 2*row-3; col++){
    //             System.out.print("  ");
    //          }

    //          System.out.print("* ");
    //       }
    //       System.out.println();
         
    //    }
    //    // part 2
    //     for(int row = 1; row <= n-1 ; row++){
    //       for(int col = 1; col <= row; col++){
    //          System.out.print("  ");
    //       }
         
    //       if(row == n-1){
    //          System.out.print("* ");
    //       }

    //       else{
    //          // remaining rows
    //          // 1*
    //          System.out.print("* ");

    //          // 2(n-row)-3 spaces
    //          for(int col = 1; col <= 2*(n-row)-3; col++){
    //             System.out.print("  ");
    //          }

    //          // 1*
    //          System.out.print("* ");
    //       }
    //       System.out.println();
    //     }

    // 13 Butterfly pattern printing:-

    //  int n = 4;

    //  //  part 1
    //  for(int row = 1; row <= n; row++){
    //    for(int col = 1; col <= row; col++){
    //       System.out.print("* ");
    //    }

    //  //  part 2 

    //    for(int col = 1; col <= 2*(n-row); col++){
    //       System.out.print("  ");
    //    }
    
    //    //  part 3

    //    for(int col = 1; col <= row; col++){
    //       System.out.print("* ");
    //    }
    //    System.out.println();
    //  }

    // //  Inverted Symmetrical half:-
    //  //  part 4
    //  for(int row = 1; row <= n; row++){
    //    for(int col = 1; col <= n-row + 1 ; col++){
    //       System.out.print("* ");
    //    }

    //    // part 5

    //    for(int col = 1; col <= (2*row) - 2; col++){
    //       System.out.print("  ");
    //    }
 
    //    // part 6
 
    //    for(int col = 1; col <= n - row + 1 ; col++){
    //       System.out.print("* ");
    //    }
    //    System.out.println();
    //  }

    //  14. numeric Right angle triangle
    //  int n = 5; 

    //  for(int row = 1; row <= n; row++){
    //    for(int col = 1; col <= row; col++){
    //       System.out.print(col + " ");
    //    }
    //    System.out.println();
    //  }

    // 15. Numeric incremented right angle triangle:-

      // int n = 5;
      // int count = 1; 
      // for(int row = 1; row <= n; row++){
      //  for(int col = 1; col <= row; col++){
      //     System.out.print(count + " ");
      //     count++;
      //  }
      //  System.out.println();
      // }

      // 16. Alphabetic Right Angle Triangle:-

      // int n = 5; 
      // for(int row = 1; row <= n; row++){
      //    for(int col = 1; col <= row; col++){
      //       int a = col;
      //       int b = ('A' - 1);
      //       int ans = a+b;

      //       char finalans = (char) ans;
      //       System.out.print(finalans + " ");

      //    }
      //    System.out.println();
      // }

      // 17. Reverse Alphabetic Right Angle Triangle:-

      // int n = 5; 

      // for(int row = 1; row <= n; row++){
      //    for(int col = 1; col <= row; col++){
      //       int a = n - col;
      //       int b = 'A';

      //       int ans = a+b; 
      //       char finalans = (char)ans;

      //       System.out.print(finalans + " ");
      //    }
      //    System.out.println();
      // }

      // 18. SandGlass Pattern Printing :-

      // int n = 4; 
      // for(int row = 1; row <= n; row++){
      //   for(int col= 1; col <= row-1; col++){
      //     System.out.print("  ");
      //   }
      //   for(int col = 1; col <= 2*(n-row)+1; col++){
      //     System.out.print("* ");
      //   }
      //   System.out.println();
      // }

      // for(int row =1; row <= n; row++){
      //   if(row == 1){
      //     continue;
      //   }
      //   else{ 

      //     for(int col =1; col <= n-row; col++){
      //       System.out.print("  ");
      //     }
      //     for(int col = 1; col <= 2*row-1; col++){
      //       System.out.print("* ");
      //     }
      //   }
      //   System.out.println();
      //  }

      // 19. Numeric Right angle triangle:-

      // int n = 4; 

      // for(int row = 1; row <= n; row++){
      //   for(int col = 1; col <= n-row ; col++){
      //    System.out.print("  ");
      //    }
         
      //    for(int col = 1; col<= row; col++){
      //       System.out.print(col + " ");
      //    }

      //    int rowvalue = row;
      //    int decRowValue = row -1;
      //    for(int col =1; col <= row-1; col++){
      //       System.out.print(decRowValue + " ");
      //       decRowValue--;
      //    }

      //    System.out.println();
      // }

      //   20. Numeric Right Angle Trianlge same value in a single row:-
      // int n = 5; 

      // for(int row = 1; row <= n; row++){
      //    for(int col = 1; col <= n-row; col++){
      //       System.out.print("  ");
      //    }
      //    for(int col = 1; col <= 2*row-1; col++){
      //       System.out.print(row + " ");
      //    }

      //    System.out.println();
      // }

      // 21. Alphabetic Right Angle triangle with different values(some increasing and decreasing concepts):-

      // int n = 5; 

      // for (int row = 1; row <= n; row++){
      //    // Part 1
      //    for(int col = 1; col <= n-row; col++){
      //       System.out.print("  ");
      //    }
      //    // part 2
      //    for(int col = 1; col <= row; col++){
      //       int a = col; 
      //       int b = 'A' -1;
      //       int ans = a+b; 

      //       char finalans = (char)ans;
      //       System.out.print(finalans + " ");
      //    }
      //    // part 3

      //    char toPrint = (char)(row + 'A' - 2);
      //    for(int col = 1; col <= row-1; col++){
      //       System.out.print(toPrint + " ");
      //       toPrint--; 
      //    }
      //    System.out.println();
      // }



    }
    
}