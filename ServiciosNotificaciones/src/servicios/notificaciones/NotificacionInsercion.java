package servicios.notificaciones;

public class NotificacionInsercion implements INotification{

    @Override
    public void notificar(Mensaje mensaje) {
        String mens = String.format("Insertando mensaje [%s] al usuario [%s] ",
        mensaje.mensaje, 
        mensaje.usuario);
        System.out.println(mens);
        //throw new UnsupportedOperationException("Unimplemented method 'notificar'");
    }

}
