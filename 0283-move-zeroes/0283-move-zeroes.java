class Solution {
    public void moveZeroes(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        int count = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i] == 0){
                count++;
            }
            else{
                list.add(nums[i]);
            }
        }
        int index = 0;
        
        for(int i = 0;i<list.size();i++){
            nums[i] = list.get(i);
            index++;
        }

        while(count != 0){
            nums[index] = 0;
            index++;
            count--;
        }
    }
}