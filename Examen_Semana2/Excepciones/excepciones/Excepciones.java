package excepciones;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Excepciones {

    public static void main(String[] args) {
        int y = 0;
        String x="";
        try ( Scanner entrada = new Scanner(System.in)) {
            System.out.println("Ingresa un valor");
             x = entrada.nextLine();
             if(x.equals("julio"))
                 x=null;
        }
        try{
        checar(x);
        }catch(EjemploException e){
            e.printStackTrace(System.out);
        }
        int[] num = {1,3};
        try {
            y = Integer.parseInt(x);
            num [y]= 2;
            System.out.println("num = " + num[y]);
        } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
            e.printStackTrace(System.out);
        }
        File archivo = new File("/examen2.txt");
        leerArchivo(archivo);
    }
    public static void checar(String x) {
        if(x == null){
            throw new EjemploException("No puede ser tipo null");
        }
    }
    
    private static void leerArchivo(File file) {
		try {
			FileReader fr = new FileReader(file);
		} catch (FileNotFoundException e) {
			//e.printStackTrace();
			System.out.println("No se encontro Archivo");
		}
	}
}
