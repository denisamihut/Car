package oct27;

import javax.swing.*;
import java.awt.*;

public class Main {
	    public static void main(String[] args) {
	        Car car = new Car();
	        car.brand = "Audi";
	        car.HorsePower = 120;
	        car.volum = 300.34;

	        component frame = null;
//	        JOptionPane.showMessageDialog(frame, car.getBrand());
//	        JOptionPane.showMessageDialog(frame, car.getHorsePower());
//	        JOptionPane.showMessageDialog(frame, car.getVolum());

	        String newBrand = JOptionPane.showInputDialog("Dati noua valoare brand: ");
	        System.out.println(newBrand);
	        car.setBrand(newBrand);
	        JOptionPane.showMessageDialog(frame, car.getBrand());
	        
	        String newHp = JOptionPane.showInputDialog("Dati noua valoare a cailor putere: ");
	        System.out.println(newHorsePower);
	        car.setHorsePower(newHorsePower);
	        JOptionPane.showMessageDialog(frame, car.getHorsePower());
	        
	        String newVolum = JOptionPane.showInputDialog("Dati noua valoare a volumului: ");
	        System.out.println(newVolum);
	        car.setVolum(newVolum);
	        JOptionPane.showMessageDialog(frame, car.getVolum());


	    }
	}
