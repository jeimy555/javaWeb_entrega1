package model.Estado;

public class EstadoVO {
    private String idEstado,mensajeEst;

    public EstadoVO() {
    }

    public EstadoVO(String idEstado, String mensajeEst) {
        this.idEstado = idEstado;
        this.mensajeEst = mensajeEst;
    }

    public String getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(String idEstado) {
        this.idEstado = idEstado;
    }

    public String getMensajeEst() {
        return mensajeEst;
    }

    public void setMensajeEst(String mensajeEst) {
        this.mensajeEst = mensajeEst;
    }

    
}
