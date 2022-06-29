public class Lab1 {
    public static void main(String[] args) {
        java.util.Scanner s = new java.util.Scanner(System.in);
        System.out.println("How many employees work:");
        int amountOfWorkers=s.nextInt();
        int[] salary = { 30000,45782,1000000,40000,90000 };
        int max=salary[0];
        int min=salary[0];
        for(int i=0;i< amountOfWorkers;i++){

            System.out.println("Salary of the   "+(i+1)
                    +"  employee  " +salary[i]);
            if(max<salary[i]){
                max=salary[i];


            }
            if(min>salary[i]){
                min=salary[i];

            }
        }
        System.out.println("Highest paid position: "+max +" som");
        System.out.println("The lowest paid position: "+min+" som");
        System.out.println("Salary difference : "+(max-min)+" som");

    }
}
