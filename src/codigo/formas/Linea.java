/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo.formas;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Polygon;

/**
 *
 * @author Sarita
 */
public class Linea extends Polygon {

    public int x;
    public int y;
    public Color color;

    public Linea(int _posX, int _posY, Color _color) {
        x = _posX;
        y = _posY;
        color = _color;
    }

    public void dibujate(Graphics2D g2, int _posX, int _posY, Color _color) {
        g2.setColor(_color);
        g2.drawLine(_posX, _posY, x, y);

    }

}
