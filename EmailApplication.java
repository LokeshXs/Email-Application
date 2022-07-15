import java.util.Scanner;

public class EmailApplication {
    private String firstName;
    private String lastName;
    private Scanner scanner ;
    private GenerateCompanyPortalPassword generateCompanyPortalPassword;
    private GenerateEmployeeID generateEmployeeID;
    private RegisterDepartment registerDepartment;
    private String department;

    public EmailApplication(){

        scanner = new Scanner(System.in);
        generateCompanyPortalPassword = new GenerateCompanyPortalPassword();
        generateEmployeeID = new GenerateEmployeeID();
        registerDepartment = new RegisterDepartment();
    }

    // Method to start application
    public void launchApplication(){
        System.out.println("Welcome ");
        System.out.println("I am happy to see you :)\n");

        System.out.println("************************************************");
        System.out.print("First Name: ");
        this.firstName = scanner.nextLine();
        System.out.println();
        System.out.print("Last Name: ");
        this.lastName = scanner.nextLine();
        System.out.println("************************************************");
        System.out.println();


        System.out.println("Let's register your department ");
        System.out.println("------------------------------------------------");

        System.out.println("Departments Codes: ");
        String[] departmentList = registerDepartment.getDepartmentList();
        System.out.println();
        System.out.print("Enter you department's code: ");
        int code = scanner.nextInt();
        this.department = departmentList[code-1];
        System.out.println("Department Registered Successfully\n");



        System.out.println("Generating Employee ID ...");
        String empID = generateEmployeeID.getID();
        System.out.println("Employee ID: "+empID);
        System.out.println();

        System.out.println("Finding your HR contact details . . .\n");

        System.out.println("************************************************");
        System.out.println("Name: Rajesh Mehra");
        System.out.println("Phone Number: 9432123456");
        System.out.println("Work Phone: 456321");
        System.out.println("************************************************");












    }


}
