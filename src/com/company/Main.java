package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.Line2D;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import static java.lang.Math.pow;

public class Main {


    static Image bird;

    public static void main(String[] args) {


        bird = new ImageIcon("bird.png").getImage();


        new Okno();
    }
}
class Okno extends JFrame implements ActionListener {
    public int width=700;
    public int height=700;
    JMenuBar menuBar;
    JMenu choose;
    JMenuItem lab1;
    JMenuItem lab2;
    JMenuItem lab3;

    Okno(){

        setVisible(true);
        setSize(width, height);
        setTitle("Karolina Auchimik 82603");
        setLocation(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        menuBar = new JMenuBar();
        choose = new JMenu("Menu");

        lab1 = new JMenuItem("Obrazek");
        lab2 = new JMenuItem("Krzywe");
        lab3 = new JMenuItem("Gra");

        lab1.addActionListener(this);
        lab2.addActionListener(this);
        lab3.addActionListener(this);


        choose.add(lab1);
        choose.add(lab2);
        choose.add(lab3);
        menuBar.add(choose);
        setJMenuBar(menuBar);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==lab1) {
            Okno fr = new Okno();
            Obrazek rys = new Obrazek();
            fr.getContentPane().add(rys);
        }
        if(e.getSource()==lab2)
        {
            Okno fr = new Okno();
            Krzywe tak = new Krzywe();
            fr.getContentPane().add(tak);
        }
        if(e.getSource()==lab3)
        {
            new Gra();
        }
    }
}


class Obrazek extends JPanel{

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D)g;
        Graphics2D g1 = (Graphics2D)g;
        Graphics2D g3 = (Graphics2D)g;
        Graphics2D g2d = (Graphics2D)g;

        BasicStroke bs1 = new BasicStroke(5, BasicStroke.CAP_ROUND,
                BasicStroke.JOIN_BEVEL);
        BasicStroke bs2 = new BasicStroke(2, BasicStroke.CAP_ROUND,
                BasicStroke.JOIN_BEVEL);
        g1.setStroke(bs1);
        g3.setStroke(bs2);

        setBackground(Color.white);


        g2d.drawImage(Main.bird,0, 30, null);





        g1.setColor(new Color(217, 206, 215));
        g1.fillRect(50, 250, 250,200);
        g1.setColor(new Color(77, 38, 65));
        g1.drawRect(50, 250, 250,200);
        g1.setColor(new Color(176, 154, 134));
        g1.fillRect(35, 230,280, 20);
        g1.setColor(new Color(77, 38, 65));
        g1.drawRect(35, 230,280, 20);


        g3.setColor(new Color(122, 104, 113));
        g3.fillRect(200,320,50,130);
        g3.setColor(new Color(79, 69, 77));
        g3.drawRect(200,320,50,130);

        g3.setColor(new Color(218, 238, 240));
        g3.fillRect(80, 320,80,50);
        g3.setColor(new Color(119, 132, 133));
        g3.drawRect(80, 320,80,50);
        g3.drawLine(120, 320,120,370);

        g2.setColor(new Color(240, 215, 55));
        g2.fillOval(350, 50, 80,80);

        g1.setColor(new Color(64, 74, 64));
        g1.drawLine(500,100,430, 200);
        g1.drawLine(430,200,400,170);
        g1.drawLine(400, 170, 300, 270);

        g1.setColor(new Color(48, 122, 42));
        g1.drawLine(0,400, 50,400);
        g1.drawLine(300, 400, 500,400);

        g2.setColor(new Color(181, 145, 191));
        g2.drawOval(340, 370, 10,10);
        g2.drawOval(360, 370, 10,10);
        g2.drawOval(350, 380, 10, 10);
        g2.drawOval(350, 360, 10,10);
        g2.drawOval(343, 363, 10,10);
        g2.drawOval(343, 378, 10,10);
        g2.drawOval(358, 363, 10,10);
        g2.drawOval(358, 378, 10,10);

        g2.setColor(new Color(223, 185, 235));
        g2.fillOval(340, 370, 10,10);
        g2.fillOval(360, 370, 10,10);
        g2.fillOval(350, 380, 10, 10);
        g2.fillOval(350, 360, 10,10);
        g2.fillOval(343, 363, 10,10);
        g2.fillOval(343, 378, 10,10);
        g2.fillOval(358, 363, 10,10);
        g2.fillOval(358, 378, 10,10);

        g2.setColor(new Color(107, 75, 117));
        g2.fillOval(350, 370, 11,11);

        g2.setColor(new Color(66, 135, 85));
        g2.drawLine(355,390, 355, 420);

        g2.setColor(new Color(230, 117, 203));
        g2.drawOval(370, 370, 10,10);
        g2.drawOval(390, 370, 10,10);
        g2.drawOval(380, 380, 10, 10);
        g2.drawOval(380, 360, 10,10);
        g2.drawOval(373, 363, 10,10);
        g2.drawOval(373, 378, 10,10);
        g2.drawOval(388, 363, 10,10);
        g2.drawOval(388, 378, 10,10);

        g2.setColor(new Color(235, 136, 212));
        g2.fillOval(370, 370, 10,10);
        g2.fillOval(390, 370, 10,10);
        g2.fillOval(380, 380, 10, 10);
        g2.fillOval(380, 360, 10,10);
        g2.fillOval(373, 363, 10,10);
        g2.fillOval(373, 378, 10,10);
        g2.fillOval(388, 363, 10,10);
        g2.fillOval(388, 378, 10,10);


        g2.setColor(new Color(232, 12, 181));
        g2.fillOval(380, 370, 11,11);

        g2.setColor(new Color(66, 135, 85));
        g2.drawLine(385,390, 385, 420);

        g2.setColor(new Color(111, 136, 173));
        g2.drawOval(400, 370, 10,10);
        g2.drawOval(420, 370, 10,10);
        g2.drawOval(410, 380, 10, 10);
        g2.drawOval(410, 360, 10,10);
        g2.drawOval(403, 363, 10,10);
        g2.drawOval(403, 378, 10,10);
        g2.drawOval(418, 363, 10,10);
        g2.drawOval(418, 378, 10,10);

        g2.setColor(new Color(169, 190, 222));
        g2.fillOval(400, 370, 10,10);
        g2.fillOval(420, 370, 10,10);
        g2.fillOval(410, 380, 10, 10);
        g2.fillOval(410, 360, 10,10);
        g2.fillOval(403, 363, 10,10);
        g2.fillOval(403, 378, 10,10);
        g2.fillOval(418, 363, 10,10);
        g2.fillOval(418, 378, 10,10);


        g2.setColor(new Color(21, 78, 163));
        g2.fillOval(410, 370, 11,11);

        g2.setColor(new Color(66, 135, 85));
        g2.drawLine(415,390, 415, 420);

        g2.setColor(new Color(191, 75, 86));
        g2.drawOval(430, 370, 10,10);
        g2.drawOval(450, 370, 10,10);
        g2.drawOval(440, 380, 10, 10);
        g2.drawOval(440, 360, 10,10);
        g2.drawOval(433, 363, 10,10);
        g2.drawOval(433, 378, 10,10);
        g2.drawOval(448, 363, 10,10);
        g2.drawOval(448, 378, 10,10);

        g2.setColor(new Color(237, 123, 135));
        g2.fillOval(430, 370, 10,10);
        g2.fillOval(450, 370, 10,10);
        g2.fillOval(440, 380, 10, 10);
        g2.fillOval(440, 360, 10,10);
        g2.fillOval(433, 363, 10,10);
        g2.fillOval(433, 378, 10,10);
        g2.fillOval(448, 363, 10,10);
        g2.fillOval(448, 378, 10,10);


        g2.setColor(new Color(189, 42, 56));
        g2.fillOval(440, 370, 11,11);

        g2.setColor(new Color(66, 135, 85));
        g2.drawLine(445,390, 445, 420);

    }
}


class Krzywe extends JPanel{
    double t;
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g1 = (Graphics2D) g;

        setBackground(Color.black);
//////////////////////k
        double[] x = {57, 81, 79, 64};
        double[] y = {397, 416, 199, 198};
        bezier(g1,x,y);
        double[] x1 = {64, 49, 112, 111};
        double[] y1 = {198, 197, 215, 200};
        bezier(g1,x1,y1);
        double[] x2 = {111, 110, 100, 90};
        double[] y2 = {200,  185,  291, 302};
        bezier(g1,x2,y2);
        double[] x3 = {90, 80, 174, 189 };
        double[] y3 = {302, 313, 212 , 208};
        bezier(g1,x3,y3);
        double[] x4 = {189,277,155,219};
        double[] y4 = {208,185 ,173, 216};
        bezier(g1,x4,y4);
        double[] x5 = {219,267,103,92};
        double[] y5 = { 216,248,314,303};
        bezier(g1,x5,y5);
        double[] x6 = {92,81,137,209};
        double[] y6 = {303,292,422,398};
        bezier(g1,x6,y6);
        double[] x7 = {209,223,165,157};
        double[] y7 = {398,393,393,406 };
        bezier(g1,x7,y7);
        double[] x8 = {157,149,92,90};
        double[] y8 = {406,419,317,302};
        bezier(g1,x8,y8);
        double[] x9 = {90,88,130,115};
        double[] y9 = {302,287,405,406};
        bezier(g1,x9,y9);
        double[] x10 = {115,100,72,57};
        double[] y10 = {406,407,397,397};
        bezier(g1,x10,y10);
///////////////////////////////////a
        double[] x11 = {291,319,348,353};
        double[] y11 = {420,428,178,192};
        bezier(g1,x11,y11);
        double[] x12 = {353,358,356,353};
        double[] y12 = {192,205,208,193};
        bezier(g1,x12,y12);
        double[] x13 = {353,350,397,412};
        double[] y13 = {193,178,423,424};
        bezier(g1,x13,y13);
        double[] x14 = {412,466,408,399};
        double[] y14 = {424,428,408,420};
        bezier(g1,x14,y14);
        double[] x15 = {399,391,365,362};
        double[] y15 = {420,430,288,273};
        bezier(g1,x15,y15);
        double[] x16 = {362,359,362,347};
        double[] y16 = {273,260,323,322};
        bezier(g1,x16,y16);
        double[] x17 = {347,332,390,376};
        double[] y17 = {322,321,335,330};
        bezier(g1,x17,y17);
        double[] x18 = {376,362,351,347};
        double[] y18 = {330,325,337,322};
        bezier(g1,x18,y18);
        double[] x19 = {347,343,307,325};
        double[] y19 = {322,307,408,424};
        bezier(g1,x19,y19);
        double[] x20 = {325,336,306,291};
        double[] y20 = {424,434,417,421};
        bezier(g1,x20,y20);
    }
        public void bezier(Graphics g,double[] x,double[] y){

            for (t = 0; t < 1; t += 0.00005) {
                double xt = pow(1 - t, 3) * x[0] + 3 * t * pow(1 - t, 2) * x[1] + 3 * pow(t, 2) * (1 - t) * x[2] + pow(t, 3) * x[3];
                double yt = pow(1 - t, 3) * y[0] + 3 * t * pow(1 - t, 2) * y[1] + 3 * pow(t, 2) * (1 - t) * y[2] + pow(t, 3) * y[3];
                g.setColor(new Color(230, 117, 203));
                ((Graphics2D) g).draw(new Line2D.Double(xt, yt, xt, yt));
            }
        }
}

 class Gra extends JFrame implements ActionListener {
     final int D_W = 1000;
     final int D_H = 700;

     static int unit = 10;
     Color colorGirl = Color.GRAY;
     Color colorGameOver1 = Color.black;
     Color colorBox1 = new Color(0, 204, 120);
     public int score = 0;
     int jump = 0;
     int jumpY = 0;
     boolean onSpacePresses = false;
     boolean down = false;
     boolean help = true;
     java.util.List<obstacle> obstacles = new ArrayList<>();
     int currentGirlX = 0;
     int currentGirlY = 0;
     boolean gameOver = false;
     DrawPanel drawPanel = new DrawPanel();
     JMenuBar menuBar;
     JMenu choose;
     JMenuItem lab1;
     JMenuItem lab2;
     JMenuItem lab3;


     public Gra() {
         super("game");
         setVisible(true);
         setResizable(false);
         setDefaultCloseOperation(EXIT_ON_CLOSE);
         addWindowListener(new WindowAdapter() {
             public void windowClosing(WindowEvent e) {
                 dispose();
                 System.exit(0);
             }

         });

         menuBar = new JMenuBar();
         choose = new JMenu("Laboratorium1");

         lab1 = new JMenuItem("Obrazek");
         lab2 = new JMenuItem("Krzywe");
         lab3 = new JMenuItem("Gra");

         lab1.addActionListener(this);
         lab2.addActionListener(this);
         lab3.addActionListener(this);


         choose.add(lab1);
         choose.add(lab2);
         choose.add(lab3);
         menuBar.add(choose);
         setJMenuBar(menuBar);

         initBoxG();
         ActionListener listener = new ActionListener() {
             public void actionPerformed(ActionEvent e) {
                 if (!gameOver) {
                     if (jump >= D_W) {
                         jump = 0;
                         initBoxG();
                         drawPanel.repaint();
                     } else {
                         jump += 10;
                         drawPanel.repaint();
                     }
                 }
             }
         };
         Timer timer = new Timer(15, listener);
         timer.start();
         ActionListener listenerD = new ActionListener() {
             public void actionPerformed(ActionEvent e) {
                 if (!gameOver) {
                     if (onSpacePresses) {
                         if (down) {
                             jumpY -= 20;
                         } else {
                             jumpY += 20;
                         }
                     }
                     if (jumpY >= 280) {
                         down = true;
                     }
                     if (jumpY <= 0) {
                         onSpacePresses = false;
                         down = false;
                         jumpY = 0;
                     }
                 }
             }
         };
         Timer timerD = new Timer(40, listenerD);
         timerD.start();
         add(drawPanel);
         pack();
         setLocationRelativeTo(null);
         setVisible(true);
     }

     @Override
     public void actionPerformed(ActionEvent e) {
         if (e.getSource() == lab1) {
             Okno fr = new Okno();
             Obrazek rys = new Obrazek();
             fr.getContentPane().add(rys);
         }
         if (e.getSource() == lab2) {
             Okno fr = new Okno();
             Krzywe tak = new Krzywe();
             fr.getContentPane().add(tak);
         }
         if (e.getSource() == lab3) {
             new Gra();
         }
     }

    private void initBoxG() {
        int nbr = 1;
        int x_ = 10;
        int h_ = 60;
        obstacles = new ArrayList<Gra.obstacle>();
        for (int it = 0; it < nbr; it++) {
            Random r = new Random();
            int step = r.nextInt(10) + 1;
            obstacle obstacle = new obstacle();
            obstacle.x_ = x_ * 30 + step * 10 + 700;
            obstacle.y_ = 300 - h_;
            obstacles.add(obstacle);
            help=true;
        }
    }
    private void drawBox(Graphics g) {
        int x = 0;
        int y = 0;
        int h = 0;
        int p = 0;
        for (obstacle obstacle : obstacles) {
            x = obstacle.x_;
            h = obstacle.h_;
            y = obstacle.y_;
            p = obstacle.p_;
            int maxH = 180;
            if (x - jump < 0) {
                jump = 0;
            }
            draw(g, x - jump, y, maxH, p * 10);

        }
    }

    private void gameOver(Graphics g) {
        Graphics2D graph = (Graphics2D) g;
        graph.setPaint(colorGameOver1);
        graph.setFont(new Font("MyFont", 20, 100));
        graph.drawString("Game Over", 370, 350);
    }

    private void drawFloor(Graphics g, int y, int maxH) {
        Graphics2D floor = (Graphics2D) g;
        floor.setFont(new Font("MyFont", 20, 50));
        floor.drawString("Score: "+ score, 400,60);

        floor.setPaint(new Color(90, 17, 61));
        floor.fillRect(0, y + maxH - 20, 1700, 300);
    }
    private void drawGirl(Graphics g, int y) {
        int xGirl = 180;
        int step = 1;
        g.setColor(colorGirl);
        currentGirlX = xGirl;
        currentGirlY = y;

        drawRaw(g,xGirl, y , 1, 1);
        drawRaw(g,xGirl, y - step * unit, 1, 1);
        drawRaw(g,xGirl, y - (2*step) * unit, 1, 1);
        drawRaw(g,xGirl, y - (3*step) * unit, 1, 1);
        drawRaw(g,xGirl-20, y , 1, 1);
        drawRaw(g,xGirl-20, y - step * unit, 1, 1);
        drawRaw(g,xGirl-20, y - (2*step) * unit, 1, 1);
        drawRaw(g,xGirl-20, y - 3*step * unit, 1, 1);
        drawRaw(g,xGirl-35, y - 4*step * unit, 6, 1);
        drawRaw(g,xGirl-30, y - 5*step * unit, 5, 1);
        drawRaw(g,xGirl-25, y - 6*step * unit, 4, 1);
        drawRaw(g,xGirl-25, y - 7*step * unit, 4, 1);
        drawRaw(g,xGirl-25, y - 8*step * unit, 4, 1);
        drawRaw(g,xGirl-35, y - 9*step * unit, 6, 1);
        drawRaw(g,xGirl-35, y - 10*step * unit, 6, 1);
        drawRaw(g,xGirl-35, y - 11*step * unit, 6, 1);
        drawRaw(g,xGirl-35, y - 12*step * unit, 2, 1);
        drawRaw(g,xGirl-5, y - 12*step * unit, 1, 1);
        drawRaw(g,xGirl+15, y - 12*step * unit, 1, 1);
        drawRaw(g,xGirl+25, y - 8*step * unit, 1, 2);
        drawRaw(g,xGirl+35, y - 6*step * unit, 2, 1);
        drawRaw(g,xGirl-45, y - 8*step * unit, 1, 2);
        drawRaw(g,xGirl-65, y - 6*step * unit, 2, 1);
        drawRaw(g,xGirl-35, y - 13*step * unit, 6, 1);
        drawRaw(g,xGirl-35, y - 14*step * unit, 6, 1);
        drawRaw(g,xGirl-25, y - 15*step * unit, 4, 1);
    }
    private void drawRaw(Graphics g, int Girl, int y, int w, int h) {
        Graphics2D abc = (Graphics2D) g;
        abc.fillRect(Girl, y, w * unit, h * unit);
    }
    private void draw(Graphics g, int x, int y, int h, int p) {
        if (x <= currentGirlX && x + p >= currentGirlX && y <= currentGirlY) {
            gameOver(g);
            gameOver = true;
            return;
        }
        else if(x<= currentGirlX){
            if(help)
            {
                score++;
                help=false;
            }

        }
        Graphics2D gcd = (Graphics2D) g;
        gcd.setPaint(colorBox1);
        gcd.fillRect(x, y, p, h);

    }
    private class DrawPanel extends JPanel {
        public DrawPanel() {
            MoveAction action = new MoveAction("onSpace");
            String ACTION_KEY = "onSpace";
            KeyStroke W = KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0);
            InputMap inputMap = getInputMap(WHEN_IN_FOCUSED_WINDOW);
            inputMap.put(W, ACTION_KEY);
            ActionMap actionMap = getActionMap();
            actionMap.put(ACTION_KEY, action);
        }
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            drawBox(g);
            drawFloor(g, 250, 180);
            drawGirl(g, 400 - jumpY);
            if (gameOver) {
                gameOver(g);
            }
        }
        public Dimension getPreferredSize() {
            return new Dimension(D_W, D_H);
        }
    }
    private class obstacle {
        int x_ = 10;
        int y_ = 100;
        int h_ = 60;
        int p_ = 10;
    }
    public class MoveAction extends AbstractAction  {
        public MoveAction(String name) {
            putValue(NAME, name);
        }
        public void actionPerformed(ActionEvent actionEvent) {
            onSpacePresses = true;
            drawPanel.repaint();
        }
    }
}
