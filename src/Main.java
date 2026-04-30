public class Main {
    public static void main(String[] args) {
        // --- DATA INPUT ---
        int year = 2024; // Test with different years: 1900, 2000, 2025

        // --- MISSION ---
        // A year is a leap year if:
        // 1. It is divisible by 4
        // 2. AND (it is NOT divisible by 100 OR it IS divisible by 400)

        boolean isLeap = false; 

        // TODO: Write your if/else logic here to update 'isLeap'

        // --- OUTPUT ---
        if (isLeap) {
            System.out.println(year + " is a Leap Year!");
        } else {
            System.out.println(year + " is not a Leap Year.");
        }
    }
}
