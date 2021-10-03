/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package basiclibrary;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {

    @Test public void testAnalyzingWeatherData() {
        int[][] inArr = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };
        ArrayList<String> outList = new ArrayList<String>();
        outList.add("Never saw temperature: 63");
        outList.add("Never saw temperature: 67");
        outList.add("Never saw temperature: 68");
        outList.add("Never saw temperature: 69");
        System.out.println(outList.equals(Library.analyzingWeatherData(inArr)));
        assertEquals( outList ,Library.analyzingWeatherData(inArr));
    }

    @Test public void testTally() {
        List<String> inList = new ArrayList<>();
        inList.add("Bush");
        inList.add("Bush");
        inList.add("Shrub");
        inList.add("Hedge");
        inList.add("Shrub");
        inList.add("Bush");
        inList.add("Hedge");
        inList.add("Bush");
        inList.add("Bush");
        String outString = "Bush";
        System.out.println(outString.equals(Library.tally(inList)));
        assertEquals( outString ,Library.tally(inList));
    }
}
