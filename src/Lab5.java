public class Lab5 {
    public static void main(String[] args) {
        java.util.Scanner s = new java.util.Scanner(System.in);
        System.out.println("Enter coordination x: " );

        int x=s.nextInt();
        System.out.println("Enter coordination y: " );
        int y=s.nextInt();
        System.out.println("Enter coordination x1: " );
        int x1=s.nextInt();
        System.out.println("Enter coordination y1: " );
        int y1=s.nextInt();
        if(x1>x||y1>y){
            System.out.println("Your house is not in Flatland ");
        }
        if(x1<=x&&y1<=y){
            System.out.println("Your home is in Flatland.");
        }
        if(x1==0 && y1==0){
            System.out.println("Your home is at the dividing point in Flatland.");
        }
        if(x1>0& x1<x&&y1<0 &y1<y){
            System.out.println("Your home is in Southeast Flatland");

        }
        if(x1>0&&y1>0&x1<x&&y1<y){
            System.out.println("Your home is in Northeast Flatland");

        }
        if(x1<0&&y1>0&x1<x&&y1<y){
            System.out.println("Your home is in Northwest Flatland");

        }
        if(x1<0&&y1<0&x1<x&&y1<y){
            System.out.println("Your home is in Southwest Flatland");

        }



    }

}
