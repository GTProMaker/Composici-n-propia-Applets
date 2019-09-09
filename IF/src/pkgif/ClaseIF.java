package pkgif;

import javax.swing.JOptionPane;

public class ClaseIF {

    Integer Num1 = 0, Num2 = 0, Num3 = 0;
    double num1 = 0, num2 = 0, num3 = 0;

    public void SetIgual(int x, int y) {

        this.Num1 = x;
        this.Num2 = y;

        if (Num1 == Num2) {
            JOptionPane.showMessageDialog(null, "El Número " + Num1 + " es Igual al Número " + Num2);
        } else {
            JOptionPane.showMessageDialog(null, "El Número " + Num1 + " es Diferente al Número " + Num2);
        }

    }

    public void SetMayor(int x, int y) {
        //Los Números No puden ser los mismos
        this.Num1 = x;
        this.Num2 = y;
        if (Num1 > Num2) {
            JOptionPane.showMessageDialog(null, "El Número " + Num1 + " es Mayor al Número " + Num2);
        } else {
            JOptionPane.showMessageDialog(null, "El Número " + Num2 + " es Mayor al Número " + Num1);
        }

    }

    public void SetMenor(int x, int y) {

        this.Num1 = x;
        this.Num2 = y;
        if (Num1 < Num2) {
            JOptionPane.showMessageDialog(null, "El Número " + Num1 + " es Menor al Número " + Num2);
        } else {
            JOptionPane.showMessageDialog(null, "El Número " + Num2 + " es Menor al Número " + Num1);
        }

    }

    public void SetMaximo(int x, int y, int z) {

        this.Num1 = x;
        this.Num2 = y;
        this.Num3 = z;
        int aux = 0;

        if (Num1 < Num2) {
            aux = Num1;
            Num1 = Num2;
            Num2 = aux;
        }
        if (Num2 < Num3) {
            aux = Num2;
            Num2 = Num3;
            Num3 = aux;
        }
        if (Num1 < Num2) {
            aux = Num1;
            Num1 = Num2;
            Num2 = aux;
        }
        JOptionPane.showMessageDialog(null, "Ordenamiento de Mayor a Menor\n" + Num1 + " - " + Num2 + " - " + Num3);

    }

    public void SetMinimo(int x, int y, int z) {

        this.Num1 = x;
        this.Num2 = y;
        this.Num3 = z;
        int aux = 0;

        if (Num1 > Num2) {
            aux = Num1;
            Num1 = Num2;
            Num2 = aux;
        }
        if (Num2 > Num3) {
            aux = Num2;
            Num2 = Num3;
            Num3 = aux;
        }
        if (Num1 > Num2) {
            aux = Num1;
            Num1 = Num2;
            Num2 = aux;
        }
        JOptionPane.showMessageDialog(null, "Ordenamiento de Menor a Mayor\n" + Num1 + " - " + Num2 + " - " + Num3);

    }

    public void SetRaizCuadrada(double x) {

        this.num1 = x;
        num2 = Math.sqrt(num1);
        JOptionPane.showMessageDialog(null, "La Raiz Cudrada de " + num1 + "\nEs " + num2);
    }

    public void SetResta(int x, int y) {
        this.Num1 = x;
        this.Num2 = y;
        Num3 = Num1 - Num2;
        JOptionPane.showMessageDialog(null, "La resta de los Número " + Num1 + " - " + Num2 + "\nEs Igual " + Num3);
    }

    public void SetSuma(int x, int y) {
        this.Num1 = x;
        this.Num2 = y;
        Num3 = Num1 + Num2;
        JOptionPane.showMessageDialog(null, "La Suma de los Número " + Num1 + " + " + Num2 + "\nEs Igual " + Num3);
    }

    public void SetMultiplicacion(int x, int y) {
        this.Num1 = x;
        this.Num2 = y;
        Num3 = Num1 * Num2;
        JOptionPane.showMessageDialog(null, "La Multiplicacion de los Número " + Num1 + " * " + Num2 + "\nEs Igual " + Num3);
    }

    public void SetDivision(double x, double y) {
        this.num1 = x;
        this.num2 = y;
        num3 = num1 / num2;
        JOptionPane.showMessageDialog(null, "La Division de los Números  " + num1 + " / " + num2 + "\nEs Igual " + num3);
    }

    public void SetFormulaCuadratica(double x, double y, double z) {
        this.num1 = x;
        this.num2 = y;
        this.num3 = z;
        double a, b, c, d, res1 = 0, res2 = 0;
        a = -y;
        b = Math.pow(2, y);
        c = 4 * (x * z);
        d = 2 * a;
        if (b > c) {
            res1 = (a + Math.sqrt(b - c)) / d;
            res2 = (a - Math.sqrt(b - c)) / d;
            JOptionPane.showMessageDialog(null, "Las soluciones de la formula son:" + "\nSolucion UNO: " + res1 + "\nSolucion DOS: " + res2);

        } else {
            JOptionPane.showMessageDialog(null, "B al cuadrado es Menor a 4 a*c");
        }

    }

    public void SetNot(int x, int y) {
        this.num1 = x;
        this.num2 = y;
        if (x != y) {
           JOptionPane.showMessageDialog(null,+x+" es Diferente de "+y);
        } else {
            JOptionPane.showMessageDialog(null,"X es Igual Y");
        }

    }

    public void SetOr(int x) {
        this.num1 = x;
        if (x > 0 || x < 10) {
            JOptionPane.showMessageDialog(null,+x+" esta entre 0 y 10");
        } else {
            JOptionPane.showMessageDialog(null,+x+" no esta dentro 0 y 10");
        }

    }

    public void Setand(int x) {
        this.num1 = x;
        if (x >0 && x <11) {
            JOptionPane.showMessageDialog(null,+x+" esta entre 0 y 10");
        } else {
            JOptionPane.showMessageDialog(null,+x+" no esta dentro 0 y 10");
        }

    }

}
