class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n= nums.length;
        int [] a= new int[2];
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
            if((nums[i]+nums[j])== target){
           a[0]=i;a[1]=j;
               
            }
        }
            
        }
        return a;
    }
    public static void main(String[] args) {
        int []b= {2,7,11,15};
        Solution solution= new Solution();
         
       int c[]= solution.twoSum(b,17);
       System.out.println(c[0]+" "+c[1]);
    }
}