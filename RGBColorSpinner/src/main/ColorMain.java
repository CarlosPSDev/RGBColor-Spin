package main;

import java.awt.EventQueue;

import controller.ColorContol;
import view.VentanaColor;

public class ColorMain {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				VentanaColor vc = new VentanaColor("Configuración de colores");				
				ColorContol ctrl = new ColorContol(vc);
				
				vc.setControlador(ctrl);
				vc.hacerVisible();
				
			}
		});

	}

}
