public class ProductOfNumbers{

     public static void main(String []args){
        int[] numbers = {1, 2, 3, 4, 5};
        int[] mult =  {1,1,1,1,1};
        int index =0;
        for(int i=index++;i<mult.length;i++){
            for(int j =0;j<numbers.length;j++){
                mult[i]*=numbers[j];
            }
            mult[i]/=numbers[i];
        }
        System.out.println("Expected result : [120, 60, 40, 30, 24]");
        System.out.print("Actual result : [");
        for(int i=0;i<mult.length-1;i++){
            System.out.print(mult[i]+", ");
        }
        System.out.print(mult[mult.length-1]+"]");
     }
}