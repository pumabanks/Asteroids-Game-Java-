/*
 * << Asteroids >>
 */

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package asteriods.controller;

/**
 * @author pumabanks [ Brandon W. Banks ]
 */

import asteriods.core.CoreObject;
import java.awt.Graphics;
import java.util.ArrayList;

/**
 * Used to store, render, and tick objects in the game
 * Doesn't override rendering of objects but rather tells each object in the game to render itself using the "render()" method
 * @author Team 11
 */
public class Controller {
    private static ArrayList<CoreObject> objects = new ArrayList<CoreObject>();
    

    public void advance() {
        for(int i=0; i < objects.size(); i++) { //for(int i=0; i<objects.size(); i++)
            objects.get(i).advance();
        }
    }
    

    public void render(Graphics g) {
        for(int i=0; i < objects.size(); i++) { //for(int i=0; i<objects.size(); i++)
            objects.get(i).render(g);
        }
    }
    
 
    public static void addObject(CoreObject instance) {
        objects.add(instance);
    }
    

    public static void removeObject(CoreObject instance) {
        objects.remove(instance);
    }  


    public void removeAllObjects() {
        this.objects.clear();
    } 
    
    
    public static ArrayList<CoreObject> getObjects() {
        return objects;
    }
    
}
