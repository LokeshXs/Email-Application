public class GenerateCompanyPortalPassword {
    private int defaultLength = 8;  //default length for password

    private String generatePassword(){
        String numbers = "123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz!@#$%^&*";
        char[] password = new char[defaultLength];

        for(int i  = 0;i<password.length;i++){
            int random = (int)(Math.random()*numbers.length());
            password[i] = numbers.charAt(random);
        }

        return new String(password);

    }

    public String getPassword(){
        return generatePassword();
    }
}
