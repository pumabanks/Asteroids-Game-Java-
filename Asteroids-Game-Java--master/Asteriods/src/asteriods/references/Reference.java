/*
 * << Asteroids >>
 */

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package asteriods.references;

import java.awt.Color;

/**
 * @author pumabanks [ Brandon W. Banks ]
 */
public class Reference {
    
    public static final String GAME_TITLE = "Asteroids";
    
    public static final int GAME_WIDTH  = 900;
    public static final int GAME_HEIGHT = 700;

    public static final int CENTER_X = GAME_WIDTH/2;
    public static final int CENTER_Y = GAME_HEIGHT/2;
    
    public static final int PLAYER_SIZE = GAME_WIDTH/50;
    public static final Color PLAYER_COLOR = new Color(0,155,24);
    
    public static final double CLOCK_FREQUENCY = 1_000_000_000;
    public static final double FRAME_RATE = 60.0;    
    public static final double TARGET_FREQUENCY = CLOCK_FREQUENCY / FRAME_RATE;    
    public static final int BUFFER_STRATEGY = 4;
}
