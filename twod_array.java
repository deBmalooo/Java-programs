
public class twod_array {
    public static void display(int matrix[][]){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void search(int matrix[][],int key){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==key){
                    System.out.println("The key is found at ("+i+","+j+")");
                }
                else{
                    System.out.println("Key not found");
                }
            }
        }
    }
    public static void spiral_matrix(int matrix[][]){

    }
    public static int diagonal_sum(int matrix[][]){
        int sum=0;
        for(int i=0;i<matrix.length;i++){
            sum+=matrix[i][i];
            if(i != matrix.length-i-1){
                sum+=matrix[i][matrix.length-i-1];
            }
        }
        return sum;
    }
    public static boolean staircase_search(int matrix[][],int k){
        int row=0,col=matrix[0].length-1;
        while(row<matrix.length && col>=0){
            if(matrix[row][col]==k){
                System.out.println("the key is found in: ("+row+","+col+")");
                return true;
            }
            else if(k<matrix[row][col]){         //The time complexity is O(m+n)
                col--;
            }
            else{
                row++;
            }
        }
        System.out.println("key not found");
        return false;
    }
    public static void main(String args[]){
        //Scanner sc=new Scanner(System.in);
        int matrix[][]={{10,20,30,40},
                        {15,25,45,45},
                        {27,29,37,48},
                        {32,33,39,50}};
        // System.out.println("Enter the values");
        // for(int i=0;i<matrix.length;i++){
        //     for(int j=0;j<matrix[0].length;j++){
        //         matrix[i][j]=sc.nextInt();
        //     }
        // }
        //display(matrix);
    //search(matrix, 8);
    //spiral_matrix(matrix);
    //System.out.println("The sum is:"+diagonal_sum(matrix));
    staircase_search(matrix,33);
    }
}  

