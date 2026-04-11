class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for(String t : tokens){
            if(!"*/+-".contains(t)){
                stack.push(Integer.valueOf(t));
                continue;
            }
            else{
                int secondNum = stack.pop();
                int firstNum = stack.pop();
                
                int result;

                switch(t) {
                    case "+":
                        result = firstNum + secondNum;
                        break;
                    case "-":
                        result = firstNum - secondNum;
                        break;
                    case "*":
                        result = firstNum * secondNum;
                        break;
                    case "/":
                        result = firstNum / secondNum;
                        break;
                    default:
                        throw new IllegalArgumentException("Invalid operator");
                    
                }
                stack.push(result);
            }
        }

        return stack.pop();
    }
}


