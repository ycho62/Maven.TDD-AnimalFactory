package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Calendar;
import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void setName() {
        // Given
        String name = "Fluffy";
        // When
        Dog dog = new Dog(name, null, null);
        String retrieveName = dog.getName();
        // Then
        Assert.assertEquals(name, retrieveName);
    }
    @Test
    public void setName1() {
        // Given
        String name = "Snowball";
        // When
        Dog dog = new Dog(name, null, null);
        String retrieveName = dog.getName();
        // Then
        Assert.assertEquals(name, retrieveName);
    }
    @Test
    public void speak() {
        // Given
        String speak = "bark!";
        Dog dog = new Dog(null,null,null);
        // When
        String retrievedSpeak = dog.speak();
        // Then
        Assert.assertEquals(speak,retrievedSpeak);
    }
    @Test
    public void setBirthDate() {
        // Given
        Date birthdate = new Date(2022, Calendar.JUNE, 1);
        // When
        Dog dog = new Dog(null, birthdate, null);
        Date retrievedBirthDate = dog.getBirthDate();
        // Then
        Assert.assertEquals(birthdate,retrievedBirthDate);
    }
    @Test
    public void eat() {
        // Given
        Integer eat = 1;
        Food food = new Food();
        // When
        Dog dog = new Dog(null,null,null);
        dog.eat(food);
        Integer retrievedNumberOfMeals = dog.getNumberOfMealsEaten();

        // Then
        Assert.assertEquals(eat,retrievedNumberOfMeals);
    }

    @Test
    public void getId(){
        // Given
        Integer givenId = 1234 ;
        // When
        Dog dog = new Dog(null, null, 1234);
        Integer retrieveId = dog.getId();
        // Then
        Assert.assertEquals(givenId, retrieveId);
    }
    @Test
    public void animalInheritance(){
        // Given
        Dog dog = new Dog(null,null,null);
        // When
        // Then
        Assert.assertTrue(dog instanceof Animal);
    }

    @Test
    public void mammalInheritance(){
        // Given
        Dog dog = new Dog(null,null,null);
        // When
        // Then
        Assert.assertTrue(dog instanceof Mammal);
    }
    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }
}
