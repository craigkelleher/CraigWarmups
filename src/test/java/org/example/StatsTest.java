package org.example;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class StatsTest {
//
//    @BeforeEach
//    void setUp(){
//        Stats stats = new Stats();
//    }

    @Test
    public void computeModeTest(){
        List<Integer> compareData = new ArrayList<>();
        compareData.add(2);
        compareData.add(3);
        compareData.add(4);
        compareData.add(8);
        compareData.add(7);
        compareData.add(8);
        assertEquals(8, Stats.computeMode(compareData));
    }
}