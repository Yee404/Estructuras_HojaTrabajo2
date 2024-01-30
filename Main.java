/* se usa para implementar el menu aparte de mandar a llamar a la calculadora para que se puedan hacer los calculos  */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    
    // Calculadora<Integer> stackInterno = new ICalculadora()<Integer>(0);// 
    /*  jajaja se deberia de agregar 
    pero no se como jajajja  */

    public static void main(String[] args){

        String archivo = "Estructuras_HojaTrabajo2/DATOS.txt";
        String linea = null;

        try {
            FileReader fileReader = new FileReader(archivo);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while ((linea = bufferedReader.readLine()) != null) {
                System.out.println(linea);
            }

            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("Error al leer el archivo '" + archivo + "'");
        }
    }
       
}


