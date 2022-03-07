package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Cat cat)`
    // TODO - Create tests for `Cat getCatById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfCats()`

    @Test
    public void add() {
        // Given
        String expected = "Bubbles";
        Cat cat = new Cat("Bubbles",null,1);
        // When
        CatHouse catHouse = new CatHouse();
        CatHouse.add(cat);
        Cat actuallyCat = catHouse.getCatById(1);

        // Then
        Assert.assertEquals(expected,actuallyCat.getName());
    }
    @Test
    public void removeCatById() {
        // Given
        Cat cat = new Cat(null,null,4);
        Integer expected = null;
        // When
        CatHouse catHouse = new CatHouse();
        CatHouse.add(cat);
        catHouse.remove(4);
        Cat actual = CatHouse.getCatById(4);



        // Then
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void removeCat() {
        // Given
        String expected = null;
        Cat cat = new Cat("Bubbles",null,3);
        // When
        CatHouse catHouse = new CatHouse();
        CatHouse.add(cat);
        catHouse.remove(cat);
        Cat actual = CatHouse.getCatById(3);



        // Then
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void getCatById() {
        // Given
        String expected = "Bubbles";
        Cat cat = new Cat("Bubbles",null,1);
        // When
        CatHouse catHouse = new CatHouse();
        CatHouse.add(cat);
        Cat actual = CatHouse.getCatById(1);



        // Then
        Assert.assertEquals(expected,actual.getName());
    }
    @Test
    public void getCatsNumber() {
        // Given
        Integer expected = 2;
        Cat cat = new Cat("Bubbles",null,1);
        Cat cat2 = new Cat("Bubbles2",null,00);
        // When
        CatHouse catHouse = new CatHouse();
        CatHouse.add(cat);
        CatHouse.add(cat2);
        Integer actual = CatHouse.getNumberOfCats();



        // Then
        Assert.assertEquals(expected,actual);
    }
}


