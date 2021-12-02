package empresaAgroalimentaria;



public class Cliente {
    private String nombre;
    private String apellido;
    private String mail;
    private int tel;
    private String dire;

    public Cliente(String nombre, String apellido, String mail, int tel, String dire) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.mail = mail;
        this.tel = tel;
        this.dire = dire;
    }
    public Cliente() {
        this.nombre = "";
        this.apellido = "";
        this.mail = "";
        this.tel = 0;
        this.dire = "";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    public String getDire() {
        return dire;
    }

    public void setDire(String dire) {
        this.dire = dire;
    }
    
    public void imprimirCliente(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Apellido: "+apellido);
        System.out.println("mail: "+mail);
        System.out.println("Telefono: "+tel);
        System.out.println("Direccion: "+dire);
    }
}
