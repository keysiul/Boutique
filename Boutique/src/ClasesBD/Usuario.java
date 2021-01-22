package ClasesBD;

public class Usuario {
    private String id_usuario, usuario_user, puesto_user, contrasena_user, estado_user, rfc;

    public Usuario() {
    }

    public Usuario(String id_usuario, String usuario_user, String puesto_user, String contrasena_user, String estado_user, String rfc) {
        this.id_usuario = id_usuario;
        this.usuario_user = usuario_user;
        this.puesto_user = puesto_user;
        this.contrasena_user = contrasena_user;
        this.estado_user = estado_user;
        this.rfc = rfc;
    }

    public String getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(String id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getUsuario_user() {
        return usuario_user;
    }

    public void setUsuario_user(String usuario_user) {
        this.usuario_user = usuario_user;
    }

    public String getPuesto_user() {
        return puesto_user;
    }

    public void setPuesto_user(String puesto_user) {
        this.puesto_user = puesto_user;
    }

    public String getContrasena_user() {
        return contrasena_user;
    }

    public void setContrasena_user(String contrasena_user) {
        this.contrasena_user = contrasena_user;
    }

    public String getEstado_user() {
        return estado_user;
    }

    public void setEstado_user(String estado_user) {
        this.estado_user = estado_user;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }
}
