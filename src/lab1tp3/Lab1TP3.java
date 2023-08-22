/*
 * ENUNCIADO:
 *
 * Crea una aplicación GUI en Java que simule un formulario de login. La
 * interfaz debe contener los siguientes elementos:
 *
 *  - Un campo de texto (JTextField) para que el usuario pueda ingresar su mail.
 *  - Un campo de texto (JTextField) para que el usuario pueda ingresar su
 *  password.
 *  - Un botón (JButton) con el texto "Registrar".
 * 
 * Cuando el usuario haga clic en el botón "Registrar", la aplicación debe
 * mostrar un diálogo emergente (JOptionPane) con un mensaje de bienvenida si el
 * mail es igual a alumno@ulp.edu.ar y el password es igual a “12345678”, caso
 * contrario el mensaje debe decir “Usuario y/o contraseña incorrectos” .
 *
 * Recuerda que debes utilizar la biblioteca de componentes gráficos de Java
 * (Swing) para crear la interfaz y gestionar los eventos del botón.
 */

package lab1tp3;

/**
 *
 * @author Leonel
 */
public class Lab1TP3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LoginView.ejecutar();
    }

}
