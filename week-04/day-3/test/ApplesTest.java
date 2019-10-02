import org.junit.Test;

import static org.junit.Assert.*;

public class ApplesTest {

    @Test
            public void getApple(){
        Apples apples = new Apples();
        String result = apples.getApple();
        String expected = "apple";
        assertEquals(expected, result);
    }



}


///Create a class, with one method (eg. public String getApple()) that returns a string (eg. "apple")
//Create a test for that.
//Create a test class
//Create a test method
//Instantiate an Object from your class in the method
//Use the assertEquals()
//The expected parameter should be the same string (eg. "apple")
//The actual parameter should be the return value of the method (eg. myObject.getApple())
//Run the test
//Change the expected value to make the test failing
//Run the test
//Fix the returned value to make the test succeeding again