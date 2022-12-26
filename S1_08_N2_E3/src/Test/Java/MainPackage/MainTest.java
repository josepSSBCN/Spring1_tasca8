package MainPackage;

import org.junit.jupiter.api.Test;

import static MainPackage.Main.calcul;
import static org.assertj.core.api.Assertions.*;

class MainTest {

    @Test
    void calculTest() {

        // Test: add
        assertThat(calcul((byte) 1, 3.4f, 5f)).isEqualTo(8.4f);
        assertThat(calcul((byte) 1, -3f, 5f)).isEqualTo(2f);
        assertThat(calcul((byte) 1, 3f, -5f)).isEqualTo(-2f);
        assertThat(calcul((byte) 1, -3f, -5f)).isEqualTo(-8f);
        // Test: subtraction
        assertThat(calcul((byte) 2, 5f, 5f)).isEqualTo(0f);
        assertThat(calcul((byte) 2, 3f, -5f)).isEqualTo(8f);
        assertThat(calcul((byte) 2, -3f, -5f)).isEqualTo(2f);
        assertThat(calcul((byte) 2, -3f, 5f)).isEqualTo(-8f);
        // Test: multiply
        assertThat(calcul((byte) 3, 3.4f, 5f)).isEqualTo(17f);
        assertThat(calcul((byte) 3, 3.4f, 0f)).isEqualTo(0f);
        assertThat(calcul((byte) 3, 2f, -5f)).isEqualTo(-10f);
        // Test division
        assertThat(calcul((byte) 4, 3.4f, 5f)).isEqualTo(0.68f);
        assertThat(calcul((byte) 4, 3.4f, 5f)).isEqualTo(0.68f);
        assertThat(calcul((byte) 4, 0f, 5f)).isEqualTo(0.0f);
        assertThat(calcul((byte) 4, 3.4f, 0f)).isInfinite();
        assertThat(calcul((byte) 4, 0f, 0f)).isNaN();

    }

    @Test
    void calculErrorTest() {
        // Test que no donen el valor esperat
        // Test: add
        assertThat(calcul((byte) 1, -3.4f, 5f)).isNotEqualTo(2f);
        assertThat(calcul((byte) 1, 3.4f, -5f)).isNotEqualTo(-2f);
        // Test: subtraction
        assertThat(calcul((byte) 2, -3.4f, -5f)).isNotEqualTo(2f);
        assertThat(calcul((byte) 2, -3.4f, 5f)).isEqualTo(-8.4f);

    }

}
