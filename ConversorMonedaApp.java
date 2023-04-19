package ConDivfin;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class ConversorMonedaApp {
    public static void main(String[] args) {
        
    	 List<Temperatura> conversores = new ArrayList<>();
         conversores.add(new Celsius());
         conversores.add(new Fahrenheit());

		
         try {	
        	 String[] opciones = {"Conversion de Moneda", "Conversion de Temperatura "};
        		int seleccion = (JOptionPane.showOptionDialog(null, "Tipo de conversion", "Menu de Conversion",
        			 JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,null, opciones, opciones[0]));
    	
        		if(seleccion == 0) {
        			
    				String inputCurrency = (JOptionPane.showInputDialog(null, "Selecciona la moneda de entrada:", "Conversor de Moneda",
    						JOptionPane.PLAIN_MESSAGE,null,new Object[] {"USD", "EUR", "JPY", "MXN", "COP"},"Selecciona")).toString();
            
    				String outputCurrency = (JOptionPane.showInputDialog(null, "Selecciona la moneda de salida:", "Conversor de Moneda",
    						JOptionPane.PLAIN_MESSAGE,null,new Object[] {"USD", "EUR", "JPY", "MXN", "COP"},"Selecciona")).toString();
            
    				double cantidad = Double.parseDouble(JOptionPane.showInputDialog(null, "Escribe la cantidad a convertir:"));

    				ConvertidorDeMoneda inputConverter = ConvertidorDeMonedaFac.getConverter(inputCurrency);
    				ConvertidorDeMoneda outputConverter= ConvertidorDeMonedaFac.getConverter(outputCurrency);

    				double convertedAmount = outputConverter.convert(inputConverter.convert(cantidad));

    				String result = String.format("%.2f %s = %.2f %s", cantidad, inputCurrency, convertedAmount, outputCurrency);
    				JOptionPane.showMessageDialog(null, result);
    			 
    				
        		}else if(seleccion == 1) {
    				
    					String input = JOptionPane.showInputDialog("Ingrese la temperatura en grados Celsius:");
    					double celsius = Double.parseDouble(input);

    					Celsius c = new Celsius();
    					double fahrenheit = c.convertir(celsius);

    					JOptionPane.showMessageDialog(null, celsius + " grados Celsius equivalen a " + fahrenheit + " grados Fahrenheit.");
    				
        		}
        		
    		} catch (Exception e) {
				 JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    	}
         

    }
}