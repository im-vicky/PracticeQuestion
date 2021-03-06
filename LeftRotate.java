// Java program for reversal algorithm of array rotation 

class LeftRotate {
    public static void leftRotate(int arr[], int d){
        if(d == 0){
            return;
        }
        int n = arr.length;
        rverse(arr, 0, d-1);
        rverse(arr, d, n-1);
        rverse(arr, 0, n-1);
    }

    static void rverse(int arr[], int start, int end){
        int temp;
        while(start < end){
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    static void printArray(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    /* Driver program to test above functions */
	public static void main(String[] args) 
	{ 
		int arr[] = { 1, 2, 3, 4, 5, 6, 7 }; 
		int n = arr.length; 
		int d = 2; 

		// in case the rotating factor is 
		// greater than array length 
		d = d % n; 
		leftRotate(arr, d); // Rotate array by d 
		printArray(arr); 
	} 
} 
/*This code is contributed by Devesh Agrawal*/

