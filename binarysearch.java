import java.util.Scanner;
class binarysearchdemo
{

 public static int binarySearch(int[] arr,int key){
  int low = 0,high = arr.length - 1;

  while(low<=high){
   int mid = (low+high)/2;
   if(key<arr[mid]){
    high = mid - 1;
   }else if(key>arr[mid]){
    low = mid + 1;
   }else{
    return mid;
   }
  }

  return -1;
 }

 public static void main(String []args)
 {
  Scanner sc = new Scanner(System.in);

  System.out.println("Enter total number of elements:");
  int n = sc.nextInt();
  int[] arr = new int[n];

  System.out.println("Enter elements in sorted order:");
  for(int i =0;i<n;i++){
   arr[i] = sc.nextInt();
  }

  System.out.println("Enter search value:");
  int key = sc.nextInt();

  int result = binarySearch(arr,key);

  if(result==-1){
   System.out.println("number not found");
  } else {
   System.out.println("number found");
  }

  sc.close();
 }}
