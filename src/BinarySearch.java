import javax.swing.text.Position;
import java.util.Arrays;
public class BinarySearch {

 //searchAlgo
    public int Bsearch(int arr[],int low,int high,int key) {

        if (low <= high) {
            int mid = (low + (high - low)) / 2;
            if (arr[mid] == key) {
                return mid;
            }
            if (arr[mid] > key) {
                return Bsearch(arr, mid + 1, high, key);
            }
            if (arr[mid] < key) {
                return Bsearch(arr, low, mid - 1, key);
            }

        }
        return 0;
    }

    public static void main(String[] args) {
        int arr[]={1,3,5,6};
        int n= arr.length;

        BinarySearch obj=new BinarySearch();
int res=obj.Bsearch(arr,0,n-1,3);
if(res>0){
    System.out.println("found at "+res+" .");
}else{
    System.out.println("not found");

}
    }
}
