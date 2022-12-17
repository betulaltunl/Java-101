public class Employee {
    String name ;
    double salary ;
    int workHours ;
    int hireYear ;

    public Employee(String name, double salary,int workHours,int hireYear){
        this.name=name;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYear=hireYear;
    }
    double tax(){
        if(this.salary>1000){
            double tax=this.salary*0.3;
            return tax;
        }else{
            double tax=0.0;
            return tax;
        }
    }
    int bonus(){
        if(this.workHours>40){
            return (this.workHours-40)*30;
        }else{
            return 0;
        }
    }

    double raiseSalary() {
        int totalYear=2021-this.hireYear;
        if(totalYear<10){
            double raiseSalary1=this.salary/20;
            return raiseSalary1;
        } else if (totalYear>9 && totalYear<20) {
            double raiseSalary1=this.salary/10;
            return raiseSalary1;
        }else {
            double raiseSalary1=this.salary*0.15;
            return  raiseSalary1;
        }
    }
     void info(){

        System.out.println("Adi: "+this.name);
        System.out.println("Maas: "+this.salary);
        System.out.println("Calisma saati: "+this.workHours);
        System.out.println("Baslangic yili: "+this.hireYear);
        System.out.println("Vergi. "+this.tax());
        System.out.println("Bonus: "+this.bonus());
        System.out.println("Maas artisi: "+this.raiseSalary());
        System.out.println("Vergi ve bonuslarla maas: "+(this.salary+this.bonus()-this.tax()));
        System.out.println("Toplam maas: "+(this.salary+this.bonus()-this.tax()+this.raiseSalary()));
    }
}
