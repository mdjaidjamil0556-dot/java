import java.util.Scanner;
class Sec_46_arr{
    public static void main(String ar[]){
        int []arr=new int[5];
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array elements");
        for(int i=0;i<=4;i++){
            arr[i]=sc.nextInt();

                              }
        System.out.println("The entered array element are :");
        for(int a:arr){
            System.out.println(a);
        }                      

    }
}