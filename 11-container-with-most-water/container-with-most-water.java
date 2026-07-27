class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;
        while( left < right ){
            int length, breadth;
            breadth = right - left;
            if ( height[left] < height[right] ){
                length = height[left];
            } else{
                length = height[right];
            }
            int area = length * breadth;
            if(maxArea < area){
                maxArea = area;

            }
            if ( height[left] < height[right]){
                left++;
            } else{
                right--;
            }
        }
        return maxArea;
    }
}