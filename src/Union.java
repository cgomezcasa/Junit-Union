import java.util.HashSet;
import java.util.Set;
import java.util.Vector;

public class Union {

	public static Vector union (Vector a, Vector b) {
		Vector c = new Vector();
		
		if (a.size() == 0 || b.size() == 0)
		{
			throw new NullPointerException ("Longitud nula de uno de los vectoreso de los dos.");
	    }
		
		if (a == null || b == null)
		{
			throw new NullPointerException ("Uno de los vectores es nulo o los dos.");
	    }
		
	    for(int i = 0; i < a.size(); i++){
	    	if(!c.contains(a.elementAt(i))){
	    		c.addElement(a.elementAt(i));
	    	}
	   	}
	           
	    for(int i = 0; i < b.size(); i++){
	    	if(!c.contains(b.elementAt(i))){
	    		c.addElement(b.elementAt(i));
	    	}
	   	}
	   	return c;
	}
	
	public static Set unionSet (Set a, Set b) {
		Set c = new HashSet();
		
		if (a.size() == 0 || b.size() == 0)
		{
			throw new NullPointerException ("Longitud nula de uno de los vectoreso de los dos.");
	    }
		
		if (a == null || b == null)
		{
			throw new NullPointerException ("Uno de los vectores es nulo o los dos.");
	    }
		
	    c.addAll(a);
	    c.addAll(b);
	    
	   	return c;
	}
	
	public static <E> Set<E> unionSetGeneric (Set<? extends E> a, Set<? extends E> b)
    {
		Set<E> c = new HashSet<E>();
		
		if (a.size() == 0 || b.size() == 0)
		{
			throw new NullPointerException ("Longitud nula de uno de los vectoreso de los dos.");
	    }
		
		if (a == null || b == null)
		{
			throw new NullPointerException ("Uno de los vectores es nulo o los dos.");
	    }
		
		c.addAll(a);
	    c.addAll(b);
		
		return (Set<E>) c;
    }
}
