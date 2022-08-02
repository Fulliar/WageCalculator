public class Employee {

    String name;
    double wage;
    int workHours;
    int hireYear;


    public Employee(String name, double wage, int workHours, int hireYear){

        this.name = name;
        this.wage = wage;
        this.workHours = workHours;
        this.hireYear = hireYear;

    }

    public double tax(){
        double taxPaid = 0;
        if(wage <= 1000 && wage >= 0){
            System.out.println("The amount of wage has no tax to be paid... ");

        } else if (wage <= 0){
            System.out.println("Wage entry is false...");
            return taxPaid;
        } else {

            taxPaid = (wage * 0.03);
            return taxPaid;
        }
        return taxPaid;
    }

    public double bonus() {
        double bonus = 0;
        if (workHours > 40) {
            double extra = workHours - 40;
            int counter = 0;

            while (extra-- > 0) {
                counter++;
            }
            bonus = (counter * 30);
            return bonus;

        }else return bonus;
    }

    public double raiseSalary(){
        int currentYear = 2021;
        int yearWorked = currentYear - hireYear;
        int salaryRaise = 0;
        if(yearWorked<10){

            salaryRaise = (int) (wage * 0.05);
            return salaryRaise;

        } else if (yearWorked>9 && yearWorked<20){

            salaryRaise = (int) (wage * 0.1);
            return salaryRaise;

        } else if (yearWorked > 19){

            salaryRaise = (int) (wage * 0.15);
            return salaryRaise;
        }
    return salaryRaise;
    }




    public String toString(){
        System.out.println("Adı : " + this.name);
        System.out.println("Maaşı : " + this.wage);
        System.out.println("Çalışma Saati : " + this.workHours);
        System.out.println("Başlangıç Yılı : " + this.hireYear);
        System.out.println("Vergi : " + tax());
        System.out.println("Bonus : " + bonus());
        System.out.println("Maaş Artışı : " + raiseSalary());
        System.out.println("Vergi ve Bonuslar ile birlikte maaş : " + (this.wage+bonus()-tax()));
        System.out.println("Toplam Maaş : " + (this.wage +raiseSalary()));

        return null;
    }
}
