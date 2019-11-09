import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;

public class TestingSet {

    HashSet<Integer> set;

    @Before
    public void setUp() {
        this.set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
    }

    @Test
    public void testAddExistingElement() {
        int prevSize = set.size();
        set.add(1);
        int curSize = set.size();
        
        Assert.assertEquals(prevSize, curSize);
    }

    @Test
    public void testAddNonExistingElement() {
        int prevSize = set.size();
        set.add(4);
        int curSize = set.size();

        Assert.assertNotEquals(prevSize, curSize);
    }

    @Test
    public void testDifferentOrder() {
        HashSet<Integer> viceVersa = new HashSet<>();
        viceVersa.add(3);
        viceVersa.add(2);
        viceVersa.add(1);

        Assert.assertEquals(set, viceVersa);
    }

    @Test
    public void testBelonging() {
        HashSet<Integer> viceVersa = new HashSet<>();
        viceVersa.add(3);
        viceVersa.add(2);
        viceVersa.add(1);

        Assert.assertTrue(set.containsAll(viceVersa));
        Assert.assertTrue(viceVersa.containsAll(set));
    }
}
