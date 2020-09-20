/*Option 1 (Only Methods)*/
boolean checkBST(Mode root, int min, int max){
  if (root == null){
    return true;
  }
  if(root.data < min || root.data > max){
    return false;
  }
  return checkBST(root.left, min, root.data - 1) && checkBST(root.right, root.data - 1, max);
}

boolean checkBST(Node root){
  return checkBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
}
//----------------------------------------------------------------------------------------------------------------------------------------------
/*Option 2 (Only Methods)*/
public static void binarySearch(int arr[], int first, int last, int key){  
   int mid = (first + last)/2;  
   while( first <= last ){  
      if ( arr[mid] < key ){  
        first = mid + 1;     
      }else if ( arr[mid] == key ){  
        System.out.println("Element is found at index: " + mid);  
        break;  
      }else{  
         last = mid - 1;  
      }  
      mid = (first + last)/2;  
   }  
   if ( first > last ){  
      System.out.println("Element is not found!");  
   }  
 }  
//----------------------------------------------------------------------------------------------------------------------------------------------
/*Option 3*/
// Java implementation of recursive Binary Search 
class BinarySearch { 
	// Returns index of x if it is present in arr[l.. 
	// r], else return -1 
	int binarySearch(int arr[], int l, int r, int x) 
	{ 
		if (r >= l) { 
			int mid = l + (r - l) / 2; 

			// If the element is present at the 
			// middle itself 
			if (arr[mid] == x) 
				return mid; 

			// If element is smaller than mid, then 
			// it can only be present in left subarray 
			if (arr[mid] > x) 
				return binarySearch(arr, l, mid - 1, x); 

			// Else the element can only be present 
			// in right subarray 
			return binarySearch(arr, mid + 1, r, x); 
		} 

		// We reach here when element is not present 
		// in array 
		return -1; 
	} 

	// Driver method to test above 
	public static void main(String args[]) 
	{ 
		BinarySearch ob = new BinarySearch(); 
		int arr[] = { 2, 3, 4, 10, 40 }; 
		int n = arr.length; 
		int x = 10; 
		int result = ob.binarySearch(arr, 0, n - 1, x); 
		if (result == -1) 
			System.out.println("Element not present"); 
		else
			System.out.println("Element found at index " + result); 
	} 
} 
