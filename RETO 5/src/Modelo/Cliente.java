package Modelo;

/* @author Angela DIaz */

public class Cliente {
    public int cli_id;
    public String cli_nombre1;
    public String cli_nombre2;
    public String cli_apellido1;
    public String cli_apellido2;
    public String cli_nacionalidad;
    public String cli_correo;

    public int getCli_id() {
        return cli_id;
    }
    
    public void setCli_id(int cli_id) {
        this.cli_id = cli_id;
    }

    public String getCli_nombre1() {
        return cli_nombre1;
    }
    
     public void setCli_nombre1(String cli_nombre1) {
        this.cli_nombre1 = cli_nombre1;
    }
     
    public String getCli_nombre2() {
        return cli_nombre2;
    }
    
    public void setCli_nombre2(String cli_nombre2) {
        this.cli_nombre2 = cli_nombre2;
    }

    public String getCli_apellido1() {
        return cli_apellido1;
    }
    
    public void setCli_apellido1(String cli_apellido1) {
        this.cli_apellido1 = cli_apellido1;
    }

    public String getCli_apellido2() {
        return cli_apellido2;
    }
    
    public void setCli_apellido2(String cli_apellido2) {
        this.cli_apellido2 = cli_apellido2;
    }

    public String getCli_nacionalidad() {
        return cli_nacionalidad;
    }

    public void setCli_nacionalidad(String cli_nacionalidad) {
        this.cli_nacionalidad = cli_nacionalidad;
    }

    public String getCli_correo() {
        return cli_correo;
    }

    public void setCli_correo(String cli_correo) {
        this.cli_correo = cli_correo;
    }
    
    public String resumen(){
    return cli_id + " " + cli_nombre1 + " " + cli_nombre2 + " " + cli_apellido1 + " " + cli_apellido2 + " " + cli_nacionalidad + " " + cli_correo; 
    
    }
}


