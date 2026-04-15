class Solution {
    public int maxArea(int[] heights) {
        
        int left = 0;
        int right = heights.length - 1;
        int area = 0;
        Deque<Integer> areaStack = new ArrayDeque();

        while(left < right){
            area = (right - left) * Math.min(heights[left], heights[right]);
            if(heights[left] < heights[right]){
                left++;
            }else{
                right--;
            }

            if(areaStack.isEmpty()){
                areaStack.push(area);
            }else if(areaStack.peek() < area){
                areaStack.push(area);
            }
        }

        return areaStack.peek();
    }
}



// how to get O(N)? 