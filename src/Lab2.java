public class Lab2 {
    public static void main(String[] args) {
        java.util.Scanner s = new java.util.Scanner(System.in);
        System.out.println("Enter the number of guests:");
        int guests=s.nextInt();
        System.out.println("Enter the cakeRadius:");
        double cakeRadius=s.nextInt();
        double p=3.14;
        double diameterCake=2*cakeRadius;
        double C=p*diameterCake/guests;

        System.out.println("These are diameter cuts: "+C);

    }
}
