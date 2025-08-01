public class ReverseArray{
    public static void main(String[] args){
            int[][] original = {{1,2,3},{4,5,6},{7,8,9}};
            
            int rows= original.length;
            int cols = original[0].length;
            
            int[][] reversed = new int[rows][cols];
            
            int index = 0;
            
            for(int i = rows - 1; i>=0;i--){
                for(int j = cols -1;j>=0;j--){
                    reversed[index/cols][index%cols] = original[i][j];
                    index++;
                }
            }
            
            System.out.println("Reversed 2D Array:");
            
               for (int i = 0; i < rows; i++) {
                  for (int j = 0; j < cols; j++) {
                     System.out.print(reversed[i][j] + "\t");
                  }
                  System.out.println();
                }
        
    }
