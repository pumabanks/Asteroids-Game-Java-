/*
 * << Asteroids >>
 * 
 * [ Brandon W. Banks ]
 *
 */


//////////////////////////////////////////// Package
package asteriods;
//////////////////////////////////////////// Imports (Custom)
import asteriods.controller.Controller;
import asteriods.core_objects.Player;
import asteriods.gfx.Renderer;
import asteriods.input.KeyInput;
import asteriods.input.MouseInput;
import asteriods.references.GameState;
import asteriods.references.Reference;
import asteriods.screens.MainMenu;
//////////////////////////////////////////// Imports
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import javax.swing.JFrame;
////////////////////////////////////////////

public class Game extends Canvas implements Runnable {

    //public static Game game;
    
    private static JFrame frame;
    private GameState state;
    
    private MainMenu menu;
    private Controller controller;
    private Renderer renderer;
    private KeyInput keyboard;
    private MouseInput mouse;
    private Player player;
    
    private boolean running = true;
    private double score;
    
    public static void main(String[] args) {
        Game game = new Game();
        game.run();
    }
    
    
    @Override
    public void run() {
        this.load();
        this.render();
        Long timer = System.currentTimeMillis();
        Long t1 = System.nanoTime();
        double dt = 0;
        
        while(this.running) 
        {
            Long t2 = System.nanoTime();
            dt += (t2 - t1)/Reference.TARGET_FREQUENCY;
            t1 = t2;
            
            if(dt >= 1) {
                this.advance();
                this.render();
                dt--;
            }
            
            switch(this.state) {
                case MENU : ////////////// MENU //////////////
                        break;
                    
                case GAME : ////////////// GAME //////////////            
                        if(System.currentTimeMillis() - timer > 1000) {
                            timer += 500;
                            // generate asteroids
                        }
                        break;
                    
                case PAUSE :////////////// PAUSE //////////////
                        break;
                    
                case END :  ////////////// END //////////////
                        break;
            }  
        }
        // end of game handeling
    }
    
    
    public void load() {
        
        // initialize game class
        
        this.init();
        
        // initialize JFrame basic properties
        
        this.frame = new JFrame();        
        this.frame.add(this);
        this.frame.setTitle(Reference.GAME_TITLE);
        this.frame.setSize(Reference.GAME_WIDTH, Reference.GAME_HEIGHT);
        
        // initilize JFrame details
        
        this.frame.setFocusable(true);
        this.frame.setResizable(false);
        this.frame.setLocationRelativeTo(null);
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // finish JFrame initialization
   
        this.frame.setVisible(true);
        this.frame.pack();
        
    }
    
    
    public void reset() {
        
    }
    
    
    public void pause() {
        
    }
    
    
    public void resume() {
        
    }

    
    public void end() {
        this.running = false;
    }



    public void setScore(double s) {
        this.score = s;
    }

    public double getScore() {
        return this.score;
    }


    
    private void init() {
        
        this.keyboard = new KeyInput();
        this.mouse = new MouseInput();
        this.menu = new MainMenu();        
        this.player = new Player();
        
        this.addMouseListener(this.mouse);
        this.addMouseMotionListener(this.mouse);
        this.addKeyListener(this.keyboard);
        
        this.state = GameState.MENU;       
        this.controller = new Controller();        
        this.renderer = new Renderer(this);
        
    }
    
    private void advance() {
        this.controller.advance();
    }
    
    
    private void render() {
        
        if(this.getBufferStrategy() == null) {
            this.createBufferStrategy(Reference.BUFFER_STRATEGY);
            return;
        }
        
        Graphics g = this.getBufferStrategy().getDrawGraphics();
        g.setColor(new Color(0,24,40));
        g.fillRect(0,0,Reference.GAME_WIDTH, Reference.GAME_HEIGHT);
        
        this.renderer.renderBackground(g);
        this.renderer.renderForeground(g);
        
        g.dispose();
        this.getBufferStrategy().show();
    }

    
    public GameState getState() {
        return this.state;
    }
    
    public Controller getController() {
        return this.controller;
    }

    public MainMenu getMainMenu() {
        return this.menu;
    }
    
}
