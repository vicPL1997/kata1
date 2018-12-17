package kata1;

import java.util.Date;
import kata1.Person;

public class Kata1 {

    public static void main(String[] args) {
        Person person = new Person("Blas", new Date(49,8,24));
        System.out.println(person.getName() + " tiene " + person.getAge());
    }
}
