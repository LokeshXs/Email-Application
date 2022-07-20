
//importing packages

import java.util.Locale;
import java.util.Scanner;

//syntax to create a class
//public -> access modifier
//class -> A keyword to declare a class
//EmailApplication -> Class name

public class EmailApplication {

    // Syntax to declare a variable the variables which are declared in class not in method are class members or instance variables
    // private is access modifier. so it can only be with this class
    //first name is name of variable
    private String firstName;
    private String lastName;

    // this statement is called declaration of class object
    // Scanner is a class
    // scanner is name of object or reference variable
    private Scanner scanner;
    private GenerateCompanyPortalPassword generateCompanyPortalPassword;
    private GenerateEmployeeID generateEmployeeID;
    private RegisterDepartment registerDepartment;
    private String department;
    private String companyMailID;

    private String password;

    // Here I am setting a default value to mailBoxCapacity
    private int mailBoxCapacity = 500;

    private String alternateMailId;

    private String workPhoneNumber;

    // declaring a constructor of the class

    public EmailApplication() {

        scanner = new Scanner(System.in);
        generateCompanyPortalPassword = new GenerateCompanyPortalPassword();
        generateEmployeeID = new GenerateEmployeeID();
        registerDepartment = new RegisterDepartment();
    }

    // Method to start application
    public void launchApplication() {
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
        String[] departmentList = registerDepartment.getDepartmentList();  // getting the list of departments from RegisterDepartment class and assigning to new array
        System.out.println();
        System.out.print("Enter you department's code: ");
        int code = scanner.nextInt(); //taking input as int for department codes
        this.department = departmentList[code - 1];
        System.out.println("Department Registered Successfully\n");


        System.out.println("Generating Employee ID ...");
        String empID = generateEmployeeID.getID(); //getting the employee id from GenerateEmployeeID class and assigning it to new String
        System.out.println("Employee ID: " + empID);
        System.out.println();

// I just hardcoded the HR details coming up I will create a class for this
        System.out.println("Finding your HR contact details . . .\n");

        System.out.println("************************************************");
        System.out.println("Name: Rajesh Mehra");
        System.out.println("Phone Number: 9432123456");
        System.out.println("Work Phone: 456321");
        System.out.println("************************************************\n");

//Generating company mail-id
        System.out.println("Generating your company mail-id . . .");
        this.companyMailID = firstName.toLowerCase(Locale.ROOT) + "." + lastName.toLowerCase(Locale.ROOT) + "@abc.com";
        System.out.println("Mail-id -> " + this.companyMailID);
        this.password = generateCompanyPortalPassword.getPassword();
        System.out.print("Password -> " + this.password);

        //Functionality if you want to change the password
        while (true) {
            System.out.println();
            System.out.println("Do you want to change password (yes/no)");
            String choice = scanner.next();
            scanner.nextLine();

            if ((choice.toUpperCase(Locale.ROOT)).equals("YES")) {
                System.out.print("Enter new password: ");
                String newPassword = scanner.nextLine();
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

// printing mail-Box capacity
        System.out.println("Mail-Box Capacity: " + this.mailBoxCapacity);
        System.out.println();

        //Taking input for alternate main id
        System.out.println("Enter your alternate mail-id");
        this.alternateMailId = scanner.next();
        System.out.println("Alternate mail-id is saved successfully\n");

        //generating work phone number
        //I used same class as I used to generate employee ID
        // because I took the length for work phone also 6
        System.out.println("Setting up your work phone. . . ");
        this.workPhoneNumber = generateEmployeeID.getID();
        System.out.println("Your work phone number is: " + this.workPhoneNumber);

        // All Set your profile is generated
        System.out.println();
        System.out.println();
        System.out.println("We have successfully generated your profile\n\n");

        summariseInformation();


    }
// This method summarises all your info and print it in properly
    public void summariseInformation() {
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("Summarizing all your Information . . .");
        System.out.println();
        String nameOutput = "Name: " + this.firstName + " " + this.lastName;
        System.out.printf("%-45s%s%s", nameOutput, "Department: ", this.department);
        System.out.println();
        String mailOutput = "Mail-id: " + this.companyMailID;
        System.out.printf("%-45s%s%s", mailOutput, "Password: ", this.password);
        System.out.println();
        System.out.print("Mail Box capacity: " + this.mailBoxCapacity);
        System.out.println();
        String mailIDOutput = "Alternate mail-id: " + this.alternateMailId;

        System.out.printf("%-45s%s%s", mailIDOutput, "Work Phone: ", this.workPhoneNumber);
        System.out.println();
        System.out.println();
        System.out.println("HR details: ");
        System.out.println("************************************************");
        System.out.println("Name: Rajesh Mehra                             *");
        System.out.println("Phone Number: 9432123456                       *");
        System.out.println("Work Phone: 456321                             *");
        System.out.println("************************************************\n");
    }


}
