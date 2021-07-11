package teme.java_course4_collections.ex3_josephus;

import org.junit.Test;
import org.junit.runner.RunWith;
import teme.util.java_util.plugin.Grade;
import teme.util.java_util.plugin.GradeRunner;

import static org.junit.Assert.assertEquals;

/**
 * MAX GRADE: 25p
 */
@RunWith(GradeRunner.class)
public class JosephusTest {

    @Test
    @Grade(6)
    public void eliminate_step1() {
        assertEquals(1, Josephus.eliminate(1, 1));
        assertEquals(3, Josephus.eliminate(3, 1));
        assertEquals(5, Josephus.eliminate(5, 1));
    }

    @Test
    @Grade(6)
    public void eliminate_9_allSteps() {
        assertEquals(9, Josephus.eliminate(9, 1));
        assertEquals(3, Josephus.eliminate(9, 2));
        assertEquals(1, Josephus.eliminate(9, 3));
        assertEquals(1, Josephus.eliminate(9, 4));
        assertEquals(8, Josephus.eliminate(9, 5));
        assertEquals(7, Josephus.eliminate(9, 6));
        assertEquals(2, Josephus.eliminate(9, 7));
        assertEquals(3, Josephus.eliminate(9, 8));
        assertEquals(8, Josephus.eliminate(9, 9));
        assertEquals(8, Josephus.eliminate(9, 10));
        assertEquals(6, Josephus.eliminate(9, 11));
        assertEquals(8, Josephus.eliminate(9, 12));
        assertEquals(2, Josephus.eliminate(9, 13));
        assertEquals(3, Josephus.eliminate(9, 14));
        assertEquals(1, Josephus.eliminate(9, 15));
    }

    @Test
    @Grade(6)
    public void eliminate_6_allSteps() {
        assertEquals(6, Josephus.eliminate(6, 1));
        assertEquals(5, Josephus.eliminate(6, 2));
        assertEquals(1, Josephus.eliminate(6, 3));
        assertEquals(5, Josephus.eliminate(6, 4));
        assertEquals(1, Josephus.eliminate(6, 5));
        assertEquals(4, Josephus.eliminate(6, 6));
        assertEquals(5, Josephus.eliminate(6, 7));
        assertEquals(3, Josephus.eliminate(6, 8));
        assertEquals(5, Josephus.eliminate(6, 9));
        assertEquals(2, Josephus.eliminate(6, 10));
    }

    @Test
    @Grade(7)
    public void eliminate_stepOther() {
        assertEquals(2, Josephus.eliminate(3, 3));
        assertEquals(3, Josephus.eliminate(5, 2));
        assertEquals(4, Josephus.eliminate(5, 3));
        assertEquals(4, Josephus.eliminate(5, 7));
        assertEquals(7, Josephus.eliminate(7, 2));
        assertEquals(2, Josephus.eliminate(7, 4));
        assertEquals(4, Josephus.eliminate(10, 3));
        assertEquals(1, Josephus.eliminate(8, 2));
        assertEquals(1, Josephus.eliminate(16, 4));
        assertEquals(5, Josephus.eliminate(17, 4));
    }
}
