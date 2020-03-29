package entornos;

public class Usuario {
    private int idUsuario;
    private String UsuarioNombre;
    private String contrasenya;
    private String email;
    private String Oficio;

    public Usuario(){

    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getUsuarioNombre() {
        return UsuarioNombre;
    }

    public void setUsuarioNombre(String UsuarioNombre) {
        this.UsuarioNombre = UsuarioNombre;
    }

    public String getcontrasenya() {
        return contrasenya;
    }

    public void setcontrasenya(String contrasenya) {
        this.contrasenya = contrasenya;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getOficio() {
        return Oficio;
    }

    public void setOficio(String isAdmin) {
        this.Oficio = isAdmin;
    }
}

