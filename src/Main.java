public class Main {

    public static Employee createEmployee(String name, int depatment, int salary) {
        Employee employee = new Employee(name, depatment, salary);
        return employee;
    }


    public static void main(String[] args) {
         Employee[] employees = new Employee[10];
         employees[0] = createEmployee("Petrov Ivan Ivanovich", 1, 45500);
         employees[1] = createEmployee("Ivanova Olga Dmitrievna", 4, 65542);
         employees[2] = createEmployee("Obuchov Alex Olegovich", 2, 85500);
         employees[3] = createEmployee("Ivanov Andrey Ivanovich", 3, 95500);
         employees[4] = createEmployee("Smolov Semen Andreevich", 4, 66200);
         employees[5] = createEmployee("Puzov Igor Petrovich", 2, 63500);
         employees[6] = createEmployee("Ismailov Anzor Anzogovich", 1, 45500);
         employees[7] = createEmployee("Dmitrova Inna Ivanovna", 3, 65373);
         employees[8] = createEmployee("Titov Oleg Igorevich", 5, 76543);
         employees[9] = createEmployee("Kruglova Irina Ivanovna", 5, 65421);
         for (int i = 0; i < employees.length; i++) {
             System.out.println(employees[i]);
         }
        System.out.println(" ");
         int total = calculateAllSalary(employees);
        System.out.println("Общаая сумма затрат: " + total);
        System.out.println(" ");
        Employee minSalaryEmployee = findEmployeeMinSalary(employees);
        System.out.println("Сотрудник с минимальной зарплатой: " + minSalaryEmployee);
        System.out.println(" ");
        Employee maxSalaryEmployee = findEmployeeMaxSalary(employees);
        System.out.println("Сотрудник с максимальной зарплатой: " + maxSalaryEmployee);
        System.out.println(" ");
        double averafeSalary = calculateAverageSalary(employees);
        System.out.println("Среднее значение зарплат: " + averafeSalary);
        System.out.println(" ");
        printEmployeeFullNames(employees);
    }

    public static int calculateAllSalary(Employee[] employees) {
        int total = 0;
        for (int i = 0; i < employees.length ; i++) {
            total += employees[i].getSalary();
        }
        return total;
    }
    public static Employee findEmployeeMinSalary(Employee[] employees) {
        if (employees.length == 0) return null;
        Employee minSalaryEmployee = employees[0];
        for (int i = 1; i < employees.length; i++) {
            if (employees[i].getSalary() < minSalaryEmployee.getSalary())
                minSalaryEmployee = employees[i];
        }
        return minSalaryEmployee;
    }
    public static Employee findEmployeeMaxSalary(Employee[] employees) {
        if (employees.length == 0) return null;
        Employee maxSalaryEmployee = employees[0];
        for (int i = 1; i < employees.length; i++) {
            if (employees[i].getSalary() > maxSalaryEmployee.getSalary())
                maxSalaryEmployee = employees[i];
        }
        return maxSalaryEmployee;
    }
    public static double calculateAverageSalary(Employee[] employees) {
        if (employees.length == 0) return 0;
        return calculateAllSalary(employees) / employees.length;
    }
    public static void printEmployeeFullNames(Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].getName());
        }
    }



}