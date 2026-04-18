class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> tripletsList = new ArrayList<>();
        int right = nums.length - 1;
        int left = 0;

        for(int i = 0; i < nums.length - 1; i++){
            right = nums.length - 1;
            if(i > 0 && nums[i] == nums[i - 1]){
                continue;
            }
            left = i + 1;
            while(left < right){
                int sum = nums[i] + nums[left] + nums[right];

                if(sum == 0){
                    // geldige triplet, add to list
                    tripletsList.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                    // duplicate checks
                    while(left < right && nums[left] == nums[left - 1]) left++;
                    while(left < right && nums[right] == nums[right + 1]) right--;
                } else if(sum < 0){
                    left++;
                }else{
                    right--;
                }
            }

        }
        return tripletsList;
    }
}
