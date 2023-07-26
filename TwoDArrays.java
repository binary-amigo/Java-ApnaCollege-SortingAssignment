package Assignments;
public class TwoDArrays {

    //Spiral Matrix 

    
    public static void spiralMatrix(int matrix[][]){
        int startrow=0,startcol=0;
        int endrow=matrix.length-1, endcol=matrix.length-1;
        while(startrow<=endrow && startcol<=endcol){
            //top
            for(int j=startcol;j<=endcol;++j){
                System.out.print(matrix[startrow][j]+" ");
            }
            

            //right
            for(int i=startrow+1;i<=endrow;++i){
                System.out.print(matrix[i][endcol]+" ");
            }
            

            //bottom
            for(int j=endcol-1;j>=startcol;--j){
                if(startrow==endrow) break;
                System.out.print(matrix[endrow][j]+" ");
            }
            

            //left
            for(int i=endrow-1;i>=startrow+1;--i){                
                if(startcol==endcol) break;
                System.out.print(matrix[i][startcol]+" ");
            }

            startrow++;
            startcol++;
            endrow--;
            endcol--;
        }
    }

    //Diagnonal Sum

    public static int diagonalSum(int matrix[][]){
        int sum=0;
        for(int i=0;i<matrix.length;++i){
            //Primary Diagonal
            sum+= matrix[i][i];
            //Secondary Diagonal
            if(i!=matrix.length-1-i)
                sum+=matrix[i][matrix.length-1-i];
        }
        return sum;
    }


    //Staircase Search 


    //// Top right element
    public static boolean staircaseSearch1(int matrix[][], int key){
        int row=0,col=matrix.length-1;

        while(row<matrix.length && col>=0){
            if(matrix[row][col]==key){
                System.out.print("found at "+ "("+row+","+col+")");
                return true;
            }
            else if(key< matrix[row][col]){
                col--;
            }
            else
            row++;
        }
        return false;
    }

    ////Bottom right element

    public static boolean staircaseSearch2(int matrix[][], int key){
        int col=0,row=matrix.length-1;

        while(col<matrix.length && row>=0){
            if(matrix[row][col]==key){
                System.out.print("found at "+ "("+row+","+col+")");
                return true;
            }
            else if(key< matrix[row][col]){
                row--;
            }
            else
            col++;
        }
        return false;
    }

    public static void main(String args[]){
        int matrix[][]={{0,1,2},
                        {4,5,6},
                        {8,9,10}};
        // spiralMatrix(matrix);
        // System.out.print(diagonalSum(matrix));
        staircaseSearch2(matrix, 9);
    }
}
