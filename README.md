# ENGS121 - Mechanics

## Project 1

**Description**

A raindrop of initial mass m<sub>0</sub> starts falling from rest under the  combined action of gravity ![](https://latex.codecogs.com/svg.latex?W(t)&space;=&space;m(t)g) and air resistance ![](https://latex.codecogs.com/svg.latex?$F_{air}(t)&space;=&space;-Cm^{\alpha}v^{\beta}$). While falling, its mass is changing at a rate: ![](https://latex.codecogs.com/svg.latex?{\frac{dm}{dt}&space;=&space;Bm(t)v(t)})


**Project Tasks**

- Implement the raindrop falling process. Use the fourth-order Runge-Kutta algorithm.
- Study the motion properties for different values of the parameters Band C. Consider positive (mass increment) and negative (mass decrement) values for B, but only positive values for C(C> 0).
- Identify different types of the raindrop motion and report the parameter values for each one.


### Project Implementation

**When B is positive and C is small**

![Projectile App][pos_b_small_c]

**When B is negative and C is small**

![Projectile App][neg_b_small_c]

**When B is big and C is big**

![Projectile App][big_b_big_c]

**When B is negative and C is Big**

![Projectile App][neg_b_big_c]

**FALLING PARTICLE FOR DIFFERENT B AND C**

![Falling Particle App][falling_particle]

[big_b_big_c]: img/big_b_big_c.png
[neg_b_big_c]: img/neg_b_big_c.png
[pos_b_small_c]: img/pos_b_small_c.png
[neg_b_small_c]: img/neg_b_small_c.png
[falling_particle]: img/falling_particle.png
