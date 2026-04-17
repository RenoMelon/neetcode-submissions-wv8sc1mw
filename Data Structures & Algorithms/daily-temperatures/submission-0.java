class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] res = new int[temperatures.length];
        Deque<Integer[]> stack = new ArrayDeque<Integer[]>(); // Gaat een pair bevatten: [temp, index]

        for(int i=0; i < temperatures.length; i++){
            while(!stack.isEmpty() && temperatures[i] > stack.peek()[0]){
                Integer[] stackTempAndIndex = stack.pop();
                res[stackTempAndIndex[1]] = (i - stackTempAndIndex[1]);
            }
            stack.push(new Integer[]{temperatures[i], i});
        }

        return res;
    }
}
