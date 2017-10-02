/**
 * 
 */
package org.escoladeltreball.oopintro1;

/**
 * @author jmendez
 *
 */
public class Equilatero extends Triangle {

	/**
	 * @param base
	 * @param height
	 */
	public Equilatero(double base, double height) {
		super(base, height);
	}

	/* (non-Javadoc)
	 * @see org.escoladeltreball.oopintro1.Figure#perimeter()
	 */
	@Override
	public double perimeter() {
		
		return base * 3;
	}

}
