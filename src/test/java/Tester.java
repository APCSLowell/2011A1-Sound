

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.io.*;

public class Tester {

   @Test
   public void partA1 () {
      Sound temp = new Sound();
      temp.samples = new int [] {40, 2532, 17, -2300, -17, -4000, 2000};
      //int [] samples = {40, 2532, 17, -2300, -17, -4000, 2000};
      int result = temp.limitAmplitude(2000);
      //answer [40, 2000, 17, -2000, -17, -2000, 2000]
      String failMsg = "Failed - Input=" + temp.samples + ", Expected 3, Output = " + result;
      assertEquals(failMsg, 3, result);
   }


}
