package ClasesBD;

public class Empleado {
    private String rfc, nombre, ap_paterno,ap_materno,
                    domicilio,fecha_nac, fecha_cont;
    private int telefono;

    public Empleado() {
    }

    public Empleado(String rfc1, String nombre1, String ap_paterno1,
                    String ap_materno1, String domicilio1, String fecha_nac1,
                    String fecha_cont1, int telefono1){
        rfc=rfc1;
        nombre=nombre1;
        ap_paterno=ap_paterno1;
        ap_materno=ap_materno1;
        domicilio=domicilio1;
        fecha_nac=fecha_nac1;
        fecha_cont=fecha_cont1;
        telefono=telefono1;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAp_paterno() {
        return ap_paterno;
    }

    public void setAp_paterno(String ap_paterno) {
        this.ap_paterno = ap_paterno;
    }

    public String getAp_materno() {
        return ap_materno;
    }

    public void setAp_materno(String ap_materno) {
        this.ap_materno = ap_materno;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getFecha_nac() {
        return fecha_nac;
    }

    public void setFecha_nac(String fecha_nac) {
        this.fecha_nac = fecha_nac;
    }

    public String getFecha_cont() {
        return fecha_cont;
    }

    public void setFecha_cont(String fecha_cont) {
        this.fecha_cont = fecha_cont;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
}
