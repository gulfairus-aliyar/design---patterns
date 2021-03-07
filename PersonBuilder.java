package Builder;

public interface PersonBuilder {
    PersonBuilder setName(String name);
    PersonBuilder setLastName(String lastName);
    PersonBuilder setAge(int age);
    PersonBuilder setSalary(double salary);
    Person build();
}
