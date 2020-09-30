/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.unwe;

/**
 *
 * @author inf2067_usr
 */
public class Variables {

    public static void main(String[] args) {
        int speedOfLight = 299792458;
        System.out.println("The speed of light is " + speedOfLight +" m/s.");
        
        float earthGravity = 9.8f;
        System.out.printf("The gravity of the Earth is "+ earthGravity+" m/s2.\n");
        
        long stars;
        stars = 300_000_000_000l;
        System.out.println("There are " + stars+" stars in the Milky Way Galaxy.");
        
        short radius;
        radius = 6378;
        System.out.println("The radius of the Earth is " +radius + " km.");
        
        byte planets = 8;
        System.out.println("There are "+ planets+" planets in the Solar System.");
        
        String largestPlanet = "Jupiter";
        System.out.println("The largest planet in the Solar System is "+largestPlanet+".");
        
        double gravity = 24.79;
        System.out.printf("The gravity of Jupiter is %.2f m/s2.\n", gravity);

        boolean isIt = gravity > earthGravity;
        System.out.println("Is Jupiter gravity stronger then Earth's: "+ isIt);
       
    }
    
}
