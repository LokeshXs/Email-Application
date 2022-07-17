import java.util.Locale;
import java.util.Scanner;

public class EmailApplication {
    private String firstName;
    private String lastName;
    private Scanner scanner ;
    private GenerateCompanyPortalPassword generateCompanyPortalPassword;
    private GenerateEmployeeID generateEmployeeID;
    private RegisterDepartment registerDepartment;
    private String department;

    private String password;

    private int mailBoxCapacity = 500;

    private String alternateMailId;

    private String workPhoneNumber;

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
        System.out.println("************************************************\n");


        System.out.println("Generating your company mail-id . . .");
        System.out.println("Mail-id -> "+firstName.toLowerCase(Locale.ROOT)+"."+lastName.toLowerCase(Locale.ROOT)+"@abc.com");
        this.password = generateCompanyPortalPassword.getPassword();
        System.out.print("Password -> "+this.password);

        while (true) {
            System.out.println();
            System.out.println("Do you want to change password (yes/no)");
            String choice = scanner.next();

            if ((choice.toUpperCase(Locale.ROOT)).equals("YES")) {
                System.out.print("Enter new password: ");
                String newPassword = scanner.nextLine();
                scanner.nextLine();
                this.password = newPassword;
                System.out.println("Password changed successfully");
                break;
            } else if ((choice.toUpperCase(Locale.ROOT)).equals("NO")) {
                System.out.println("Password saved successfully");
                break;
            } else {
                System.out.println("Invalid Input");
            }
        }
        System.out.println();


        System.out.println("Mail-Box Capacity: "+this.mailBoxCapacity);
        System.out.println();

        System.out.println("Enter your alternate mail-id");
        this.alternateMailId = scanner.next();
        System.out.println("Alternate mail-id is saved successfully\n");


        System.out.println("Setting up your work phone. . . ");
        this.workPhoneNumber = generateEmployeeID.getID();
        System.out.println("Your work phone number is: "+this.workPhoneNumber);

        System.out.println();
        System.out.println();
        System.out.println("We have successfully generated your profile");
















    }


}
