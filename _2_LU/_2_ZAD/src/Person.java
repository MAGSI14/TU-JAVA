public class Person {
    private String names;
    private String dateOfBirth;

    public Person(String names, String dateOfBirth) {
        this.names = names;
        this.dateOfBirth = dateOfBirth;
    }

    public String getNames() {
        return names;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    @Override
    public String toString() {
        return "Names: " + this.names + ", date of birth: " + this.dateOfBirth;
    }
}
