package src;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // //init
        // int[] brr = {45,23,83};
        // System.out.println("value on index 0 is " + brr[0]);
        // System.out.println("value on index 1 is " + brr[1]);
        // System.out.println("value on index 2 is " + brr[2]);

        // // for loop 
        // System.out.println("Print array values using for loop:-");

        // int [] jack = {48, 3, 23, 73};

        // int n = jack.length;

        // for(int index = 0; index <= n-1; index++){
        //     System.out.println("value on index " + index + " is " + jack[index]);
        // }

        // //foreach loop
        // System.out.println("Print array values using foreach loop:-");

        // int [] foreach = {74,35, 98, 45};

        // for(int val: foreach){
        //     System.out.println(val);
        // }

        // Taking input in Array:-
        // int []crr = new int [5];
        // int n = crr.length;
        // //input
        // for(int i = 0; i <= n-1; i++){
        //     System.out.println("Provide input for index " + i);
        //     crr[i] = sc.nextInt();           
        // }

        // //print
        // System.out.println("Your array contains:- ");
        // //Type 1 for output;
        // // for(int val:crr){
        // //     System.out.println(val);
        // // }
        // //Type 2 for output;
        // for(int j = 0; j <=n-1; j++){
        //     System.out.println(crr[j]);
        // }

        // //PRACTICE:-
        // // problem no.1: Sum the total elements of an array.
        // int drr [] = {45,32,36,28,10};
        // int n = drr.length;
        // int sum = 0;

        // for(int i = 0; i <= n-1; i++){
        //     int value = drr[i];
        //     sum = sum + value;
        // }
        // System.out.println("The total sum of array is " + sum);

        // //problem no.2: Multiply the total elements of an Array.
        // int err [] = {4,10,8,9,12};
        // int m = err.length;
        // int ans = 1; 

        // for(int i = 0; i <= m-1; i++){
        //     int value = err[i];
        //     ans = ans * value;
        // }
        // System.out.println("Multiply of every element is " + ans);

        // //problem no.3: Find the max value in Array.

        // int frr[] = {93, 23, 78, 104, -6};
        // int o = frr.length;
        // int maxvalue = frr[0];

        // for(int i = 0; i <= o-1; i++){
        //     if(maxvalue < frr[i]){
        //         maxvalue = frr[i];
        //     }
        // }
        // System.out.println("The maximum value of this array is " + maxvalue);

        // //problem no.4: Find the min value in Array.

        // int grr[] = {23,63,62,109, 223};
        // int p = grr.length;
        // int minvalue = grr[0];

        // for(int i = 0; i <= p-1; i++){
        //     if(grr[i] < minvalue){
        //         minvalue = grr[i];
        //     }
        // }
        // System.out.println("The minimum value of this Array is " + minvalue);

        //2D src.Arrays:-

        // int arr [][] = {{1,2}, {2,3,4,5}, {3,4,4,5,6,7},{4}};
        // // System.out.println(arr[2][0]);

        // for(int rowIndex = 0; rowIndex <= arr.length -1; rowIndex++){
        //     for(int colIndex = 0; colIndex <= arr[rowIndex].length - 1; colIndex++){
        //         System.out.print(arr[rowIndex][colIndex] + " ");
        //     }
        //     System.out.println();
        // }

        // //Take Input in 2D src.Arrays

        // int brr [][] = new int [3][4];
        // for(int i = 0; i <= brr.length -1; i++){
        //     for(int j = 0; j <= brr[i].length - 1; j++){
        //         System.out.print("Enter the value for row " + i + "and column "+ j + " ");
        //         brr [i][j] = sc.nextInt();
        //     }
            
        // }

        //  for(int rowIndex = 0; rowIndex <= brr.length -1; rowIndex++){
        //     for(int colIndex = 0; colIndex <= brr[rowIndex].length - 1; colIndex++){
        //         System.out.print(brr[rowIndex][colIndex] + " ");
        //     }
        //     System.out.println();
        // }

        //Practice:-
        //problem no.1: Sum the total element of an Array

        int arr [][] = {{34,521,64},{45,23,75},{51,84}};
        int sum = 0;

        for(int rowIndex = 0; rowIndex <= arr.length-1; rowIndex++){
            for(int colIndex = 0; colIndex <= arr[rowIndex].length -1; colIndex++){
                int value = arr[rowIndex][colIndex];
                sum = sum + value;
            }
        }
        System.out.println("sum of 2D array is " + sum);

        //problem no.2: Multiply the total element of an Array

        int brr [][] = {{34,5,64},{45,6,75},{1,84}};
        int mult = 1;

        for(int rowIndex = 0; rowIndex <= brr.length - 1; rowIndex++){
            for(int colIndex = 0; colIndex <= brr[rowIndex].length - 1; colIndex++){
                int value = arr[rowIndex][colIndex];
                mult = mult*value;
            }
        }
        System.out.println("Product of 2D Array is " + mult);

        //problem no.3: Max value of 2D array.
        int grr[][] = {{37,29,808},{82,98},{45,73,100,45},{203}};
        int maxvalue = grr[0][0];

        for(int i = 0; i <= grr.length -1; i++){
            for(int j = 0; j <= grr[i].length -1; j++){
                if(grr[i][j] > maxvalue){
                    maxvalue = grr[i][j];
                }
            }
        }
        System.out.println("Maximum value of 2D Array is " + maxvalue);

        //problem no.4: Min value of 2D Array.

        int hrr[][] = {{37,29,808},{82,98},{45,73,100,45},{203}};
        int minvalue = hrr[0][0];

        for(int i = 0; i <= hrr.length -1; i++){
            for(int j = 0; j <= hrr[i].length -1; j++){
                if(grr[i][j] < minvalue){
                    minvalue = hrr[i][j];
                }
            }
        }
        System.out.println("Maximum value of 2D Array is " + minvalue);
        
    }
}
