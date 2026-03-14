public class maxsub {
    public static void maxsubarraysum(int numbers[]) {
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;
        int prefix[] = new int[numbers.length];

        // Build prefix sum array
        prefix[0] = numbers[0];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + numbers[i];
        }

        // Check all subarrays using prefix sums
        for (int i = 0; i < numbers.length; i++) {       // start index
            for (int j = i; j < numbers.length; j++) {   // end index
                currsum = (i == 0) ? prefix[j] : prefix[j] - prefix[i - 1];

                if (maxsum < currsum) {
                    maxsum = currsum;
                }
            }
        }

        System.out.println("maxsum = " + maxsum); // moved INSIDE the method
    }
    
}

    



    