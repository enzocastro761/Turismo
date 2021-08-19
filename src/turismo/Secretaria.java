package turismo;

public class Secretaria {
	
	public static Usuario[] leerUsuarios(){
		Usuario[] usuarios = new Usuario[10];
		//aca lee usuarios.txt

	    return usuarios;
	}

	public static Atracciones[] leerAtracciones() {
		Atracciones[] atracciones = new Atracciones[10];
		//aca lee atracciones.txt
		return atracciones;
	}
	
	public static void main(){
	   Usuario[] misUsuarios = leerUsuarios();
	   Atracciones[] misAtracciones = leerAtracciones();
	}

}
