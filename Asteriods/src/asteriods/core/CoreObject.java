/*
 * << Asteroids >>
 */

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package asteriods.core;

import java.awt.Graphics;

/**
 * @author pumabanks [ Brandon W. Banks ]
 */
public abstract class CoreObject {
    
    protected double x;
    protected double y;
    protected double dx;
    protected double dy;
    
    public abstract void advance();
    public abstract void render(Graphics g);
}
