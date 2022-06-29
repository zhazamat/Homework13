public class Lab4 {
    public static void main(String[] args) {
        java.util.Scanner s = new java.util.Scanner(System.in);
        System.out.println("Enter your age days: ");
        int days=s.nextInt();
        System.out.println("Your age in days: "+ days);
        int year=365;
        int monthaday=30;
        int age,month,day;
        age=Math.round(days/year);
        month=(days-(age*year))/monthaday;
        day=days-Math.abs(year*age)-(month*monthaday);

            System.out.println("Years: " + age + " ; Months: "+Math.abs(month) + " ; Days : "+Math.abs(day));



    }
}
