/**
 * 
 */
package org.escoladeltreball.oopintro1;

/**
 * @author jmendez
 *
 */
public class Escaleno extends Triangle {

	/**
	 * @param base
	 * @param height
	 */
	public Escaleno(double base, double height) {
		super(base, height);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.escoladeltreball.oopintro1.Figure#perimeter()
	 */
	@Override
	public double perimeter() {
		return 3 * base + height;
	}

}
