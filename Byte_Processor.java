class ByteProcessor
{
 static int[] slice(int x, int flag)
 {  
  if(flag == 1)
  {
   int arr[] = { (x & 0xE0) >> 5, (x & 0x1C) >> 2, x & 0x3};
   return arr;
  }
  else if(flag == 2)
  {
   int arr[]={(x & 0xE0) >> 5, (x & 0x18) >> 3, x & 0x7};
   return arr; 
  }
  else if(flag == 3)
  {
   int arr[]={(x & 0xC0) >> 6, (x & 0x38) >>3, x & 0x7};
   return arr;
  }
  return null;
 }


 static int combine(int arr[], int flag)
 {
  if(flag == 1)
   return arr[0] <<5 | (arr[1]<<2) |arr[2];
  
  else if(flag == 2)
   return arr[0] <<5 | (arr[1]<<3) |arr[2];
   	
  else if(flag == 3)
   return arr[0] <<6 | (arr[1]<<3) |arr[2];
   

  return 0;
 }


 public static void main(String args[])
 {
  int x = 116;
  int arr[] = slice(x, 1);
  System.out.println(arr[0]+ " " + arr[1] + " " + arr[2]);

  int y = combine(arr, 1);
  System.out.println(y);
  

 }//main
}
