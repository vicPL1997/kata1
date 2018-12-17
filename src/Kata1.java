import java.util.Calendar;
import java.util.GregorianCalendar;
import kata1.Person;

public class Kata1 {

    public static void main(String[] args) {
        Calendar date;
        date = GregorianCalendar.getInstance();
        date.set(1950, 9, 24);
        
        Person person = new Person("Blas", date);
        System.out.println(person.getName() + " tiene " + person.getAge());
    }
}
