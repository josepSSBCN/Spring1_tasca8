package Main;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static Main.Main.*;
import static org.assertj.core.api.Assertions.*;

class MainTest {
    @Test
    void orderByFirstCharTest() {
        // Ordenar alfabèticament pel primer caràcter, els núm. els deixa amb l'ordre que tinguin.
        // Null i Strings empty s'eliminen

        assertThat(orderByFirstChar(new ArrayList<>(Arrays.asList("Endur", 19, "Emparellar", 36, "Ateneu", 1492))))
                .isEqualTo(new ArrayList<>(Arrays.asList(19, 36, 1492, "Ateneu", "Endur", "Emparellar")));
        assertThat(orderByFirstChar(new ArrayList<>(Arrays.asList("Zanzibar", 18, "Holanda", 12.5f, "Esclaus", 2))))
                .isEqualTo(new ArrayList<>(Arrays.asList(18, 12.5f, 2, "Esclaus", "Holanda", "Zanzibar")));
        assertThat(orderByFirstChar(new ArrayList<>(Arrays.asList("Sevilla", 45, "Sevillana", 1, "Sardana", 0))))
                .isEqualTo(new ArrayList<>(Arrays.asList(45, 1, 0, "Sevilla", "Sevillana", "Sardana")));
        assertThat(orderByFirstChar(new ArrayList<>(Arrays.asList("Ordre", null, "Casa", 1, "", "Ametller", 0))))
                .isEqualTo(new ArrayList<>(Arrays.asList(1, 0, "Ametller", "Casa", "Ordre")));
        assertThat(orderByFirstChar(new ArrayList<>(Arrays.asList(51, 13, 10, 1000, 0))))
                .isEqualTo(new ArrayList<>(Arrays.asList(51, 13, 10, 1000, 0)));
        assertThat(orderByFirstChar(new ArrayList<>(Arrays.asList(null, null, null))))
                .isEmpty();
        assertThat(orderByFirstChar(new ArrayList<>()))
                .isEmpty();

    }


    @Test
    void orderByeEMin() {
        // Primer els strings que tenen 'e', després les que no tenen i al final els núm.
        // Null i Strings empty s'eliminen.

        assertThat(orderByEMin(new ArrayList<>(Arrays.asList("Madur", 19, "Emparellar", 36, "Ateneu", 1492))))
                .isEqualTo(new ArrayList<>(Arrays.asList("Emparellar", "Ateneu", "Madur", 19, 36, 1492)));
        assertThat(orderByEMin(new ArrayList<>(Arrays.asList("Zanzibar", 18, "Holanda", 12, "Esclaus", 2))))
                .isEqualTo(new ArrayList<>(Arrays.asList("Zanzibar", "Holanda", "Esclaus", 18, 12, 2)));
        assertThat(orderByEMin(new ArrayList<>(Arrays.asList("Sevilla", 45, "Sevillana", 1, "Sardana", 0))))
                .isEqualTo(new ArrayList<>(Arrays.asList("Sevilla", "Sevillana", "Sardana", 45, 1, 0)));
        assertThat(orderByEMin(new ArrayList<>(Arrays.asList("Jordi", 51, "Elias", 10, "Esteve", 1000))))
                .isEqualTo(new ArrayList<>(Arrays.asList("Esteve", "Jordi", "Elias", 51, 10, 1000)));
        assertThat(orderByEMin(new ArrayList<>(Arrays.asList(null, "Jordi", 51, null, "", "Elias", 10.0f, "Esteve", 1000))))
                .isEqualTo(new ArrayList<>(Arrays.asList("Esteve", "Jordi", "Elias", 51, 10.0f, 1000)));
        assertThat(orderByEMin(new ArrayList<>(Arrays.asList(51, 13, 10, 1000, 0))))
                .isEqualTo(new ArrayList<>(Arrays.asList(51, 13, 10, 1000, 0)));
        assertThat(orderByEMin(new ArrayList<>(Arrays.asList(null, null, null))))
                .isEmpty();
        assertThat(orderByEMin(new ArrayList<>()))
                .isEmpty();

    }

    @Test
    void modifyAMinBy4Test() {
        // Torna sols els números
        // Null i Strings empty s'eliminen

        assertThat(modifyAminBy4(new ArrayList<>(Arrays.asList("aaa", 19, "CASA", 1, "Gavina", 52))))
                .isEqualTo(new ArrayList<>(Arrays.asList("444", 19, "CASA", 1, "G4vin4", 52)));
        assertThat(modifyAminBy4(new ArrayList<>(Arrays.asList(19, 1, 52))))
                .isEqualTo(new ArrayList<>(Arrays.asList(19, 1, 52)));
        assertThat(modifyAminBy4(new ArrayList<>(Arrays.asList("Ali", 19, "Pop", 1, "tenen", 52))))
                .isEqualTo(new ArrayList<>(Arrays.asList("Ali", 19, "Pop", 1, "tenen", 52)));
        assertThat(modifyAminBy4(new ArrayList<>(Arrays.asList(null, null, null))))
                .isEmpty();
        assertThat(modifyAminBy4(new ArrayList<>()))
                .isEmpty();

    }


    @Test
    void removeStringsTest() {

        assertThat(removeStrings(new ArrayList<>(Arrays.asList("aaa", 19, "CASA", 1, "Gavina", 52))))
                .isEqualTo(new ArrayList<>(Arrays.asList(19, 1, 52)));
        assertThat(removeStrings(new ArrayList<>(Arrays.asList("Arbre", "Bolet", "Xip"))))
                .isEmpty();
        assertThat(removeStrings(new ArrayList<>(Arrays.asList(null, null, null))))
                .isEmpty();
        assertThat(removeStrings(new ArrayList<>()))
                .isEmpty();
    }
}





















