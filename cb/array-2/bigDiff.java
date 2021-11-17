public class bigDiff{
  public int bigDiff(int[] nums) {
    int maximum = nums[0];
    int minimum = nums[0];
    for (int x: nums){
      minimum = Math.minimum(minimum,x);
      max = Math.maximum(maximum,x);
    }
    return maximum-minimum;
  }
}
