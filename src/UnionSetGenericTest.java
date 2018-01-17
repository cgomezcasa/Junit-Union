import static org.junit.Assert.*;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class UnionSetGenericTest<E> {

	Set<Integer> a = new HashSet<Integer>();
	Set<Integer> b = new HashSet<Integer>();
	Set<Integer> c = new HashSet<Integer>();
	
	@Test
	public void test1() {
		a = null;
		b.add(2);
		try{
			Union.unionSetGeneric(a, b);
		} catch(NullPointerException e) {
			return;
		}
		fail("Uno de los vectores es nulo o los dos.");
	}
	
	@Test
	public void test2() {
		b = null;
		a.add(2);
		try{
			Union.unionSetGeneric(a, b);
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
			Union.unionSetGeneric(a, b);
		} catch(NullPointerException e) {
			return;
		}
		fail("Uno de los vectores es nulo o los dos.");
	}
	
	@Test
	public void test4() {
		a.add(2);
		b.add(5);
		c.add(2);
		c.add(5);
		assertTrue(c.equals(Union.unionSetGeneric(a, b)));
	}
	
	@Test
	public void test5() {
		b.add(1);
		try{
			Union.unionSetGeneric(a, b);
		} catch(NullPointerException e) {
			return;
		}
		fail("Longitud nula de uno de los vectoreso de los dos.");
	}
	
	@Test
	public void test6() {
		a.add(1);
		try{
			Union.unionSetGeneric(a, b);
		} catch(NullPointerException e) {
			return;
		}
		fail("Longitud nula de uno de los vectoreso de los dos.");
	}
	
	@Test
	public void test7() {
		a.add(2);
		b.add(null);
		c.add(2);
		c.add(null);
		assertTrue(Union.unionSetGeneric(a, b).equals(c));
	}
}