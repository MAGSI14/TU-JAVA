public class Person {
    private String name;
    private String egn;

    public Person(String name, String egn) {
        this.name = name;
        this.egn = egn;
    }

    public String getName() {
        return name;
    }

    public String getEgn() {
        return egn;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEgn(String egn) {
        this.egn = egn;
    }
}

