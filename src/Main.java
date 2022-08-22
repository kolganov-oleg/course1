public class Main {

    static Employee[] employees = new Employee[10];

    public static void main(String[] args) {
        employees[0] = new Employee("Ivan Ivanov", 1, 20000.0);
        employees[1] = new Employee("Ivan Smirnov", 2, 20000.0);
        employees[2] = new Employee("Ivan Sidorov", 3, 30000.0);
        employees[3] = new Employee("Ivan Ivanov", 4, 20000.0);
        employees[4] = new Employee("Ivan Ivanov", 5, 10000.0);
        employees[5] = new Employee("Ivan Ivanov", 1, 50000.0);
        printFullNameAllEmployee();
    }

    public static void printAllEmployee() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public static double getAndCalculateSalarySum() {
        double sum = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                sum = sum + employee.getSalary();
            }
        }
        return sum;
    }

    public static Employee getEmployeeMinSalary() {
        double minSalary = -1;
        Employee minSalaryEmp = null;
        int index = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                minSalary = employees[i].getSalary();
                minSalaryEmp = employees[i];
                index = i;
                break;
            }
        }
        for (int i = index; i < employees.length; i++) {
            if (employees[i] != null) {

                if (minSalary > employees[i].getSalary()) {
                    minSalary = employees[i].getSalary();
                    minSalaryEmp = employees[i];
                }
            }
        }
        return minSalaryEmp;
    }

    public static Employee getEmployeeMaxSalary() {
        double maxSalary = -1;
        Employee maxSalaryEmp = null;
        int index = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                maxSalary = employees[i].getSalary();
                maxSalaryEmp = employees[i];
                index = i;
                break;
            }
        }
        for (int i = index; i < employees.length; i++) {
            if (employees[i] != null) {

                if (maxSalary < employees[i].getSalary()) {
                    maxSalary = employees[i].getSalary();
                    maxSalaryEmp = employees[i];
                }
            }
        }
        return maxSalaryEmp;
    }

    public static double getCalculateAverageSalary() {
        if (employees.length != 0) {
            return getAndCalculateSalarySum() / employees.length;
        } else {
            return 0;
        }
    }

    public static void printFullNameAllEmployee() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee.getFullName());
            }
        }
    }
}