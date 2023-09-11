package Entidades;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidator {

	public boolean validacion(String password) {
		
		if(password.length()>=8) {
			boolean mayuscula = false;
            boolean numero = false;
            boolean caractEspeciales = false;
            boolean letras = false;
            boolean espacioVacio = true;
			
            Pattern special = Pattern.compile("[?!¡@¿.,´)]");
            Matcher hasSpecial = special.matcher(password);
            Pattern vacio = Pattern.compile(" ");
            Matcher hasVacio = vacio.matcher(password);
            
            for(int i=0;i<password.length();i++) {
            	if(Character.isDigit(password.charAt(i))) 
            		numero=true;
            	if(Character.isUpperCase(password.charAt(i)))
            		mayuscula=true;
            	if(Character.isLetter(password.charAt(i)))
            		letras=true;
            	if(hasSpecial.find())
            		caractEspeciales=true;
            	if(hasVacio.find())
            		espacioVacio=false;
            }
            return numero==true && mayuscula==true && letras==true && caractEspeciales==true && espacioVacio==true;
		}else {
			return false;
		}
	}
}
