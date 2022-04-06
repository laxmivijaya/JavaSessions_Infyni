package arrays;

public class TestArray {

    public static void main(String[] args) {


            int a[]=new int [500];
         for (int i=0;i<500;i++){
             a[i]=i+1;
         }

        System.out.println(a[499]);

        for (int local:a) {
            System.out.println(local);
        }



    }
}
