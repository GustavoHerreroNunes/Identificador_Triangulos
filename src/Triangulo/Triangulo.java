package Triangulo;

import javax.swing.JOptionPane;

public class Triangulo {

	public static void main(String[] args) {
		float a =0, b =0, c =0;
		
		a = Float.parseFloat(JOptionPane.showInputDialog(null, "Insira o 1� valor", "Triangulo", 3));
		b = Float.parseFloat(JOptionPane.showInputDialog(null, "Insira o 2� valor", "Triangulo", 3));
		c = Float.parseFloat(JOptionPane.showInputDialog(null, "Insira o 3� valor", "Triangulo", 3));
		
		if(a <(b+c) && b <(a+c) && c<(b+a)) {
			if(a==b && b==c) {
				JOptionPane.showMessageDialog(null, "Triangulo Equil�tero", "Triangulo", 1);
			}else if(a==b||a==c||b==c) {
				JOptionPane.showMessageDialog(null,  "Tri�ngulo Is�celes", "Triangulo", 1);
			}else {
				JOptionPane.showMessageDialog(null, "Tri�ngulo Esc�leno", "Triangulo", 1);
			}
		}else {
			JOptionPane.showMessageDialog(null, "Os valores inseridos n�o correspondem � um tri�ngulo", "Triangulo", 2);
		}

	}

}
