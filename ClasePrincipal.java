package PrimerPaquete;

public class ClasePrincipal {

	public static void main(String[] args) {
	
		//System.out.println("Hola Mundo...");
		//System.out.println("Estoy aprendiendo Java");
		int num1=0, num2=10, num3=45, suma=0, resta=0;
		double division=0, num4=21.53, multiplicacion=0 ;
		
		suma = num2 + num3;
		resta = num3 - num1;
		multiplicacion=num4*3;
		division = num4/4; 
		System.out.println("La suma es: "+suma);
		System.out.println("La resta es: "+resta);
		System.out.println("El producto es: "+multiplicacion);
		System.out.println("El cociente entre "  +num4 +" y 3 es: "+division);
		
		/*System.out.println("La suma es: "+suma+"- La resta es: "+resta+"La multi. es:"
				+multiplicacion + "El cociente es: "+division);*/
		
		//IF - ELSE   FOR   WHILE
		/*int edadPersona = 67;
		if (edadPersona >= 18) {
			System.out.println("La persona es mayor de edad... ");
			if (edadPersona > 65) {
				System.out.println(" y además es de la 3 edad.");
			}
			
		}else {
			System.out.println("La persona es menor de edad..");
		}*/
		//i++  = i=i+1 = i+=1
		int numeroInicio = 5, numeroFinal = 14;
		for(int i=numeroFinal; i>=numeroInicio;i--) {
			System.out.println(i);			
		}

				
		/*int varA=5, varB=14;
		boolean imprimirPares = false;
		
		while(varA <= varB) {
			if (imprimirPares == true) {
				if (varA%2 == 0) {
					System.out.print("- "+varA);
				}//cierre del if
			}else{
				if (varA%2 != 0) {
					System.out.print("- "+varA);
				}//cierre del if
							
			}
								
			varA=varA+1;
		}//cierre del while*/
		

	}//cierre del main

}//cierre de laclase p
