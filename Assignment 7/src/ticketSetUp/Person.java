package ticketSetUp;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Person {
    private String name;
    private String lastName;
    private String nationalCode;

    public Person(String name, String lastName, String nationalCode) {
        this.name = name;
        this.lastName = lastName;
        this.nationalCode = nationalCode;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getNationalCode() {
        return nationalCode;
    }
}
