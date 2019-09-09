package pkgif;

import javax.swing.JOptionPane;

public class IF {

    public static void main(String[] args) {
        ClaseIF condicional = new ClaseIF();
        String A, B, C, D, R;
        char r;
        int a, b, c, d;
        do{
        do {
            A = JOptionPane.showInputDialog("MENÚ PRINCIPAL\n1.Operaciones Basicas\n2.Operaciones Logicas\n3.Operaciones Mixtas");
            a = Integer.parseInt(A);
        } while (a < 1 || a > 4);
        switch (a) {
            case 1: {
                do {
                    do {

                        B = JOptionPane.showInputDialog("SUB MENÚ\n1.Raiz Cudrada\n2.Resta\n3.Suma\n4.Multiplicacion"
                                + "\n5.Division\n6.Formula Cuadratica");
                        b = Integer.parseInt(B);
                    } while (b < 1 || b > 7);
                    switch (b) {
                        case 1: {
                            String X;
                            int x;
                            X = JOptionPane.showInputDialog("Ingrese el Valor del Número al que desea sacarle la raiz cuadrada");
                            x = Integer.parseInt(X);
                            condicional.SetRaizCuadrada(x);
                            break;

                        }
                        case 2: {
                            String X, Y;
                            int x, y;
                            X = JOptionPane.showInputDialog("Ingrese el Valor del dato Número 1: ");
                            x = Integer.parseInt(X);
                            Y = JOptionPane.showInputDialog("Ingrese el Valor del dato Número 2: ");
                            y = Integer.parseInt(Y);
                            condicional.SetResta(x, y);
                            break;
                        }
                        case 3: {
                            String X, Y;
                            int x, y;
                            X = JOptionPane.showInputDialog("Ingrese el Valor del dato Número 1: ");
                            x = Integer.parseInt(X);
                            Y = JOptionPane.showInputDialog("Ingrese el Valor del dato Número 2: ");
                            y = Integer.parseInt(Y);
                            condicional.SetSuma(x, y);
                            break;
                        }
                        case 4: {
                            String X, Y;
                            int x, y;
                            X = JOptionPane.showInputDialog("Ingrese el Valor del dato Número 1: ");
                            x = Integer.parseInt(X);
                            Y = JOptionPane.showInputDialog("Ingrese el Valor del dato Número 2: ");
                            y = Integer.parseInt(Y);
                            condicional.SetMultiplicacion(x, y);
                            break;
                        }
                        case 5: {
                            String X, Y;
                            double x, y;
                            X = JOptionPane.showInputDialog("Ingrese el Valor del dato Número 1: ");
                            x = Integer.parseInt(X);
                            Y = JOptionPane.showInputDialog("Ingrese el Valor del dato Número 2: ");
                            y = Integer.parseInt(Y);
                            condicional.SetDivision(x, y);
                            break;
                        }
                        case 6:{
                          String X, Y, Z;
                            int x, y, z;
                            X = JOptionPane.showInputDialog("Ingrese el Valor del dato Número 1: ");
                            x = Integer.parseInt(X);
                            Y = JOptionPane.showInputDialog("Ingrese el Valor del dato Número 2: ");
                            y = Integer.parseInt(Y);
                            Z = JOptionPane.showInputDialog("Ingrese el Valor del dato Número 3: ");
                            z = Integer.parseInt(Z);
                            condicional.SetFormulaCuadratica(x, y, z);
                            break;
                        }  

                    }
                    r = JOptionPane.showInputDialog(null, "Ingrese 'V' para volver o 'S' para Salir").charAt(0);
                } while (r == 'V' || r == 'v');
                break;
            }
            case 2: {
                do {
                    do {
                        C = JOptionPane.showInputDialog("SUB MENÚ\n1.NOT\n2.OR\n3.AND");

                        c = Integer.parseInt(C);
                    } while (c < 1 || c > 4);
                    switch (c) {
                        case 1: {
                            String X, Y;
                            int x, y;
                            X = JOptionPane.showInputDialog("Ingrese el Valor del dato Número 1: ");
                            x = Integer.parseInt(X);
                            Y = JOptionPane.showInputDialog("Ingrese el Valor del dato Número 2: ");
                            y = Integer.parseInt(Y);
                            condicional.SetNot(x, y);
                            break;
                        }
                        case 2: {
                            String X;
                            int x;
                            X = JOptionPane.showInputDialog("Ingrese el Valor del dato Número 1: ");
                            x = Integer.parseInt(X);
                            condicional.SetOr(x);
                            break;
                        }
                        case 3: {
                            String X;
                            int x;
                            X = JOptionPane.showInputDialog("Ingrese el Valor del dato Número 1: ");
                            x = Integer.parseInt(X);
                            condicional.Setand(x);
                            break;
                        }
                    }
                    r = JOptionPane.showInputDialog(null, "Ingrese 'V' para volver o 'S' para Salir").charAt(0);
                } while (r == 'V' || r == 'v');
                break;
            }
            case 3: {
                do {
                    do {
                        C = JOptionPane.showInputDialog("SUB MENÚ\n1.Igual\n2.Mayor\n3.Menor\n4.Maximo\n5.Minimo");

                        c = Integer.parseInt(C);
                    } while (c < 1 || c > 6);
                    switch (c) {
                        case 1: {
                            String X, Y;
                            int x, y;
                            X = JOptionPane.showInputDialog("Ingrese el Valor del dato Número 1: ");
                            x = Integer.parseInt(X);
                            Y = JOptionPane.showInputDialog("Ingrese el Valor del dato Número 2: ");
                            y = Integer.parseInt(Y);
                            condicional.SetIgual(x, y);
                            break;
                        }
                        case 2: {
                            String X, Y;
                            int x, y;
                            X = JOptionPane.showInputDialog("Ingrese el Valor del dato Número 1: ");
                            x = Integer.parseInt(X);
                            Y = JOptionPane.showInputDialog("Ingrese el Valor del dato Número 2: ");
                            y = Integer.parseInt(Y);
                            condicional.SetMayor(x, y);
                            break;
                        }
                        case 3: {
                            String X, Y;
                            int x, y;
                            X = JOptionPane.showInputDialog("Ingrese el Valor del dato Número 1: ");
                            x = Integer.parseInt(X);
                            Y = JOptionPane.showInputDialog("Ingrese el Valor del dato Número 2: ");
                            y = Integer.parseInt(Y);
                            condicional.SetMenor(x, y);

                            break;
                        }
                        case 4: {
                            String X, Y, Z;
                            int x, y, z;
                            X = JOptionPane.showInputDialog("Ingrese el Valor del dato Número 1: ");
                            x = Integer.parseInt(X);
                            Y = JOptionPane.showInputDialog("Ingrese el Valor del dato Número 2: ");
                            y = Integer.parseInt(Y);
                            Z = JOptionPane.showInputDialog("Ingrese el Valor del dato Número 3: ");
                            z = Integer.parseInt(Z);
                            condicional.SetMaximo(x, y, z);
                            break;
                        }
                        case 5: {
                            String X, Y, Z;
                            int x, y, z;
                            X = JOptionPane.showInputDialog("Ingrese el Valor del dato Número 1: ");
                            x = Integer.parseInt(X);
                            Y = JOptionPane.showInputDialog("Ingrese el Valor del dato Número 2: ");
                            y = Integer.parseInt(Y);
                            Z = JOptionPane.showInputDialog("Ingrese el Valor del dato Número 3: ");
                            z = Integer.parseInt(Z);
                            condicional.SetMinimo(x, y, z);
                            break;
                        }
                    }
                 r = JOptionPane.showInputDialog(null, "Ingrese 'V' para volver o 'S' para Salir").charAt(0);

                } while (r == 'V' || r == 'v');
                break;
 
            }
        }
           r = JOptionPane.showInputDialog(null, "Ingrese 'V' para volver o 'S' para Salir").charAt(0);
                } while (r == 'V' || r == 'v');

    }

}
