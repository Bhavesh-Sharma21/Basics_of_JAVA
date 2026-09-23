package src;

public class Bitwise_Operators {
    public static void main(String[] args){
        System.out.println("=== 1. BASIC BITWISE OPERATORS ===");
        basicOperators();

        System.out.println("\n=== 2. SHIFT OPERATORS ===");
        shiftOperators();

        System.out.println("\n=== 3. PRACTICAL & ADVANCED APPLICATIONS ===");
        checkEvenOdd(5);
        checkEvenOdd(8);

        swapWithoutTemp(12, 25);

        checkPowerOfTwo(16);
        checkPowerOfTwo(18);

        manipulateBits();

        System.out.println("\n=== 4. REAL-WORLD ADVANCED USE CASE: BITMASKS ===");
        demonstrateBitmasking();
    }

    /**
     * Demonstrates the fundamental bitwise operations: AND, OR, XOR, and NOT.
     */
    private static void basicOperators() {
        int a = 5;  // Binary: 0000 0101
        int b = 3;  // Binary: 0000 0011

        // Bitwise AND (&): 1 if both bits are 1
        //   0101
        // & 0011
        // ------
        //   0001  (Decimal: 1)
        System.out.println("AND (5 & 3)     = " + (a & b));

        // Bitwise OR (|): 1 if at least one bit is 1
        //   0101
        // | 0011
        // ------
        //   0111  (Decimal: 7)
        System.out.println("OR (5 | 3)      = " + (a | b));

        // Bitwise XOR (^): 1 if bits are different
        //   0101
        // ^ 0011
        // ------
        //   0110  (Decimal: 6)
        System.out.println("XOR (5 ^ 3)     = " + (a ^ b));

        // Bitwise NOT (~): Inverts all bits (2's complement representation)
        // ~5 = -(5 + 1) = -6
        System.out.println("NOT (~5)        = " + (~a));
    }

    /**
     * Demonstrates Left Shift, Right Shift, and Unsigned Right Shift.
     */
    private static void shiftOperators() {
        int num = 8; // Binary: 0000 1000

        // Left Shift (<<): Shifts bits to the left, pads with 0. Equivalent to num * 2^shifts
        // 8 << 2 => 8 * 2^2 = 32
        System.out.println("Left Shift (8 << 2)        = " + (num << 2));

        // Right Shift (>>): Shifts bits to the right, preserves the sign bit (Sign extension)
        // 8 >> 2 => 8 / 2^2 = 2
        System.out.println("Right Shift (8 >> 2)       = " + (num >> 2));

        int negativeNum = -8;
        // Unsigned Right Shift (>>>): Shifts bits right, pads with 0 regardless of sign
        System.out.println("Signed Right Shift (-8 >> 2)   = " + (negativeNum >> 2));
        System.out.println("Unsigned Right Shift (-8 >>> 2) = " + (negativeNum >>> 2));
    }

    /**
     * Fast parity check using bitwise AND.
     */
    private static void checkEvenOdd(int n) {
        // Least Significant Bit (LSB) of an odd number is always 1, and for even is 0.
        if ((n & 1) == 0) {
            System.out.println(n + " is Even (Checked via n & 1)");
        } else {
            System.out.println(n + " is Odd (Checked via n & 1)");
        }
    }

    /**
     * In-place swapping of two numbers without using a temporary variable.
     */
    private static void swapWithoutTemp(int x, int y) {
        System.out.println("Before Swap: x = " + x + ", y = " + y);
        x = x ^ y; // x now holds XOR of both
        y = x ^ y; // y becomes original x
        x = x ^ y; // x becomes original y
        System.out.println("After XOR Swap: x = " + x + ", y = " + y);
    }

    /**
     * Advanced trick to check if a number is a power of 2.
     */
    private static void checkPowerOfTwo(int n) {
        // Numbers that are powers of 2 have only one set bit (e.g., 16 = 10000)
        // n - 1 flips all bits after the only set bit (e.g., 15 = 01111)
        // Hence, n & (n - 1) becomes 0
        boolean isPower = (n > 0) && ((n & (n - 1)) == 0);
        System.out.println("Is " + n + " a power of 2? " + isPower);
    }

    /**
     * Bit Manipulation: Getting, Setting, Clearing, and Toggling specific bits.
     */
    private static void manipulateBits() {
        int n = 12; // Binary: 0000 1100
        int i = 1;  // 1st bit position (0-indexed, from right)

        System.out.println("Original Number: " + n + " (Binary: " + Integer.toBinaryString(n) + ")");

        // 1. Get Bit: Check if i-th bit is set
        int mask = 1 << i;
        boolean isSet = (n & mask) != 0;
        System.out.println("Is bit at position " + i + " set? " + isSet);

        // 2. Set Bit: Force i-th bit to be 1
        int setNum = n | (1 << i);
        System.out.println("After setting bit " + i + ": " + setNum + " (Binary: " + Integer.toBinaryString(setNum) + ")");

        // 3. Clear Bit: Force i-th bit to be 0
        int clearMask = ~(1 << 2); // Clearing 2nd bit position
        int clearedNum = n & clearMask;
        System.out.println("After clearing bit 2: " + clearedNum + " (Binary: " + Integer.toBinaryString(clearedNum) + ")");

        // 4. Toggle Bit: Flip i-th bit (0->1 or 1->0)
        int toggleNum = n ^ (1 << i);
        System.out.println("After toggling bit " + i + ": " + toggleNum + " (Binary: " + Integer.toBinaryString(toggleNum) + ")");
    }

    /**
     * Advanced Bitmasking: Using an integer as a lightweight set of permissions.
     */
    private static void demonstrateBitmasking() {
        // Permissions defined as bits
        final int READ    = 1 << 0; // 0001 (1)
        final int WRITE   = 1 << 1; // 0010 (2)
        final int EXECUTE = 1 << 2; // 0100 (4)
        final int DELETE  = 1 << 3; // 1000 (8)

        // Give a user READ and WRITE permissions
        int userPermissions = READ | WRITE; // 0011 (3)
        System.out.println("Initial User Permissions Mask: " + userPermissions);

        // Check if user has WRITE permission
        if ((userPermissions & WRITE) != 0) {
            System.out.println("-> Access Granted: User can WRITE.");
        }

        // Check if user has EXECUTE permission
        if ((userPermissions & EXECUTE) != 0) {
            System.out.println("-> Access Granted: User can EXECUTE.");
        } else {
            System.out.println("-> Access Denied: User cannot EXECUTE.");
        }

        // Proactively add EXECUTE permission
        userPermissions |= EXECUTE; // 0111 (7)
        System.out.println("Permissions after adding EXECUTE: " + userPermissions);

        if ((userPermissions & EXECUTE) != 0) {
            System.out.println("-> Access Granted Now: User can EXECUTE.");
        }
    }
}
