package Builder;

public class Main {
    public static void main(String[] args) {
        Person person= (Person) new PersonBuilderIMpl().setName("Oliver").setLastName("George").setAge(25).setSalary(150000).build();
        Person person1= (Person) new PersonBuilderIMpl().setName("King").setLastName("Charles").setAge(36).build();
        person.print();
        person1.print();
    }
}

