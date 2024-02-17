package servicios.notificaciones;

public class NotificacionSMS implements INotification{

    @Override
    public void notificar(Mensaje mensaje) {
        String mens = String.format("Enviando mensaje mensaje [%s] al numero [%s] ",
        mensaje.mensaje, 
        mensaje.numeroMovil);
        System.out.println(mens);
        //throw new UnsupportedOperationException("Unimplemented method 'notificar'");
    }

    
    


}
