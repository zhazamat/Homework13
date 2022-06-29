public class Lab6 {
    public static void main(String[] args) {
        java.util.Scanner s = new java.util.Scanner(System.in);

        int [] A= {1,2,3,4,5,6,7,8,9,10};
        int [] B= {10,11,12,13,15,16,17,18,19,20};
        int[] C= new int[A.length];
        for(int i=0;i< A.length;i++){
            System.out.println("A elements:"+A[i]);

        }
        System.out.println();
        for (int i=0;i<B.length;i++){
            System.out.println("B elements:"+B[i]);
        }
        System.out.println();
        if(A.length==B.length){
            System.out.println("  A and B length is equals ");
        }else System.out.println("A and B length is not equals");
        for(int i=0;i< A.length;i++){
           for(int j=0; j<B.length;j++){
               C[i]=A[i]+B[j];
           }
        }
        for(int i=0;i< C.length;i++){

            System.out.println("C elements:"+C[i]);
        }

        }
}
