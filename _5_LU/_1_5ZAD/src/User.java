import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class User implements UsernameCheck, PasswordCheck, ValidatePhone{
    private String username;
    private String password;
    private String phNumber;

    public User(String username, String password, String phNumber) throws WrongUserException, WrongPhoneNumberException {
        setUsername(username);
        setPassword(password);
        setPhNumber(phNumber);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) throws WrongUserException {
        if(matchChecker(username) == true){
            this.username = username;
        } else {
            throw new WrongUserException("Incorrect user!");
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if(checkPassword(password) == true){
            this.password = password;
        }else{
            System.out.println("Invalid password!!");
        }
    }

    public String getPhNumber() {
        return phNumber;
    }

    public void setPhNumber(String phNumber) throws WrongPhoneNumberException{
        if(validatePhoneNumber(phNumber) == true){
            this.phNumber = phNumber;
        }else{
            throw new WrongPhoneNumberException("Wrong phone number!!");
        }
    }

    @Override
    public boolean matchChecker(String username) {
        Pattern pattern = Pattern.compile("^[a-z0-9_-]{3,15}$");
        Matcher matcher = pattern.matcher(username);
        return matcher.matches();
    }

    @Override
    public boolean checkPassword(String password) {
        Pattern p = Pattern.compile("^[a-zA-Z]{11,}$");
        Matcher m = p.matcher(password);
        return m.matches();
    }

    @Override
    public boolean validatePhoneNumber(String phNumber) {
        Pattern pattern = Pattern.compile("[0-9]{10}");
        Matcher matcher = pattern.matcher(phNumber);
        return matcher.matches();
    }
}
