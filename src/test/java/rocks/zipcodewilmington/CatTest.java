package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Calendar;
import java.util.Date;

/**
 * @author leon on 4/19/18.
 */

public class CatTest {
    // TODO - Create tests for `void setName(String name)`
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
        Cat cat = new Cat(name, null, null);
        String retrieveName = cat.getName();
        // Then
        Assert.assertEquals(name, retrieveName);
    }
    @Test
    public void setName1() {
        // Given
        String name = "Snowball";
        // When
        Cat cat = new Cat(name, null, null);
        String retrieveName = cat.getName();
        // Then
        Assert.assertEquals(name, retrieveName);
    }
    @Test
    public void speak() {
        // Given
        String speak = "meow!";
        Cat cat = new Cat(null,null,null);
        // When
        String retrievedSpeak = cat.speak();
        // Then
        Assert.assertEquals(speak,retrievedSpeak);
      }
    @Test
    public void setBirthDate() {
        // Given
        Date birthdate = new Date(2022, Calendar.JUNE, 1);
        // When
        Cat cat = new Cat(null, birthdate, null);
        Date retrievedBirthDate = cat.getBirthDate();
        // Then
        Assert.assertEquals(birthdate,retrievedBirthDate);
    }
    @Test
    public void eat() {
        // Given
        Integer eat = 1;
        Food food = new Food();
        // When
        Cat cat = new Cat(null,null,null);
        cat.eat(food);
        Integer retrievedNumberOfMeals = cat.getNumberOfMealsEaten();

        // Then
        Assert.assertEquals(eat,retrievedNumberOfMeals);
    }

    @Test
    public void getId(){
        // Given
        Integer givenId = 1234 ;
        // When
        Cat cat = new Cat(null, null, givenId);
        Integer retrieveId = cat.getId();
        // Then
        Assert.assertEquals(givenId, retrieveId);
    }
    @Test
    public void animalInheritance(){
        // Given
        Cat cat = new Cat(null,null,null);
        // When
        // Then
        Assert.assertTrue(cat instanceof Animal);
    }

    @Test
    public void mammalInheritance(){
        // Given
        Cat cat = new Cat(null,null,null);
        // When
        // Then
        Assert.assertTrue(cat instanceof Mammal);
    }
    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

}
