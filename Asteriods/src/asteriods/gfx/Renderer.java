/*
 * << Asteroids >>
 */

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package asteriods.gfx;

import asteriods.Game;
import asteriods.controller.Controller;
import asteriods.references.GameState;
import asteriods.screens.MainMenu;
import java.awt.Color;
import java.awt.Graphics;

/**
 * @author pumabanks [ Brandon W. Banks ]
 */
public class Renderer {

    private GameState state;
    private Controller controller;
    private MainMenu menu;
    
    public Renderer(Game game) {
        this.state = game.getState();
        this.controller = game.getController();
        this.menu = game.getMainMenu();
    }
    
    
    public void renderBackground(Graphics g) {
        switch(this.state) {
            case MENU  :                            break;
            case GAME  :                            break;
            case PAUSE :                            break;
            case END   :                            break;
        }
    }

    public void renderForeground(Graphics g) {
        switch(this.state) {
            case MENU  : this.menu.render(g);       break;
            case GAME  : this.controller.render(g); break;
            case PAUSE :                            break;
            case END   :                            break;
        }
    }    
}
