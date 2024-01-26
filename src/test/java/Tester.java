

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.io.*;

public class Tester {

   @Test
   public void partA () {
      APLine line1 = new APLine(5,4,-17);
      double slope1 = line1.getSlope();
      assertEquals(slope1,-1.25,0.01);
      boolean onLine1 = line1.isOnLine(5,-2);
      assertEquals(onLine1,true);
      APLine line2 = new APLine(-25,40,30);
      double slope2 = line2.getSlope();
      assertEquals(slope2,0.625,0.01);
      boolean onLine2 = line2.isOnLine(5,-2);
      assertEquals(onLine2,false);
   }


}
