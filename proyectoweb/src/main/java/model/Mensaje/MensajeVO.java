package model.Mensaje;

public class MensajeVO {
    private String idMensaje,cuerpoMens;

    public MensajeVO() {
    }

    public MensajeVO(String idMensaje, String cuerpoMens) {
        this.idMensaje = idMensaje;
        this.cuerpoMens = cuerpoMens;
    }

    public String getIdMensaje() {
        return idMensaje;
    }

    public void setIdMensaje(String idMensaje) {
        this.idMensaje = idMensaje;
    }

    public String getCuerpoMens() {
        return cuerpoMens;
    }

    public void setCuerpoMens(String cuerpoMens) {
        this.cuerpoMens = cuerpoMens;
    }

}