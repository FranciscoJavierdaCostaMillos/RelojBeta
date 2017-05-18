package alarma;

import java.time.LocalTime;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Crea una alarma un minuto despues de empezar el programa Ejemplo de menu que
 * no hace nada, solo salir del programa Dentro de la tarea se utiliza un
 * atributo de clase de tipo LocalTime
 *
 * @author damian
 */
public class Alarma {

    static public LocalTime alarm;

    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args) {
        Relojo r = new Relojo();
        r.setVisible(true);
    }
         /**
        // para usar en el menu
        Scanner input = new Scanner(System.in);
        // para usar en el while del menu
        Boolean quedarse = true;
        // defino el objeto que ejecutara la tarea
        Timer timer;
        timer = new Timer();
        // asigno el valor a la alarma, la hora actual mas un minuto
        alarm = LocalTime.now().plusMinutes(1);
        System.out.println("ALARMA " + alarm.getMinute() + ":" + alarm.getSecond());
        //defino la tarea con una clase anonima, que es una instancia de un solo uso
        TimerTask task = new TimerTask() {
            // tarea
            @Override
            public void run() {
                // si los minutos actuales son iguales a la alarma imprimo
                // TODO: comparar tambien la hora
                if (alarm.getMinute() == LocalTime.now().getMinute()) {
                    System.out.println("ALARMA!!!");
                    // si el tiempo actual es diferente que la alarma imprimo la hora
                } else {
                    String hora = LocalTime.now().getHour() + ":" + LocalTime.now().getMinute() + ":" + LocalTime.now().getSecond();
                    System.out.println(LocalTime.now().getHour() + ":" + LocalTime.now().getMinute() + ":" + LocalTime.now().getSecond());
                }
            }
        };
        // Empezamos dentro de 10ms y luego lanzamos la tarea cada 10000ms
        timer.schedule(task, 10, 10000);
        do {
            System.out.println("\n\nMenu");
            System.out.println("----------------");
            System.out.println("1 - Blabla");
            System.out.println("2 - Blobloblo");
            System.out.println("3 - Exit?");
            System.out.println("Option:");
            int option = Integer.parseInt(input.next());
            switch (option) {
                case 1:  // do something
                    break;
                case 2:  // do something
                    break;
                case 3:
                    quedarse = false;
            }
        } while (quedarse); // Display the menu until the user closes the 
        // para todas las tareas del timer
        timer.cancel();
    }
    * **/
}
