package model.Usuario;

public class UsuarioVO {
private String nombreUsu, claveUsu;
private int idUsuario, telefonoUsu;
private boolean estado;
public UsuarioVO() {
}
public UsuarioVO(String nombreUsu, String claveUsu, int idUsuario, int telefonoUsu, boolean estado) {
    this.nombreUsu = nombreUsu;
    this.claveUsu = claveUsu;
    this.idUsuario = idUsuario;
    this.telefonoUsu = telefonoUsu;
    this.estado = estado;
}
public String getNombreUsu() {
    return nombreUsu;
}
public void setNombreUsu(String nombreUsu) {
    this.nombreUsu = nombreUsu;
}
public String getClaveUsu() {
    return claveUsu;
}
public void setClaveUsu(String claveUsu) {
    this.claveUsu = claveUsu;
}
public int getIdUsuario() {
    return idUsuario;
}
public void setIdUsuario(int idUsuario) {
    this.idUsuario = idUsuario;
}
public int getTelefonoUsu() {
    return telefonoUsu;
}
public void setTelefonoUsu(int telefonoUsu) {
    this.telefonoUsu = telefonoUsu;
}
public boolean isEstado() {
    return estado;
}
public void setEstado(boolean estado) {
    this.estado = estado;
}

}