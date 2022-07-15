public class GenerateEmployeeID {
    private final int  defaultLength = 6;   //Default length for employee ID

    private String generateID(){
        String numbers = "123456789";
        char[] empID = new char[defaultLength];

        for(int i  = 0;i<empID.length;i++){
            int random = (int)(Math.random()*numbers.length());
            empID[i] = numbers.charAt(random);
        }

        return new String(empID);

    }

    public String getID(){
        return generateID();
    }

}
