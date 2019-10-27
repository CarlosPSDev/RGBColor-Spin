package view;

import java.awt.HeadlessException;
import javax.swing.*;
import controller.ColorContol;
import java.awt.*;

public class VentanaColor extends JFrame {
	private JPanel contenedor;	
	private JSpinner spnR;
	private JLabel lblIntro;
	private JLabel lblR;
	private JLabel lblA;
	private JSpinner spnA;
	private JButton btnEj;
	private JLabel lblRes;
	private JSpinner spnV;
	private ColorContol controlador;

	public VentanaColor(String titulo) throws HeadlessException  {
		super(titulo);
		inicializar();
	}

	private void inicializar() {
		try {
			UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
		} catch (Exception e) {			
			e.printStackTrace();
		}
		
		contenedor = new JPanel();	
		setPreferredSize(new Dimension(370, 360)); 		
		Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();		
		Dimension ventana = this.getPreferredSize();		
		setLocation((pantalla.width - ventana.width) / 2, (pantalla.height - ventana.height) / 2);		
		pack();		
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		
		setContentPane(contenedor);
		contenedor.setLayout(null);
		
		lblIntro = new JLabel("Seleccione la cantidad de cada color (0-250)");
		lblIntro.setBounds(53, 11, 258, 14);
		contenedor.add(lblIntro);
		
		spnR = new JSpinner();
		spnR.setBackground(Color.RED);
		spnR.setForeground(Color.RED);
		spnR.setModel(new SpinnerNumberModel(0, 0, 255, 1));
		spnR.setBounds(53, 46, 38, 36);
		contenedor.add(spnR);
		
		lblR = new JLabel("Rojo");
		lblR.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblR.setForeground(Color.RED);
		lblR.setBounds(53, 103, 38, 14);
		contenedor.add(lblR);
		
		spnV = new JSpinner();
		spnV.setModel(new SpinnerNumberModel(0, 0, 255, 1));
		spnV.setBounds(136, 46, 38, 36);
		contenedor.add(spnV);
		
		JLabel lblV = new JLabel("Verde");
		lblV.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblV.setForeground(new Color(0, 153, 0));
		lblV.setBounds(136, 103, 56, 14);
		contenedor.add(lblV);
		
		spnA = new JSpinner();
		spnA.setModel(new SpinnerNumberModel(0, 0, 255, 1));
		spnA.setBounds(222, 46, 38, 36);
		contenedor.add(spnA);
		
		lblA = new JLabel("Azul");
		lblA.setForeground(new Color(0, 0, 255));
		lblA.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblA.setBounds(232, 103, 44, 14);
		contenedor.add(lblA);
		
		btnEj = new JButton("Ejecutar");
		btnEj.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnEj.setForeground(Color.MAGENTA);
		btnEj.setBounds(120, 144, 89, 23);
		contenedor.add(btnEj);
		
		JLabel lblClR = new JLabel("Color Resultante");
		lblClR.setBounds(120, 276, 99, 14);
		contenedor.add(lblClR);
		
		lblRes = new JLabel("");
		lblRes.setOpaque(true);
		lblRes.setBounds(108, 203, 111, 45);
		contenedor.add(lblRes);
	}
	
	public Color obtenerDatos() {
		int rojo = (int)spnR.getValue();//o bien ((Integer) spnR.getValue()).intValue();
		int verde = (int)spnV.getValue();
		int azul = (int)spnA.getValue();
		
		Color c = new Color(rojo, verde, azul);
		
		return c;
	}
	
	public void mostrarColor(Color cl) {
		lblRes.setBackground(cl);
		
	}
	
	public void hacerVisible() {		
		setVisible(true);
		
	}

	public void setControlador(ColorContol controlador) {
		this.controlador = controlador;
		btnEj.addActionListener(controlador);
	}
	
}
