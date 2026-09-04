public class Basic_maths_for_DSA {
    //1. Print Digits of a number.
    static void printnumber(int num){
        while(num != 0){
            int digit = num %  10;
            System.out.println(digit);

            num = num/10;
        }
    }

    //2. Counts digits of a number.
        static int countnumber(int num1){
            int count = 0;
        while(num1 != 0){
            int digit = num1 %  10;
            count++;

            num1 = num1/10;
        }
        return count;
    }

    //3. Sum of Digits of a number.
     static int sumofnumber(int num2){
            int sum = 0;
        while(num2 != 0){
            int digit = num2 %  10;
            sum = sum + digit;
            

            num2 = num2/10;
        }
        return sum;
    }

    //4. Reverse a Number.
    static int Reversenumber(int num3){
        int revNum = 0; 
        while(num3 != 0){
            int digit = num3 % 10;
            revNum = revNum*10 + digit; 

            num3 = num3 / 10;
        }
        return revNum;
    }

    //5. Palindrom Number check.
    static boolean  isPalindrome(int num4){
        int original = num4;
        int reversed = Reversenumber(num4);

        if(original == reversed){
            return true;
        }
        return false;
    }

    //6. Prime Number check.
    static boolean isPrime(int n){
        if(n <= 1){
            System.out.println("It's not a Prime number");
            return false;
        }
        for(int i = 2; i*i <= n; i++ ){
            if(n%i == 0){
                //not a prime
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        //1. Print Digits of a number.
        int num = 53127;
        printnumber(num);

        //2. Counts digits of a number.
        int num1 = 53127;
        int ans = countnumber(num1);
        System.out.println("The Digits of number are " + ans);

        //3. Sum of Digits of a number.
        int num2 = 53127;
        System.out.println("Sum of numbers is " + sumofnumber(num2));

        //4. Reverse a Number.
        int  num3 = 12345;
        System.out.println(Reversenumber(num3));

        //5. Palindrome Number.
        int num4 = 1267;
        System.out.println(isPalindrome(num4));

        //6. Prime number check.
        int n = 7;
        System.out.println(isPrime(n));


    }
}
