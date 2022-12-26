package MainPackage;

import org.junit.jupiter.api.Test;

import static MainPackage.Main.method;
import static org.assertj.core.api.Assertions.*;

class MainTest {

    @Test
    void methodTest() {
        // Prepare the test
        int[] intList = {1, 25, 75, 87, 158, 654, 0, 14, 975,
                214, 58752, 63, 55, 87, 123, 4, 751, 8, 2124, -1, -1000};
        int[] intList2 = {};

        // Make the test
        assertThat(method(intList)).isEqualTo("o1, o25, o75, o87, e158, e654, e0, e14, o975, " +
                "e214, e58752, o63, o55, o87, o123, e4, o751, e8, e2124, o-1, e-1000");
        assertThat(method(intList2)).isEmpty();
    }
}