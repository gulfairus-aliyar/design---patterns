package Builder;

public class PersonBuilderIMpl implements PersonBuilder{
    Person person=new Person();
    @Override
    public PersonBuilder setName(String name) {
        person.name=name;
        return this;
    }

    @Override
    public PersonBuilder setLastName(String lastName) {
        person.lastname=lastName;
        return this;
    }

    @Override
    public PersonBuilder setAge(int age) {
        person.age=age;
        return this;
    }

    @Override
    public PersonBuilder setSalary(double salary) {
        person.salary=salary;
        return this;
    }

    @Override
    public Person build() {
        return person;
    }
}

