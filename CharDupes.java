/**
 * Find duplicate characters in string
 * Oct 2019 EvgenyT
 */

public class CharDupes {

    public static void main(String[] args) {
        // Test string with some dupes
        String str = "Test for char dupes";
        // Char counting, the char is an index of array here
        // after 67.000 no new chars appears
        int[] charCount = new int[67000];
        // Fill the char counter array
        for (int idx = 0; idx < str.length(); idx++) {
            charCount[str.charAt(idx)]++;
        }
        // Show duped chars
        for (int idx = 0; idx < charCount.length; idx++) {
            // If char accured more than once print it
            if (charCount[idx] > 1) {
                // %c tells to printf idx as a char
                System.out.printf("'%c' count = %d \n", idx, charCount[idx]);
            }
        }
    }
}
