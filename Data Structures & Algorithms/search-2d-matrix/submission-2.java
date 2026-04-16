class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        // Plan voor O(log n + log m):
        // Binary search eigenlijk gewoon eerst de kolommen en dan de rows
        int rowIndex = searchRows(matrix, target);
        if(rowIndex == -1) return false;
        int left = 0;
        int right = matrix[rowIndex].length - 1;

        

        while(left <= right){
            int mid = left + (right - left) / 2;

            if(target < matrix[rowIndex][mid]){
                right = mid - 1;
            }else if(target > matrix[rowIndex][mid]){
                left = mid + 1;
            }else{
                // waarde gevonden
                return true;
            }
        }

        return false;

    }

    public int searchRows(int[][] matrix, int target){
        // Zoek voor juiste kolom index 
        int left = 0;
        int right = matrix.length - 1; // aantal rijen

        while(left <= right){
            int mid = left + (right - left) / 2;
            
            if(target < matrix[mid][0]){
                right = mid - 1;

            } else if(target > matrix[mid][matrix[0].length - 1]){
                left = mid + 1;
            }else{
                // rij gevonden
                return mid;

            }
        }

        return -1;

    }
}
