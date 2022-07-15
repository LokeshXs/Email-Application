public class RegisterDepartment {

    private String[] department() {
        String[] departmentArray = {"Business Development", "Sales & Marketing", "Development",
                "Test Team", "Architecture", "Customer Support", "HR", "Research and Development"};
        int count = 1;
        for (String n : departmentArray) {
            System.out.println(count + ": " + n);
            count++;
        }

        return departmentArray;

    }

    public String[] getDepartmentList(){
        return department();
    }
}
