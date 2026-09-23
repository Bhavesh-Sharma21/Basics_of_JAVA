package src;

import java.util.Arrays;
import java.util.Scanner;
public class Method_Programs {
    public static void main(String[] args) {
        {
            String name = "Bhavesh Sharma";
            greet(name); //Bhavehs sharma
        }

    {//2nd Example....
        String name1 = "Vidya bhardwaj";
        changeName(name1);
        System.out.println(name1);
    }


    {//Now we learing the same king of swapping in arrays..
        
        int[] arr = {54,2,6,2,63};//Create an array..
        changeArr(arr);
        System.out.println(Arrays.toString(arr));//[54,23,6,2,63]
    }

    {// Prime number question...
        System.out.print("Enter any number to find it's prime or not:- ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(isPrime(n));
    
    }
    {// Armstrong Number...
        System.out.print("Enter any number for Verified Armstrong:- ");
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        System.out.println(isArmstrong(m));}

    {//Armstron in Loop...
        for(int i = 100; i < 1000; i++){
            if(isArmstrong(i)){
                System.out.print(i + " ");
            }
        }}


    }

    // No, pass by refrence in java  only pass by value. Naam ki value Bhavesh sharma thi toh output bhi value ke according aaya ab chahe woh greet ke refrence mei kuch bhi ho.

    static void greet(String naam){
        System.out.println(naam);
    }
    //2nd Example....
    static void changeName(String naam1){
        naam1 = "Kunal Vishwakarma"; //creating a new object

    }

    static void changeArr(int[] nums){
        nums[1] = 23; // If you make a change to the object via this ref variable, same object will be changed
    }

    //Q1. Prime no. find..
    static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        int c =2;
        while(c*c <= n){
            if (n%c == 0){
                return false;
            }
            c++;
        }
        return c*c > n;
    }
    //Q2. Armstrong numbers for all 3 digits...
    static boolean isArmstrong(int m){
        int original =  m;
        int sum = 0;

        while(m > 0){
            int rem = m % 10;
            m = m / 10;
            sum = sum + rem * rem * rem;
        }
        return sum == original;

    }
}
