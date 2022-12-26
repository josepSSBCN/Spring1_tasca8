package MainPackage;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import static MainPackage.Main.methodA3;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;


class MainTest {

    @Test
    void methodA3Test() {
        // INIT VARIABLES
        ArrayList<String> myStrings, myListErrors, myEmptyList, expectedList;

        // PREPARE THE TEST
        myStrings = new ArrayList<>(Arrays.asList("Pau", "Arnau", "Ana", "Anna", "ali", "Ada", "Sandra",
                "Karl", "Eva", "axe", "Bob", "ian"));
        expectedList = new ArrayList<>(Arrays.asList("Ana", "Ada"));
        myListErrors = new ArrayList<>(Arrays.asList(null, "", "~"));
        myEmptyList = new ArrayList<>();

        // MAKE THE TEST
        assertEquals(methodA3(myStrings).size(), 2);
        assertThat(methodA3(myStrings)).usingRecursiveComparison().isEqualTo(expectedList);
        assertThat(methodA3(myListErrors)).isEmpty();
        assertThat(methodA3(myEmptyList)).isEmpty();


    }
}