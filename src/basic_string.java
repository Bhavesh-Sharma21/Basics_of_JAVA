package src;

public class basic_string {

         // Let's Practice:-
        //Problem no.1: Print each Character of the String.

        static void printchar(String str){
            int n = str.length();

            for(int i = 0; i < n; i++){
                char ch = str.charAt(i);
                System.out.println(ch);
            }
        }
        //Problem no.2: Count length of String without length().

        static int getLength(String str2){
            char[] arr = str2.toCharArray();
            int len = arr.length;

            return len;
        }

        //Problem no.3: Count vowels in String.

        static int countVowels(String str3){
            int count = 0;
            int n = str3.length();
            for(int i = 0; i < n; i++){
                char ch = str3.charAt(i);
                if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
                    count++;
                }
            }
            return count;
        }

        //Problem no.4: Reverse a String.

        static String getreverseString(String str4){
            String reverse = "";
            int n = str4.length();
            for(int i = n-1; i >= 0; i--){
                char ch = str4.charAt(i);
                reverse = reverse + ch;
            }
            return reverse;
        }

        //Problem no.5: Check String is a palindrome or not.

        static boolean  isPalindrome(String str5){
            String original = str5;
            String reversed = getreverseString(original);

            for(int i = 0; i < original.length(); i++){
                char ch1 = original.charAt(i);
                char ch2 = reversed.charAt(i);
                
                if(ch1 != ch2){
                    return false;
                }
            }
            return true;
        }


    public static void main(String[] args) {
        // String name = "Bhavesh";
        // String lastname = new String ("Sharma");

        // System.out.println(name + " " + lastname);//print the strings
        // System.out.println(name.length());// find the length of string
        // System.out.println(lastname.charAt(3));// Access the charater

        // //Comparing Strings:-
        // String name1 = "Aayush";
        // String name2 = "aayush";

        // if(name1 == name2){ // == It's compares only reference position in string pool which is both are equal.
        //     System.out.println("Both are equal.");
        // }
        // else{
        //     System.out.println("Both aren't equal");
        // }

        // if(name1.equals(name2)){ // .equals It's actually Compare the String for each characters.
        //      System.out.println("Both are equal.");
        // }
        // else{
        //     System.out.println("Both aren't equal");
        // }
        // if(name1.equalsIgnoreCase(name2)){ // .equalsIgnoreCase Same as .equals() function bgut it's not a Case case sensetive.
        //      System.out.println("Both are equal.");
        // }
        // else{
        //     System.out.println("Both aren't equal");
        // }

        // //Strign Input:-

        // Scanner sc = new Scanner(System.in);

        // System.out.println("Provide the String Content:");

        // String str = sc.nextLine();
        // System.out.println("The value of nextLine " + str);

        // System.out.println("Provide the String Content:");

        // String str2 = sc.next();
        // System.out.println("The value of next " + str2);

        // Most Useful Methods in String:-
        // String ret = "Chess is Best";
        // System.out.println(ret.toUpperCase()); //  CHESS IS BEST
        // System.out.println(ret.toLowerCase()); //  chess is best
        // System.out.println(ret.substring(3, 7)); // ss i
        // System.out.println(ret.contains("is")); // true
        // System.out.println(ret.startsWith("Ches")); // true
        // System.out.println(ret.endsWith("is")); // false
        // System.out.println(ret.replace("is","the")); // Chess the Best
        
        // String ret2 = "   ";
        // System.out.println(ret2.isEmpty()); // false
        // System.out.println(ret2.isBlank()); // true

        // int num = 5324;
        // String retro = String.valueOf(num);
        // System.out.println(num + 1); //5325
        // System.out.println(retro + 1); //53241
        
        // String dew = "Mountains";
        // char[] crr = dew.toCharArray();

        // for(char ch: crr){
        //     System.out.println("Value of the char: " + ch + ", "); 
        // } /* Value of the char: M,Value of the char: o, Value of the char: u, Value of the char: n, Value of the char: t, Value of the char: a, Value of the char: i, Value of the char: n, Value of the char: s */

        // // split -> output -> String Array
        // String input = "India,is,my,country";
        // String[] words = input.split(",");
        // for(String val: words){
        //     System.out.println(val);
        // }

        // Let's Practice:-
        //Problem no.1: Print each Character of the String.

        String str = "Bhavesh";
        printchar(str);

        //Problem no.2: Count length of String without length().
        String str2 = "System";
        System.out.println(getLength(str2));

        //Problem no.3: Count vowels in String.
        String str3 = "Bhavesh";
        System.out.println(countVowels(str3));

        //Problem no.4: Reverse a String.
        String str4 = "Admin";
        System.out.println(getreverseString(str4));

        //Problem no.5: Check String is a palindrome or not.
        String str5 = "RACECAR";
        System.out.println(isPalindrome(str5));




        

        
    }
}
