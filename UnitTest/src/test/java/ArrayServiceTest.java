import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class ArrayServiceTest {

 ArrayService as = new ArrayService();
    Person person = new Person("Pavel", 20);
    Person person1 = new Person("Nikita", 19);
    ArrayService as1 = new ArrayService();

    @BeforeAll
    public static void beforeClass(){
        System.out.println("Lets try.");
    }


    @Test
    void testAdd() {
     System.out.println("Adding in first free сell.");
     boolean result = as.add(person);
     Assertions.assertTrue(result);
    }

    @Test
    void testAdd1() {
     System.out.println("Adding by index");
     Person person1 = new Person("Nikita", 19);
     boolean result = as.add(1,person1);
     Assertions.assertTrue(result);
    }

    @Test
    void delete() {
     System.out.println("Deleting object.");
     boolean result = as.delete(person);
     Assertions.assertTrue(result);
    }

    @Test
    void get() {
     System.out.println("Getting object by index.");
     Object o = as.get(0);
     Assertions.assertEquals(o,as.get(0));
    }

    @Test
    void contain() {
        System.out.println("Checking if array contains object.");
        boolean result1 = as.contain(person);
        boolean result2 = as.contain(person1);
        Assertions.assertTrue(result1);
        Assertions.assertTrue(result2);
    }

    @Test
    void testEquals() {
        System.out.println("Checking if collections are equals.");
        boolean result = as.equals(as1);
        Assertions.assertFalse(result);

    }

    @Test
    void clear() {
        System.out.println("Cleaning collection.");
        as.clear();
        Assertions.assertNull(as.get(0));
    }

    @Test
    void size() {
        System.out.println("Checking the size.");
        int size = as.size();
        Assertions.assertTrue(size == as.size());
    }


    @Test
    void hasNext() {
        System.out.println("If collection has space for next move.");
        boolean result = as.hasNext();
        Assertions.assertTrue(result);
    }
}
