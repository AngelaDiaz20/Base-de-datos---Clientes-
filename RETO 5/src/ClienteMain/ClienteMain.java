package ClienteMain;

import Modelo.*;
import Vista.*;
import Controlador.*;

/*@author Angela Díaz*/

public class ClienteMain {

    public static void main(String[] args) {
        Vista vistaDB = new Vista();
        VistaPrincipal vistappal= new VistaPrincipal();
        ClienteSql modeloDB = new ClienteSql();
        Cliente clie = new Cliente();
        new Controlador (vistaDB, vistappal, modeloDB, clie);        
        vistappal.setVisible(true);
        vistaDB.setVisible(false);
    }
}