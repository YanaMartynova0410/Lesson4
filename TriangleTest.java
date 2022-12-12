package org.example.Lesson4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TriangleTest {
    private static Logger logger = LoggerFactory.getLogger(TriangleTest.class);
    @BeforeAll
   static void beforeAll(){
        System.out.println("Выполниться 1 раз перед всеми тестами класса");
        logger.info("Выполниться 1 раз перед всеми тестами класса");
        WebDriverManager.chromedriver().setup();
    }
    @Test
    void TriangleTest1 (){
        double result = new Triangle().triangle(4, 6, 8);
        Assertions.assertEquals(11.61895003862225, result);

    }
    @Test
    void TriangleTest2 (){
        double result = new Triangle().triangle(8, 14, 8);
        Assertions.assertEquals(27.110883423451916, result);
    }
    @Test
    void TriangleTest3 (){
        double result = new Triangle().triangle(5, 0, 4);
        Assertions.assertEquals(0, result);
    }
    @Test
    void testException(){
        Assertions.assertThrows(ArithmeticException.class, ()-> getException(), "нет исключения");

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Integer.parseInt("One");
        });
    }

    private void getException() throws ArithmeticException{
        if (logger) {
            return;
        }
        throw new ArithmeticException();
    }
    @Test
    void TriangleTest4 (){
        double result = new Triangle().triangle(5, 0, 4);
        Assertions.assertThrows(NullPointerException.class, ()-> getException(), "нет исключения");
    }
}
