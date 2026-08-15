public class Pattern_printing_IInd{
    public static void main(String[] args) {
        int n = 7;
        for(int row = 1; row <= n; row++){
            for(int col = 1; col <= n-row; col++){
                System.out.print("  ");
            }
            for(int col =1; col <= 2*row-1; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
}