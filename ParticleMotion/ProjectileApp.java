/*
 * Open Source Physics software is free software as described near the bottom of this code file.
 *
 * For additional information and documentation on Open Source Physics please see: 
 * <http://www.opensourcephysics.org/>
 */

package org.opensourcephysics.sip.ch03;
import org.opensourcephysics.controls.*;
import org.opensourcephysics.frames.*;

/**
 * ProjectileApp solves and displays the time evolution of a projectile by stepping a projectile model.
 *
 * @author Wolfgang Christian, Jan Tobochnik, Harvey Gould
 * @version 1.0  05/16/05
 */
public class ProjectileApp extends AbstractSimulation {
  PlotFrame plotFrame = new PlotFrame("velocity", "mass", "Mass versus Velocity");
  Projectile projectile = new Projectile();

  public ProjectileApp() {
    plotFrame.setXYColumnNames(0, "t", "x");
    plotFrame.setXYColumnNames(1, "t", "y");
  }

  /**
   * Initializes the simulation.
   */
  public void initialize() {
	// green line is for mass
	// red line is for velocity
    double dt = control.getDouble("dt");
    double h = control.getDouble("initial height");
    double B = control.getDouble("initial B");
    double C = control.getDouble("initial C");
    double m = control.getDouble("initial mass");
    projectile.setState(h, 0, m);
    projectile.setStepSize(dt);  
    projectile.setB(B);
    projectile.setC(C);
  }

  /**
   * Does a time step.
   */
  public void doStep() {
    plotFrame.append(0, projectile.state[3], projectile.state[1]); // velocity vs time data added
    plotFrame.append(1, projectile.state[3], projectile.state[2]); // mass vs time data added
    projectile.step(); // advance the state by one time step
  }

  /**
   * Resets the simulation.
   */
  public void reset() {
    control.setValue("initial height", 0);
    control.setValue("initial B", 10);
    control.setValue("initial C", 0);
    control.setValue("initial mass", 10);
    control.setValue("dt", 0.01);
    enableStepsPerDisplay(true);
  }

  /**
   * Starts the Java application.
   * @param args  command line parameters
   */
  public static void main(String[] args) {
    SimulationControl.createApp(new ProjectileApp());
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

