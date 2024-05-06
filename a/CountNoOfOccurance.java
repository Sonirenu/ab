package com.a;

public class CountNoOfOccurance {

    public static void main(String[] args) {
        String str = "Welcome";
        
        // Iterate over each character in the string
        for (int i = 0; i < str.length(); i++) {
            // Get the current character
            char currentChar = str.charAt(i);
            // Initialize count for the current character
            int count = 0;
            
            // Iterate over the string again to count occurrences of the current character
            for (int j = 0; j < str.length(); j++) {
                // If the current character matches, increment the count
                if (str.charAt(j) == currentChar) {
                    count++;
                }
            }
            
            // Print the count of the current character
            System.out.println("Occurrence of '" + currentChar + "': " + count);
        }
    }
}

