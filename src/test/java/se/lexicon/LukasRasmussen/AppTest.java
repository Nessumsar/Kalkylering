package se.lexicon.LukasRasmussen;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;


public class AppTest 
{
// Arrange - skapa testet
    // Act - utföra testet - anropa metoden
    // Assert - JUnit testar om resultatet av metodanropet

    @Test
    public void testEttPlusTva(){
        //Arrange
        double source1 = 1;
        double source2 = 2;
        double expected = 3;

        //Act
        double actual = App.resplus(source1, source2);

        //Assert
        Assert.assertEquals(expected, actual, 0);
    }
    @Test
    public void testTreMinTva(){
        //Arrange
        double source = 3;
        double source2 = 2;
        double expected = 1;

        //Act
        double actual = App.resmin(source, source2);

        //Assert
        Assert.assertEquals(expected, actual, 0);
    }
    @Test
    public void testTreGgrTva(){
        //Arrange
        double source = 3;
        double source2 = 2;
        double expected = 6;

        //Act
        double actual = App.resggr(source, source2);

        //Assert
        Assert.assertEquals(expected, actual, 0);
    }
    @Test
    public void testFyraDivTva(){
        //Arrange
        double source = 4;
        double source2 = 2;
        double expected = 2;

        //Act
        double actual = App.resdiv(source, source2);

        //Assert
        Assert.assertEquals(expected, actual, 0);
    }
}
