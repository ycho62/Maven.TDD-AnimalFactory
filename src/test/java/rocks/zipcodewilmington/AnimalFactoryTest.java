package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Calendar;
import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
//Console subtract = new Console();
//        double result1 = subtract.basicmath("-", 10, 10);
//        double expected1 = 0;
//        assertEquals(expected1,result1);
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`
    @Test
    public void animalCreateDog() {
        // Given
        Integer expected = 1;
        Date birthDate = new Date(2022, Calendar.APRIL,6);
        Dog dog =  AnimalFactory.createDog("Bull", birthDate);
        DogHouse.add(dog);
        Integer actual = DogHouse.getNumberOfDogs();


        // When
        // Then
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void animalCreateCat() {
        // Given
        Integer expected = 1;
        Date birthDate = new Date(2021, Calendar.APRIL, 6);
        Cat cat = AnimalFactory.createCat("Kitty", birthDate);
        CatHouse.add(cat);
        Integer actual = CatHouse.getNumberOfCats();


        // When
        // Then
        Assert.assertEquals(expected, actual);
    }
}
