/**
 * threesome
 */

public class threesome {

    // QUESTION
// Input: nums = [-1,0,1,2,-1,-4]
// Output: [[-1,-1,2],[-1,0,1]]
// Explanation: 
// nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
// nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
// nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
// The distinct triplets are [-1,0,1] and [-1,-1,2].
// Notice that the order of the output and the order of the triplets does not matter.


	public static void main(String[] args) {
		int[] num = {1,1,2,5,5,5};

        for (int i=0; i < num.length; i++){
            for (int j = 0; j < num.length; j++) {
                for (int k = 0; k < num.length; k++) {
                    if ((num[i] != num[j]) && (num[i] != num[k]) && (num[j] != num[k])){
                    	int num1 = num[i];
                        int num2 = num[j];
                        int num3 = num[k];
                        
                        int sum = num1 + num2 +num3;
                        if (sum == 0) {
                        	System.out.println(num1 + " , " + num2 + " , " + num3);
                        }else {
                        	System.out.println("[]");
                        }
                    }
                }
            }
        }
		
	}

}
