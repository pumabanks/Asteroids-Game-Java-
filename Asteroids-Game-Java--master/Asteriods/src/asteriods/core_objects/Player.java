/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asteriods.core_objects;

import asteriods.core.CoreObject;
import asteriods.references.Reference;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;


/**
 *
 * @author pumabanks
 */
public class Player extends CoreObject {
    
    private double rotation = 0.0;

    @Override
    public void advance() {
        x += dx;
        y += dy;
    }

    @Override
    public void render(Graphics g) {
        
        g.setColor(Reference.PLAYER_COLOR);
        int x [] = {Reference.CENTER_X - Reference.PLAYER_SIZE,Reference.CENTER_X,Reference.CENTER_X + Reference.PLAYER_SIZE,Reference.CENTER_X,Reference.CENTER_X-Reference.PLAYER_SIZE};
        int y [] = {Reference.CENTER_Y + Reference.PLAYER_SIZE,Reference.CENTER_Y - (int)(1.75*Reference.PLAYER_SIZE),Reference.CENTER_Y + Reference.PLAYER_SIZE,Reference.CENTER_Y,Reference.CENTER_Y + Reference.PLAYER_SIZE};
        g.drawPolyline(x, y, 5);
    }
 
    
    public void rotate(int deg) {
        this.rotation = deg;
    }
    
}
