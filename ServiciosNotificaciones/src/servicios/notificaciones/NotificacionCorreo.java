package servicios.notificaciones;

public class NotificacionCorreo  implements INotification{

    @Override
    public void notificar(Mensaje mensaje) {
        String mens = String.format("Enviando el mensaje  [%s] al buzon [%s] con asunto [%s] ",
        mensaje.mensaje,
        mensaje.buzon,
        mensaje.asunto);

        System.out.println(mens);
        //throw new UnsupportedOperationException("Unimplemented method 'notificar'");
    }

}
