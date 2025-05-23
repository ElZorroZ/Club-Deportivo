/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rsbuttom;

/**
 *
 * @author Rojeru San
 */
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JButton;
import javax.swing.border.Border;

/**
* @author Rojeru San
 */
public class RSButtonMetro extends JButton implements MouseListener, MouseMotionListener {
    /**
     * Color para el fondo del boton
     */
    private Color colorNormal = new Color(0, 139, 139);
    private Color colorPressed = new Color(0, 0, 0);   
    private Color colorHover = new Color(38, 86, 186);
    
    private Border bordeMoved = javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(255, 255, 255));
    /**
     * Color para el texto
     */
    private Color colorTextNormal = new Color(255, 255, 255);
    private Color colorTextPressed = new Color(255, 255, 255);
    private Color colorTextHover = new Color(255, 255, 255);
    
    private Font f = new Font("Tahoma", Font.BOLD, 14);

    /**
     * Constructor de clase
     */
    @SuppressWarnings("LeakingThisInConstructor")
    public RSButtonMetro() {
        this.setFont(f);
        this.setPreferredSize(new Dimension(150, 35));
        this.setSize(new Dimension(150, 35));
        this.setBorder(null);
//        this.setBorderPainted(false);
        this.setContentAreaFilled(false);
        this.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        this.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        this.setBackground(this.colorNormal);
        this.setForeground(this.colorTextNormal);
        this.setOpaque(true);
        this.setVisible(true);
        this.addMouseListener(this);
        this.addMouseMotionListener(this);
    }

    @Override
    public void setEnabled(boolean b) {
        super.setEnabled(b);  // Llamamos a la implementación de JButton

        if (!b) {
            // Cuando el botón está deshabilitado, eliminamos los listeners de mouse
            this.removeMouseListener(this);
            this.removeMouseMotionListener(this);

            /* Cambiar los colores a un estado deshabilitado
            this.setBackground(new Color(200, 200, 200));  // Color gris o cualquier otro para deshabilitado*/
            this.setForeground(new Color(102,102,102));   // Texto gris
            this.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(102,102,102)));  // Borde gris
            this.setCursor(Cursor.getDefaultCursor());      // Cambiar el cursor
        } else {
            // Cuando el botón está habilitado, restauramos los listeners de mouse
            this.addMouseListener(this);
            this.addMouseMotionListener(this);

            // Restauramos los colores originales
            this.setBackground(this.colorNormal);
            this.setForeground(this.colorTextNormal);
            this.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));  // Restaurar el cursor de mano
            this.setBorder(bordeMoved);
        }
    }
    /**
     * se pinta la imagen con dimensiones de ancho y alto iguales al alto del
     * jbutton
     */
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
    }
    
    @Override
    public void mouseClicked(MouseEvent e) {
        if (!this.isEnabled()) {
            return; // Si el botón está deshabilitado, no hacemos nada
        }
    // Lógica para mouseClicked aquí
    }

    /**
     * Cuando se presiona el boton se cambian los colores de fondo y de texto
     */
    public void mousePressed(MouseEvent e) {
        this.setForeground(this.colorTextPressed);
        this.setBackground(this.colorPressed);
    }

    /**
     * Cuando se leventa el mouse del jbutton se retoman los colores originales
     */
    public void mouseReleased(MouseEvent e) {
        this.setBackground(this.colorNormal);
        this.setForeground(this.colorTextNormal);
    }

    public void mouseEntered(MouseEvent e) {
        if (!this.isEnabled()) {
        return; // Si el botón está deshabilitado, no hacemos nada
    }
    }

    public void mouseExited(MouseEvent e) {
        //this.setBorder(null);
        this.setBackground(this.colorNormal);
        this.setForeground(this.colorTextNormal);
    }

    public Color getColorPressed() {
        return colorPressed;
    }

    public void setColorPressed(Color colorPressed) {
        this.colorPressed = colorPressed;
    }

    public Color getColorTextPressed() {
        return colorTextPressed;
    }

    public void setColorTextPressed(Color colorTextPressed) {
        this.colorTextPressed = colorTextPressed;
    }

    public Color getColorHover() {
        return colorHover;
    }

    public void setColorHover(Color colorHover) {
        this.colorHover = colorHover;
    }

    public Color getColorTextHover() {
        return colorTextHover;
    }

    public void setColorTextHover(Color colorTextHover) {
        this.colorTextHover = colorTextHover;
    }

    public Color getColorNormal() {
        return colorNormal;
    }

    public void setColorNormal(Color colorNormal) {
        this.setBackground(colorNormal);
        this.colorNormal = colorNormal;      
    }

    public Color getColorTextNormal() {
        return colorTextNormal;
    }

    public void setColorTextNormal(Color colorTextNormal) {
        this.setForeground(colorTextNormal);
        this.colorTextNormal = colorTextNormal;
    }
    
    public Border getColorBorde() {
        return bordeMoved;
    }

    public void setColorBorde(Border bordeMoved) {
        this.bordeMoved = bordeMoved;
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        
        this.setForeground(this.colorTextHover);
        this.setBackground(this.colorHover);
        
        this.setBorder(bordeMoved);
    }
}
