package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Dog dog)`
    // TODO - Create tests for `Dog getDogById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfDogs()`
    @Test
    public void add() {
        // Given
        String expected = "Ruff";
        Dog dog = new Dog("Ruff",null,2);
        // When
        DogHouse dogHouse = new DogHouse();
        DogHouse.add(dog);
        Dog actuallydog = dogHouse.getDogById(2);

        // Then
        Assert.assertEquals(expected,actuallydog.getName());
    }
    @Test
    public void removedogById() {
        // Given
        Dog dog = new Dog(null,null,6);
        Integer expected = null;
        // When
        DogHouse dogHouse = new DogHouse();
        DogHouse.add(dog);
        DogHouse.remove(6);
        Dog actual = dogHouse.getDogById(6);



        // Then
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void removedog() {
        // Given
        String expected = null;
        Dog dog = new Dog("Ruff",null,5);
        // When
        DogHouse dogHouse = new DogHouse();
        DogHouse.add(dog);
        DogHouse.remove(dog);
        Dog actual = dogHouse.getDogById(5);



        // Then
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void getdogById() {
        // Given
        String expected = "Ruff";
        Dog dog = new Dog("Ruff",null,2);
        // When
        DogHouse dogHouse = new DogHouse();
        DogHouse.add(dog);
        Dog actual = dogHouse.getDogById(2);



        // Then
        Assert.assertEquals(expected,actual.getName());
    }
    @Test
    public void getdogsNumber() {
        // Given
        Integer expected = 4;
        Dog dog = new Dog("Ruff",null,2);
        // When
        DogHouse dogHouse = new DogHouse();
        DogHouse.add(dog);
        Integer actual = dogHouse.getNumberOfDogs();



        // Then
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void testGetNumberOfDogs() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);

        // Then
        DogHouse.getNumberOfDogs();
    }
}
