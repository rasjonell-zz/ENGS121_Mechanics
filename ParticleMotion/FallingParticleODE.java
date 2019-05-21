/*
 * Open Source Physics software is free software as described near the bottom of this code file.
 *
 * For additional information and documentation on Open Source Physics please see: 
 * <http://www.opensourcephysics.org/>
 */

package org.opensourcephysics.sip.ch03;
import org.opensourcephysics.numerics.*;

/**
 * FallingParticleODE models a falling particle by implementing the ODE interface.
 *
 * @author Wolfgang Christian, Jan Tobochnik, Harvey Gould
 * @version 1.0  05/16/05
 */
public class FallingParticleODE implements ODE {
  final static double g = 9.8;
  private double B = 1;
  private double C = 1;
  final static double alpha = 0.8; // d1 = 8
  final static double beta = 0.01; // d2 = 7
  double[] state = new double[4];

  /**
   * Constructs the FallingParticleODE model with the given intial postion and velocity.
   *
   * @param y double
   * @param v double
   */
  public FallingParticleODE(double h, double m, double B, double C) {
    state[0] = h; // initial height
    state[1] = m; // initial mass
    state[2] = 0; // initial velocity
    state[3] = 0; // initial time
    this.B = B;
    this.C = C;
  }

  /**
   * Gets the state array.  Required to implement ODE interface
   *
   * @return double[]
   */
  public double[] getState() { // required to implement ODE interface
    return state;
  }

  /**
   * Gets the rate array.  Required to implement ODE interface
   * The rate is computed using the given state, not the object's state.
   *
   * @param state double[]
   * @param rate double[]
   */
  public void getRate(double[] state, double[] rate) {
    rate[0] = -state[2];                            // rate of change of h is v
    rate[1] = B * state[1] * state[2];              // rate of change of mass
    rate[2] = g - C * Math.pow(state[1], alpha - 1)
                    * Math.pow(state[2], beta) - B
                    * Math.pow(state[2], 2);;       // change of velocity
    rate[3] = 1;                                    // rate of change of time is constant
  }
}

/* 
 * Open Source Physics software is free software; you can redistribute
 * it and/or modify it under the terms of the GNU General Public License (GPL) as
 * published by the Free Software Foundation; either version 2 of the License,
 * or(at your option) any later version.

 * Code that uses any portion of the code in the org.opensourcephysics package
 * or any subpackage (subdirectory) of this package must must also be be released
 * under the GNU GPL license.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston MA 02111-1307 USA
 * or view the license online at http://www.gnu.org/copyleft/gpl.html
 *
 * Copyright (c) 2007  The Open Source Physics project
 *                     http://www.opensourcephysics.org
 */

