import java.util.*;

public class SortingAssignment {

    //Bubble Sort
    public static void BubbleSort(int arr[]){
        for(int i=0;i<arr.length-1;++i){
            for(int j=0;j<arr.length-1-i;++j){
                if(arr[j]<arr[j+1]){
                    int temp;
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }

    //Selection Sort

    public static void SelectionSort(int arr[]){
        for(int i=0;i<arr.length-1;++i){
            int minpos=i;

            for(int j=i+1;j<arr.length;++j){
                if(arr[j]>arr[minpos]){
                    minpos=j;
                }
            }

            //swap
            int temp=arr[i];
            arr[i]=arr[minpos];
            arr[minpos]=temp;
        }
    }

    //Insertion Sort

    public static void InsertionSort(int arr[]) {
        for(int i=1;i<arr.length;++i){
            int curr=arr[i];
            int prev=i-1;

            while(prev >=0 && arr[prev]<curr) {
                arr[prev+1]=arr[prev];
                prev--;
            }

            arr[prev+1]=curr;
        }
    }

    // Counting Sort

    public static void CountingSort(int arr[]){

        //Find Largest Number
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;++i)
        {
            largest=Math.max(largest,arr[i]);
        }

        //Create count array

        int count[]=new int[largest+1];
        for(int i=0;i<arr.length;++i){
            count[arr[i]]++;
        }

        //Sort Original Array
        for(int i=count.length-1,j=0;i>=0;++i){
            while(count[i]>0){
                arr[j]=i;
                j++;
                count[i]--;
            }
        }
    }
    //Display Array
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;++i)
        {
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String args[]){
        int arr[]={3, 6, 2, 1, 8, 7, 4, 5, 3, 1};
        SelectionSort(arr);
        printArr(arr);
    }
}

