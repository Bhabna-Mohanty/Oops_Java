import java.util.Scanner;

class Employee {
    double salary;
    int hoursOfWork;
    void getInfo(double salary, int hoursOfWork) {
        this.salary = salary;
        this.hoursOfWork = hoursOfWork;
    }
    void addSal() {
        if (salary < 500) {
            salary += 10;
        }
    }
    void addWork() {
        if (hoursOfWork > 6) {
            salary += 5;
        }
    }
    void displaySalary() {
        System.out.println("Final Salary: $" + salary);
    }
}

class que7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee emp = new Employee();
        System.out.print("Enter the salary: $");
        double salary = sc.nextDouble();
        System.out.print("Enter the number of hours of work per day: ");
        int hoursOfWork = sc.nextInt();
        emp.getInfo(salary, hoursOfWork);
        emp.addSal();
        emp.addWork();
        emp.displaySalary();
    }
}
