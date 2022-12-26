package Main;

import ClassPackage.Alumne;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.*;

import static Main.Main.*;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    //region ATTRIBUTES
    private static ArrayList<Alumne> myAlumneList, myEmptyList, resultAlumneList, expectedAlumneList;


    //endregion ATTRIBUTES


    //region BEFORE-ALL
    @BeforeAll
    static void beBoreAll() {
        // Load alumnes
        myAlumneList = new ArrayList<>(Arrays.asList(
                new Alumne("Andreu", (byte) 17, "PHP", (byte) 6),
                new Alumne("Cristòfol", (byte) 45, "JAVA", (byte) 10),
                new Alumne("Albert", (byte) 35, "ANGULAR", (byte) 4),
                new Alumne("Salvador", (byte) 16, "REACT", (byte) 3),
                new Alumne("Antoni", (byte) 17, "JAVA", (byte) 9),
                new Alumne("Yuri", (byte) 25, "JAVASCRIPT", (byte) 7),
                new Alumne("Jesus", (byte) 34, "PHP", (byte) 5),
                new Alumne("Marie", (byte) 17, "REACT", (byte) 6),
                new Alumne("Sandford", (byte) 55, "JAVA", (byte) 4),
                new Alumne("Nikola", (byte) 27, "JAVA", (byte) 5),
                new Alumne("Steve", (byte) 21, "JAVA", (byte) 9),
                new Alumne("", (byte) 0, "JAVA", (byte) 0),
                new Alumne("", (byte) -1, "", (byte) -1)
        ));
        myAlumneList.add(null);

        // Create the empty list
        myEmptyList = new ArrayList<>();
    }

    //endregion BEFORE-ALL


    //region TEST
    @Test
    void showDataTest() {
        // Init variables
        String resulString = "Andreu:6 \\ Cristòfol:10 \\ Albert:4 \\ Salvador:3 \\ Antoni:9 \\ " +
                "Yuri:7 \\ Jesus:5 \\ Marie:6 \\ Sandford:4 \\ Nikola:5 \\ Steve:9";

        // Prepare the test
        myAlumneList.add(null);

        // Make the tests
        assertThat(showData(myAlumneList)).isEqualTo(resulString);
        assertThat(showData(myEmptyList)).isEmpty();

    }

    @Test
    void filterATest() {
        // Init variables
        resultAlumneList = new ArrayList<>();

        // Prepare the test
        expectedAlumneList = new ArrayList<>(Arrays.asList(
                new Alumne("Andreu", (byte) 17, "PHP", (byte) 6),
                new Alumne("Albert", (byte) 35, "ANGULAR", (byte) 4),
                new Alumne("Antoni", (byte) 17, "JAVA", (byte) 9)
        ));
        resultAlumneList.addAll(filterA(myAlumneList));

        // Make the test
        assertThat(resultAlumneList.size()).isEqualTo(3);
        assertThat(resultAlumneList).usingRecursiveComparison().isEqualTo(expectedAlumneList);
        assertThat(filterA(myEmptyList)).isEmpty();

    }

    @Test
    void filterNoteUp5Test() {
        // Init variables
        resultAlumneList = new ArrayList<>();

        // Prepare the test
        expectedAlumneList = new ArrayList<>(Arrays.asList(
                new Alumne("Andreu", (byte) 17, "PHP", (byte) 6),
                new Alumne("Cristòfol", (byte) 45, "JAVA", (byte) 10),
                new Alumne("Antoni", (byte) 17, "JAVA", (byte) 9),
                new Alumne("Yuri", (byte) 25, "JAVASCRIPT", (byte) 7),
                new Alumne("Jesus", (byte) 34, "PHP", (byte) 5),
                new Alumne("Marie", (byte) 17, "REACT", (byte) 6),
                new Alumne("Nikola", (byte) 27, "JAVA", (byte) 5),
                new Alumne("Steve", (byte) 21, "JAVA", (byte) 9))
        );
        resultAlumneList.addAll(filterNoteUp5(myAlumneList));

        // Make the test
        assertEquals(resultAlumneList.size(), expectedAlumneList.size());
        assertThat(resultAlumneList).usingRecursiveComparison().isEqualTo(expectedAlumneList);
        assertThat(filterNoteUp5(myEmptyList)).isEmpty();

    }

    @Test
    void filterNoteUp5NoPHPTest() {
        // Init variables
        resultAlumneList = new ArrayList<>();
        expectedAlumneList = new ArrayList<>(Arrays.asList(
                new Alumne("Cristòfol", (byte) 45, "JAVA", (byte) 10),
                new Alumne("Antoni", (byte) 17, "JAVA", (byte) 9),
                new Alumne("Yuri", (byte) 25, "JAVASCRIPT", (byte) 7),
                new Alumne("Marie", (byte) 17, "REACT", (byte) 6),
                new Alumne("Nikola", (byte) 27, "JAVA", (byte) 5),
                new Alumne("Steve", (byte) 21, "JAVA", (byte) 9))
        );

        // Prepare the test
        resultAlumneList.addAll(filterNoteUp5NoPHP(myAlumneList));

        // Make the test
        assertEquals(resultAlumneList.size(), expectedAlumneList.size());
        assertThat(resultAlumneList).usingRecursiveComparison().isEqualTo(expectedAlumneList);
        assertThat(filterNoteUp5NoPHP(myEmptyList)).isEmpty();
    }

    @Test
    void filterOnlyJavaAgeUp18Test() {
        // Init variables
        resultAlumneList = new ArrayList<>();
        expectedAlumneList = new ArrayList<>(Arrays.asList(
                new Alumne("Cristòfol", (byte) 45, "JAVA", (byte) 10),
                new Alumne("Sandford", (byte) 55, "JAVA", (byte) 4),
                new Alumne("Nikola", (byte) 27, "JAVA", (byte) 5),
                new Alumne("Steve", (byte) 21, "JAVA", (byte) 9)
        ));

        // Prepare the test
        resultAlumneList.addAll(filterOnlyJavaAgeUp18(myAlumneList));

        // Make the test
        assertEquals(resultAlumneList.size(), 4);
        assertThat(resultAlumneList).usingRecursiveComparison().isEqualTo(expectedAlumneList);
        assertThat(filterOnlyJavaAgeUp18(myEmptyList)).isEmpty();
    }

    //endregion TEST


}