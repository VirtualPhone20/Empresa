package entornos;

public class Comentario {
	 private int idComentario;
	    private int idLibro;
	    private int idUsuario;
	    private String UsuarioNombre;
	    private String Texto;

	    public int getIdComentario() {
	        return idComentario;
	    }

	    public void setIdComentario(int idComentario) {
	        this.idComentario = idComentario;
	    }

	    public int getIdLibro() {
	        return idLibro;
	    }

	    public void setIdLibro(int idLibro) {
	        this.idLibro = idLibro;
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

	    public String getTexto() {
	        return Texto;
	    }

	    public void setTexto(String Texto) {
	        this.Texto = Texto;
	    }
}
