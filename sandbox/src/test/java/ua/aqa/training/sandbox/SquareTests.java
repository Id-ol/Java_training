package ua.aqa.training.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;
import ua.aqa.traning.sandbox.Square;

public class SquareTests {
  @Test
  public void testArea(){
    Square s = new Square(5);
    //assert s.area() == 25;
    Assert.assertEquals(s.area(),25.0);

  }
}
