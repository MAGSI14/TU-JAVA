public interface ValidatePhone {
    public static boolean validatePhoneNumber(String phoneNumber)throws WrongPhoneNumberException{
        if(phoneNumber.length()!=10){
            throw new WrongPhoneNumberException("Wrong number!");
        }else{
            return true;
        }
    }
}
