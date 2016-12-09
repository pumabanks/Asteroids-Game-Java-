/*
 * << Asteroids >>
 */

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package asteriods.references;

/**
 * @author pumabanks [ Brandon W. Banks ]
 */
public class Reference {
    
    public static int GAME_WIDTH  = 1080;
    public static int GAME_HEIGHT = 920;
    public static String GAME_TITLE = "Asteroids";
   
    
    public static final double CLOCK_FREQUENCY = 1_000_000_000;
    public static final double FRAME_RATE = 60.0;    
    public static final double TARGET_FREQUENCY = CLOCK_FREQUENCY / FRAME_RATE;    
    public static final int BUFFER_STRATEGY = 4;
}
