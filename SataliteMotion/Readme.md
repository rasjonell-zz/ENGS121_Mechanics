# ENGS121 - Mechanics

## Project 2

**Description**
Consider a satellite affected not only by the Earth’s gravitational force, but also by aweak uniform “solar wind” of magnitude Wacting in the horizontal direction. The equations of motion can be written as:

![](https://latex.codecogs.com/svg.latex?%5Clarge%20%5Cfrac%7Bdx%7D%7Bdt%7D%20%3D%20v_x%20%5C%5C%5C%5C%20%5Cfrac%7Bdv_x%7D%7Bdt%7D%20%3D%20-%20%5Cfrac%7BGMx%7D%7B%28x%5E2%20+%20y%5E2%29%5E%5Cfrac%7B3%7D%7B2%7D%7D%20+%20W%20%5C%5C%5C%5C%20%5Cfrac%7Bdy%7D%7Bdt%7D%20%3D%20v_y%20%5C%5C%5C%5C%20%5Cfrac%7Bdv_y%7D%7Bdt%7D%20%3D%20-%20%5Cfrac%7BGMy%7D%7B%28x%5E2%20+%20y%5E2%29%5E%5Cfrac%7B3%7D%7B2%7D%7D)

W and the product GM are constant parameters. Consider the following two values of the product GM, where G is the gravitational constant and M is the mass of Earth:

- GM = S, where S is the sum of the digits of your ID#;
- GM = D, where D is the maximal value from the last three digits of your ID#.

**Project Tasks**

- Implement the satellitemotion around Earth. Use RK45 solver.
- Study the motion properties for different values of the “solar wind” Wand the initial conditions x(0), vx(0), y(0)and vy(0) for each case of the product GM. Include the case when W = 0 and the orbit is circular.
- Identify and explain different types of the satellite motion. Report the parameter values for each one.
- For different initial conditions find the minimal value W<sub>0</sub>, at which the satellite escape Earth.

### Project Implementation

We have two different values for GM:

```java
final static int[] AUA_ID = { 0, 9, 1, 7, 0, 0, 8, 7 };
final static double GM_SUM_OF_DIGITS = IntStream.of(AUA_ID).sum(); // 32
final static double GM_GREATEST_DIGIT = 9;
```

## When GM is The Greatest Digit = 9

**When the velocity in horizontal and vertical do not exist gravity pulls the satellite toward the earth**

![Planet App][gd_x_is_1]

**When the velocity in horizontal and vertical exist we get ecliptic trajectory**

![Planet App][gd_x_1_vy_1]

**When Solar Wind is stronger than gravity, Satalite leaves the orbit**

![Planet App][gd_w_is_big]

**When Solar Wind exists but is not stronger than gravity we get this kind of trajectory**

![Planet App][gd_w_3]

## When GM is The Sum of AUA ID = 32

**When the velocity in horizontal and vertical exist we get ecliptic trajectory**

![Planet App][sum_x_is_1]

**When Solar Wind is as strong as GM Satalite is not able to move**

![Planet App][sum_w_is_32]

[sum_x_is_1]: ../img/SUM_x_is_1.png
[sum_w_is_32]: ../img/SUM_w_is_32.png
[gd_x_is_1]: ../img/GD_x_is_1.png
[gd_x_1_vy_1]: ../img/GD_x_1_vy_1.png
[gd_w_is_big]: ../img/GD_w_is_big.png
[gd_w_3]: ../img/GD_w_3.png
