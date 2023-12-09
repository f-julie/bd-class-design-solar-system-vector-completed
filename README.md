## Solar System

Another team has been waiting for your Vector class to be imported to test their calculations for moving planets around a sun using forces.



### Instructions:
* Copy your Vector class into the `src.com` package.
* In the `Main.java` declare instance variables for four `Planet` variables: `Sun, Earth, Mercury, Mars`
* Initialize the four fields based on the table below.

### Fields

| Planet  | mass | diameter | hue | position    | velocity
|---------|------|----------|-----|-------------| --- |
| Sun     | 100  | 50       | 38  | (300, 300)  | (0, 0)
| Earth   | 0.8  | 11       | 160 | (120, 300)  | (0, -2)
| Mercury | 0.6  | 10       | 20  | (200, 300)  | (0, -2.5)
| Mars    | 1    | 6        | 0   | (100, 300) | (0, -2.25)

Finally, each `Planet` will have a reference to one special "Planet", the Sun, which the planets will revolve around. The Sun should reference `null` for its Sun.


## Running the Simulation

Add the correct lines of code in the draw method to have each Planet draw itself and move. Check the Planet class to see what methods have already been created.

### A Completed Project Will:

Have three or four planets orbiting a Sun. The orbits do not have to be perfect but
should remain steady for several cycles.


## Extension

One conspicuos, missing thing in this simulation is having the planets attract each other.
To do this well requires using arrays and loops to iterate through all of the planets and apply Newton's formula between all of them. The numbers in this simulation have been selected for simplicity and with the assumption that planets are only attracted to the Sun.

Can you make planets attracted to each other as well as the Sun *and* maintain stability in the simulation?
If you get this working you could also implement other objects such as asteroids and moons.

