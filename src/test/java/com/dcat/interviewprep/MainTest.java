package com.dcat.interviewprep;

import com.dcat.interviewprep.hashmap.MyHashMap;
import com.dcat.interviewprep.singleton.Singleton;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    public void testSingleton() {
        Singleton first = Singleton.getInstance();

        try {
            System.out.println("Running for " + first.getRuntime());
            Thread.sleep(5000);

            Singleton second = Singleton.getInstance();

            assertEquals(first.getStart(), second.getStart());

            System.out.println("Running for " + second.getRuntime());

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    void testHashMap() {
        String noShotDefinition = "When there is absolutely no chance that something happened/or is true";
        String velcroKittyDefinition = "A annoying neurotic house pet that craves affection like an addict craves drugs";

        MyHashMap dictionary = new MyHashMap();
        dictionary.put("No shot", noShotDefinition);
        dictionary.put("Velcro kitty", velcroKittyDefinition);
        dictionary.remove("Velcro kitty");
        assertEquals(dictionary.get("No shot"), noShotDefinition);
        assertNull(dictionary.get("Velcro kitty"));

    }

    @Test
    @DisplayName("int index value")
    void givenIntWithArray_whenChangeVariable_thenTestChangeInArray() {
        /* Given - int with array */
        int value = 10;
        int[] ints = new int[]{value};

        /* When - change variable */
        value += 10;

        /* Then - test change in array */
        assertThat(ints[0]).isEqualTo(10);
        assertThat(ints[0]).isNotEqualTo(value);
    }
}