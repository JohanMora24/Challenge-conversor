import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class CoversorMonedaYmedidas {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        
        Object[] opcion = {"Convertir Monedas", "Convertir Medidas", "Salir"};
        int elije = JOptionPane.showOptionDialog(null, "¿Qué desea convertir?", "Conversor", 
        		JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null,
        		
        opcion, opcion[0]);

        if (elije == 2){
            JOptionPane.showMessageDialog(null, "Programa cerrado");
            System.exit(0);
        }
        if(elije == 0){
            DecimalFormat formatearDivisas = new DecimalFormat("#.##");
            boolean continuarPrograma = true;
            while(continuarPrograma){
            	
                String [] opciones = {"De Pesos Col a Dolares", "De Pesos Col a Euros", "De Peso Col a Peso MX", "De Peso Col a Yuan",
               "De Dolar a Peso Col", "De Euro a Peso Col", "De Peso MX a Peso Col", "De Yuan a Peso Col"};
                
                String  cambio = (String) JOptionPane.showInputDialog(null,"Elije a la moneda que deseas convertir: ", 
                		"Conversor de moneda", JOptionPane.QUESTION_MESSAGE,
                		
                null, opciones,opciones[0]);
                String input = JOptionPane.showInputDialog(null, "Ingrese valor que desea convertir: ");
                double pesos = 0.00;
                try{
                    pesos = Double.parseDouble(input);
                }catch(NumberFormatException e){
                    JOptionPane.showMessageDialog(null, "Valor no valido");
                }

                if(cambio.equals("De Pesos Col a Dolares")){
                    double dolares = pesos / 4644.2;
                    JOptionPane.showMessageDialog(null, "Tiene: " + formatearDivisas.format(dolares) + "Dolares");
                } else if(cambio.equals("De Pesos Col a Euros")){
                    double euro = pesos / 5048.59;
                    JOptionPane.showMessageDialog(null, "Tiene: " + formatearDivisas.format(euro) + "Euros");
                } else if(cambio.equals("De Peso Col a Peso MX")){
                    double PesoMX = pesos / 257.77;
                    JOptionPane.showMessageDialog(null, "Tiene: " + formatearDivisas.format(PesoMX) + "Pesos MX");
                } else if(cambio.equals("De Peso Col a Yuan")){
                    double yuan = pesos / 676.13;
                    JOptionPane.showMessageDialog(null, "Tiene: " + formatearDivisas.format(yuan) + "Yuan");
                }else if(cambio.equals("De Dolar a Peso Col")){
                    double dolares = 4644.2 * pesos;
                    JOptionPane.showMessageDialog(null, "Tiene: " + formatearDivisas.format(dolares) + "Pesos");
                }else if(cambio.equals("De Euro a Peso Col")){
                    double euro = 5048.59 * pesos;
                    JOptionPane.showMessageDialog(null, "Tiene: " + formatearDivisas.format(euro) + "Pesos");
                }else if(cambio.equals("Peso MX a Peso Col")){
                    double libras = 257.77 * pesos;
                    JOptionPane.showMessageDialog(null, "Tiene: " + formatearDivisas.format(libras) + "Pesos");
                }else if(cambio.equals("De Yuan a Peso Col")){
                    double yuan = 676.13 * pesos;
                    JOptionPane.showMessageDialog(null, "Tiene: " + formatearDivisas.format(yuan) + "Pesos");
                }

                int confirma = JOptionPane.showConfirmDialog(null, "Desea seguir usando el programa", "Confirmar",
                JOptionPane.YES_NO_CANCEL_OPTION);
                    if(confirma == JOptionPane.NO_OPTION || confirma == JOptionPane.CANCEL_OPTION){
                        continuarPrograma = false;
                        JOptionPane.showMessageDialog(null, "Programa finalizado");
                    }
                
            }
        }
        if(elije == 1){
            boolean seguirPrograma = true;
            while(seguirPrograma){
                String[] opciones = {"Centimetros a Pulgadas", "Pulgadas a Centimetros"};
                int medi = JOptionPane.showOptionDialog(null, "Elija una opcion: ", "Conversor de Medidas", 
                        JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opciones, opciones[0]);
                
              

                String valorNominal = JOptionPane.showInputDialog(null, "Ingrese la medida a convertir");
                double valor = 0.0;
                try{
                    valor = Double.parseDouble(valorNominal);
                } catch(NumberFormatException e){
                    JOptionPane.showMessageDialog(null, "Valor no valido");
                    System.exit(0);
                }
                double resultado = 0;
                if(medi == 0){
                    resultado = (valor / 2.54);
                    JOptionPane.showMessageDialog(null, valor + " Centimetros son : " + resultado + " Pulgadas");
                } else if(medi == 1){
                    resultado = (valor * 2.54);
                    JOptionPane.showMessageDialog(null, valor +" Pulgadas son: " + resultado + " Centimetros");
                }
                int continuar = JOptionPane.showConfirmDialog(null, "Desea seguir usando el programa", "", JOptionPane.YES_NO_OPTION);
                if(continuar == JOptionPane.NO_OPTION){
                    seguirPrograma = false;
                    JOptionPane.showMessageDialog(null, "Programa finalizado");
                }
            }
        }
    }
}