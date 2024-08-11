/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package vu.vurunners;

/**
 *
 * @author persy
 */
public class VURUNNERS {

    public static void main(String[] args) {
            
        String[] names = {"Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex", "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda", "Aaron", "Kate"};
        int[] times = {341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299, 343, 317, 265};

        // Find the fastest runner
        int fastestTime = times[0];
        String fastestName = names[0];
        for (int i = 1; i < times.length; i++) {
            if (times[i] < fastestTime) {
                fastestTime = times[i];
                fastestName = names[i];
            }
        }
        System.out.println("Fastest runner: " + fastestName + " with a time of " + fastestTime + " minutes");

        // Find the second fastest runner
        int secondFastestTime = Integer.MAX_VALUE;
        String secondFastestName = "";
        for (int i = 0; i < times.length; i++) {
            if (times[i] < secondFastestTime && times[i] != fastestTime) {
                secondFastestTime = times[i];
                secondFastestName = names[i];
            }
        }
        System.out.println("Second fastest runner: " + secondFastestName + " with a time of " + secondFastestTime + " minutes");
    }
}

