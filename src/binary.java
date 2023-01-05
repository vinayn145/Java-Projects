
public class binary {
	int binarySearch(int arr[],int l,int h,int k){
		if(h>=l){
			int mid=l+h/2;

			if(arr[mid]==k){
				return mid;
			}
			else if(arr[mid]>k){
				return binarySearch(arr,l,mid-1,k);
			}
			else {
				return binarySearch(arr,mid+1,h,k);
			}
		}
		return 0;
	}
}
