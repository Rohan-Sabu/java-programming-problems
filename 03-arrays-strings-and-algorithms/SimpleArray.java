public class SimpleArray{

    public static void main(String[] args){
        int[] myarr = new int [4];
        myarr[0] = 98;
        myarr[1] = 76;
        myarr[2] = 56;
        myarr[3] = 89;
        System.out.println("Simple Array");
        System.out.println(myarr[0]);
        System.out.println(myarr[1]);
        System.out.println(myarr[2]);
        System.out.println(myarr[3]);

        int[] arr = {1,2,3,4};
        int index = 0;
        System.out.println("Array Traversal using while loop");
        while(index < arr.length){
            System.out.println(arr[index]);
            index ++;
        }       
    }
}