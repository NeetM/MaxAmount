
package com.mycompany.marlonmedina4dpv;

import javax.swing.JOptionPane;

public class Menu {
    public static void main(String[] args) {
        
        Afiliado arrayAfiliados[] = new Afiliado[3];
        String comparadorRut;
        int opcCambio;
        
        do {
            
            int op = Integer.parseInt(JOptionPane.showInputDialog("1.INGRESAR AFILIADOS\n2.BUSCAR AFILIADO POR RUT\n3.BUSCAR MAYOR MONTO\n4.MODIFICAR AFILIADOS\n5.SALIR"));
            
            switch(op){
                
                case 1:
                    
                    for (int i = 0; i < 3; i++) {
                        
                        String r = JOptionPane.showInputDialog("INGRESE RUT");
                        double m = Double.parseDouble(JOptionPane.showInputDialog("INGRESE MONTO"));
                        arrayAfiliados[i] = new Afiliado(r, m);
                        
                    }
                    
                    break;
                    
                case 2:
                    
                    String buscar = JOptionPane.showInputDialog("INGRESE RUT A BUSCAR");
                    
                    for (int i = 0; i < 3; i++) {
                        
                        if (buscar.equals(arrayAfiliados[i].getRut())) {
                            arrayAfiliados[i].mostrar();
                            
                        }
                        
                    }
                    
                    break;
                    
                case 3: 
                    
                    double may = arrayAfiliados[0].getMonto(); 
                    String rutMay= arrayAfiliados[0].getRut() ;

                    
                    for (int i = 0; i < 2; i++) {
                        
                        if (may < arrayAfiliados[i + 1].getMonto() ) {
                            
                            may = arrayAfiliados[i+1].getMonto();
                            rutMay = arrayAfiliados[i+1].getRut();
                            
                        }
                        
                    }
                    
                JOptionPane.showMessageDialog(null,"Rut: " + rutMay + "\nMAYOR MONTO: " + may);


                break;
                
                case 4: 
                        
                
                    comparadorRut = JOptionPane.showInputDialog("Ingrese rut de Afiliado");
                    
                    for (int i = 0; i < 3; i++) {
                        
                        if (comparadorRut.equals(arrayAfiliados[i].getRut())) {
                            
                            
                            do {
                            
                            opcCambio = Integer.parseInt(JOptionPane.showInputDialog("1.Rut\n2.Monto\n3.Salir"));

                            switch (opcCambio) {
                               
                                case 1:
                                    
                                    String newRut = JOptionPane.showInputDialog("Ingrese nuevo rut de Afiliado");
                                    arrayAfiliados[i].setRut(newRut);
                                    
                                    break;
                                
                                case 2:
                                    
                                    double newMonto = Double.parseDouble(JOptionPane.showInputDialog("Ingrese nuevo monto de Afiliado"));
                                    arrayAfiliados[i].setMonto(newMonto);

                                    
                                    break;
                                    
                                    
                                case 3:
                                    
                                    break;
                                    
                                    
                                default:
                                   JOptionPane.showMessageDialog(null, "NO EXISTE ESA OPCION");
;
                            }
                            
                            } while (opcCambio != 3);
                           
                        }
                        
                    }
                
                    
                    
                    
                break;
                
                
                
                case 5:
                    
                    JOptionPane.showMessageDialog(null, "PROGRAMA FINALIZADO");
                    System.exit(0);
                    
                    break;
                
                default:
                    
                    JOptionPane.showMessageDialog(null, "NO EXISTE ESA OPCION");
                        
            }
            
 
            
            
        } while (true);
        
    }
}
