import static org.junit.Assert.*;
import java.util.*;
import org.junit.Test;

public class UnionTest {

	Vector a = new Vector();
	Vector b = new Vector();
	Vector c = new Vector();

	@Test
	public void test1() {
		a = null;
		b.addElement(1);
		try{
			Union.union(a, b);
		} catch(NullPointerException e) {
			return;
		}
		fail("Uno de los vectores es nulo o los dos.");
	}
	
	@Test
	public void test2() {
		b = null;
		a.addElement(2);
		try{
			Union.union(a, b);
		} catch(NullPointerException e) {
			return;
		}
		fail("Uno de los vectores es nulo o los dos.");
	}
	
	@Test
	public void test3() {
		a = null;
		b = null;
		try{
			Union.union(a, b);
		} catch(NullPointerException e) {
			return;
		}
		fail("Uno de los vectores es nulo o los dos.");
	}
	
	@Test
	public void test4() {
		a.addElement(2);
		b.addElement(5);
		c.insertElementAt(2,0);
		c.insertElementAt(5,1);
		assertTrue(Union.union(a, b).equals(c));
	}
	
	@Test
	public void test5() {
		a.addElement(2);
		a.addElement(8);
		b.addElement(10);
		b.addElement(10);
		c.insertElementAt(2,0);
		c.insertElementAt(8,1);
		c.insertElementAt(10,2);
		assertTrue(Union.union(a, b).equals(c));
	}
	
	@Test
	public void test6() {
		a.addElement(2);
		a.addElement(10);
		b.addElement(10);
		b.addElement(5);
		c.insertElementAt(2,0);
		c.insertElementAt(10,1);
		c.insertElementAt(5,2);
		assertTrue(Union.union(a, b).equals(c));
	}
	
	@Test
	public void test7() {
		a.addElement(2);
		b.addElement(null);
		c.insertElementAt(2,0);
		c.insertElementAt(null,1);
		assertTrue(Union.union(a, b).equals(c));
	}
	
	@Test
	public void test8() {
		b.addElement(1);
		try{
			Union.union(a, b);
		} catch(NullPointerException e) {
			return;
		}
		fail("Longitud nula de uno de los vectoreso de los dos.");
	}
}
