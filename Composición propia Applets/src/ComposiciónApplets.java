
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JApplet;

public class ComposiciónApplets extends JApplet {

    public void init() {

    }

    public void paint(Graphics s) {
        s.setColor(Color.BLACK);
        s.drawOval(155, 175, 300, 300);//circulo principal
        s.fillOval(155, 175, 300, 300);//relleno del circulo principal
        s.drawArc(70, 70, 200, 200, -6, 273);//oreja 1
        s.fillArc(70, 70, 200, 200, -6, 400);//relleno de la oreja 1
        s.drawArc(350, 70, 200, 200, -93, 281);//oreja 2
        s.fillArc(350, 70, 200, 200, -93, 400);//relleno de la oreja 2
        s.setColor(Color.PINK);
        s.drawArc(212, 210, 110, 170, 40, 200);//parte derecha de la cara
        s.fillArc(212, 210, 110, 170, 40, 400);//relleno de la parte derecha de la cara
        s.drawArc(296, 210, 110, 170, -60, 200);//parte izquierda de la cara
        s.fillArc(296, 210, 110, 170, -60, 400);//relleno de la parte izquierda de la cara
        s.drawArc(190, 353, 300, 100, 133, 110);//mejia izquierda
        s.fillArc(190, 353, 300, 100, 133, 120);//relleno de la mejia izquierda
        s.drawArc(125, 353, 300, 100, -64, 110);//mejia derecha
        s.fillArc(125, 353, 300, 100, -64, 120);//relleno de la mejia derecha
        s.drawArc(239, 167, 135, 300, -120, 60);//barbilla
        s.fillArc(239, 167, 135, 300, -120, 150);//relleno de la barbilla
        s.drawOval(230, 345, 75, 75);//relleno
        s.fillOval(230, 345, 75, 75);//relleno
        s.setColor(Color.BLACK);
        s.drawArc(200, 220, 220, 200, 230, 80);//sonrisa

        s.drawArc(216, 380, 110, 170, 116, 20);//sonrisa parte izquierda
        s.drawArc(293, 380, 110, 170, 43, 20);//sonrisa parte derecha

        s.setColor(Color.red);
        s.fillArc(318, 428, 6, 6, -120, 400);//relleno de la lengua
        s.fillArc(316, 430, 6, 6, -120, 400);//relleno de la lengua
        s.fillArc(314, 432, 6, 6, -120, 400);//relleno de la lengua
        s.fillArc(310, 432, 6, 6, -120, 400);//relleno de la lengua
        s.fillArc(325, 432, 6, 6, -120, 400);//relleno de la lengua
        s.fillArc(330, 426, 6, 6, -120, 400);//relleno de la lengua
        s.fillArc(306, 434, 10, 10, -120, 400);//relleno de la lengua
        s.fillArc(323, 427, 10, 10, -120, 400);//relleno de la lengua
        s.fillArc(315, 430, 15, 15, -120, 400);//relleno de la lengua
        s.fillArc(306, 438, 15, 15, -120, 400);//relleno de la lengua
        s.fillArc(300, 439, 15, 15, -120, 400);//relleno de la lengua
        s.fillArc(294, 439, 15, 15, -120, 400);//relleno de la lengua
        s.fillArc(285, 435, 15, 15, -120, 400);//relleno de la lengua
        s.fillArc(277, 427, 14, 14, -120, 400);//relleno de la lengua
        s.fillArc(275, 426, 9, 9, -120, 400);//relleno de la lengua
        s.fillArc(274, 425, 4, 4, -120, 400);//relleno de la lengua

        s.setColor(Color.BLACK);
        s.drawArc(260, 255, 90, 200, 215, 108);//boca
        s.drawArc(239, 167, 135, 300, -120, 60);//barbilla
        s.drawArc(259, 347, 100, 50, 85, 400);
        s.fillArc(259, 347, 100, 50, 85, 400);
        s.drawArc(213, 338, 200, 200, 60, 60);

        s.setColor(Color.white);
        s.drawArc(315, 240, 45, 100, -60, 400);
        s.fillArc(315, 240, 45, 100, -60, 400);
        s.drawArc(266, 240, 45, 100, -60, 400);
        s.fillArc(266, 240, 45, 100, -60, 400);
        s.setColor(Color.BLACK);
        s.drawArc(215, 425, 110, 170, 52, 35);//lengua parte izquierda

        s.drawArc(276, 427, 110, 170, 85, 38);//lengua parte derecha

        s.drawArc(315, 240, 45, 100, -60, 400);
        s.drawArc(266, 240, 45, 100, -60, 400);
        s.setColor(Color.BLACK);
        s.drawArc(323, 306, 15, 30, -60, 400);
        s.fillArc(323, 306, 15, 30, -60, 400);
        s.drawArc(289, 306, 15, 30, -60, 400);
        s.fillArc(289, 306, 15, 30, -60, 400);

    }

}
