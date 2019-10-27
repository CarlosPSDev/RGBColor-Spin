package controller;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.VentanaColor;

public class ColorContol implements ActionListener{
	private VentanaColor vc;
	

	public ColorContol(VentanaColor vc) {
		this.vc = vc;
	}


	@Override
	public void actionPerformed(ActionEvent ev) {
		
		Color ventC = vc.obtenerDatos();//retornas el dato del ese método y se lo pasas al de mostrar resultado con el color
		
		vc.mostrarColor(ventC);
		
				
	}
	
	

}
