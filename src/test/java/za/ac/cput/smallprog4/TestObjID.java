package za.ac.cput.smallprog4;

import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created by student on 2015/02/13.
 */
public class TestObjID extends TestCase{
    ObjID ob = new ObjID("one");
    ObjID obe = new ObjID("one");

    @Test
    public void testEquality() throws Exception {
        assertSame(ob.getName(), obe.getName());
    }
}
