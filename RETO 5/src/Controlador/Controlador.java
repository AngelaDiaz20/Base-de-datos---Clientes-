package Controlador;

/* @author Angela DIaz */

import Modelo.*; 
import Vista.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;

public class Controlador implements ActionListener {
    private Vista vistaCliente = new Vista();
    private VistaPrincipal vistaprincipal = new VistaPrincipal();
    private ClienteSql clienteSql = new ClienteSql();
    private Cliente cliente = new Cliente();
    
    public Controlador(Vista vistaCliente, VistaPrincipal vistaprincipal, ClienteSql clienteSql, Cliente cliente) {
        this.cliente = cliente;
        this.vistaCliente = vistaCliente;
        this.clienteSql = clienteSql;
        this.vistaprincipal = vistaprincipal;
        
        //activa Action Listener
        this.vistaCliente.btonRegistrar.addActionListener(this);
        this.vistaCliente.btonActualizar.addActionListener(this);
        this.vistaCliente.btonConsultar.addActionListener(this);
        this.vistaCliente.btonEliminar.addActionListener(this);
        this.vistaCliente.btonCargarDatos.addActionListener(this);
        this.vistaprincipal.btonCliente.addActionListener(this);
    }
     
    public void Listar(JTable TableDB) {
        DefaultTableModel modelo = new DefaultTableModel();
        TableDB.setModel(modelo);
        modelo.addColumn("ID");
        modelo.addColumn("PRIMER NOMBRE");
        modelo.addColumn("SEGUNDO NOMBRE");
        modelo.addColumn("PRIMER APELLIDO");
        modelo.addColumn("SEGUNDO APELLIDO");
        modelo.addColumn("NACIONALIDAD");
        modelo.addColumn("CORREO");
        Object[] columna = new Object[8];
        int Registro = clienteSql.Consulta().size();
        for (int i = 0; i < Registro; i++) {
            columna[0] = clienteSql.Consulta().get(i).getCli_id();
            columna[1] = clienteSql.Consulta().get(i).getCli_nombre1();
            columna[2] = clienteSql.Consulta().get(i).getCli_nombre2();
            columna[3] = clienteSql.Consulta().get(i).getCli_apellido1();
            columna[4] = clienteSql.Consulta().get(i).getCli_apellido2();
            columna[5] = clienteSql.Consulta().get(i).getCli_nacionalidad();
            columna[6] = clienteSql.Consulta().get(i).getCli_correo();
            
            modelo.addRow(columna);
        }
    }
          
    public void Limpiar() {
        vistaCliente.jTextFieldnombre1.setText(null);
        vistaCliente.jTextFieldnombre2.setText(null);
        vistaCliente.jTextFieldapellido1.setText(null);
        vistaCliente.jTextFieldapellido2.setText(null);
        vistaCliente.jTextFieldnacionalidad.setText(null);
        vistaCliente.jTextFieldcorreo.setText(null);       
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vistaprincipal.btonCliente){
            vistaCliente.setVisible(true);
            vistaprincipal.setVisible(false); 
        }
        
        //Registro de un nuevo cliente
        if (e.getSource() == vistaCliente.btonRegistrar) {
            cliente.setCli_nombre1(vistaCliente.jTextFieldnombre1.getText());
            cliente.setCli_nombre2(vistaCliente.jTextFieldnombre2.getText());
            cliente.setCli_apellido1(vistaCliente.jTextFieldapellido1.getText());
            cliente.setCli_apellido2(vistaCliente.jTextFieldapellido2.getText());
            cliente.setCli_nacionalidad(vistaCliente.jTextFieldnacionalidad.getText());
            cliente.setCli_correo(vistaCliente.jTextFieldcorreo.getText());
            boolean registro =clienteSql.Insertar(cliente);
            if (registro == true) {
                JOptionPane.showMessageDialog(null, "REGISTRO EXITOSO");
                Listar(vistaCliente.jTableClientes);
                Limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "ERROR DE REGISTRO");
            }
        }
        
        //Para listar en la tabla
        if (e.getSource() == vistaCliente.btonConsultar) {
            Listar(vistaCliente.jTableClientes);
        }
        
        //Eliminar un registro
        if (e.getSource() == vistaCliente.btonEliminar) {
            int filaEliminar = vistaCliente.jTableClientes.getSelectedRow();
            if (filaEliminar > 0) {
                int ID = (int) vistaCliente.jTableClientes.getValueAt(filaEliminar, 0);
                cliente.setCli_id(ID);
                //Si rptUsuario es No=1, rptUsuario es Si=0,rptUsuario es Cancelar=3
                int rptUsuario = JOptionPane.showConfirmDialog(null, "¿Seguro que desea eliminar registro?");
                if (rptUsuario == 0) {
                    clienteSql.Eliminar(cliente);
                    JOptionPane.showMessageDialog(null, "Registro eliminado");

                } else {
                    JOptionPane.showMessageDialog(null, "Error al Eliminar");
                }
                Listar(vistaCliente.jTableClientes);
            } else {
                JOptionPane.showMessageDialog(null, "Seleccione una fila para poder eliminar");
            }
        }
        
        //Cargar datos de registro
        if (e.getSource() == vistaCliente.btonCargarDatos) {
            int fila =vistaCliente.jTableClientes.getSelectedRow();
            if (fila > 0) {
                int id = (int)vistaCliente.jTableClientes.getValueAt(fila, 0);
                cliente.setCli_id(id);
                vistaCliente.jTextFieldnombre1.setText(vistaCliente.jTableClientes.getValueAt(fila, 1).toString());
                vistaCliente.jTextFieldnombre2.setText(vistaCliente.jTableClientes.getValueAt(fila, 2).toString());
                vistaCliente.jTextFieldapellido1.setText(vistaCliente.jTableClientes.getValueAt(fila, 3).toString());
                vistaCliente.jTextFieldapellido2.setText(vistaCliente.jTableClientes.getValueAt(fila, 4).toString());
                vistaCliente.jTextFieldnacionalidad.setText(vistaCliente.jTableClientes.getValueAt(fila, 5).toString());
                vistaCliente.jTextFieldcorreo.setText(vistaCliente.jTableClientes.getValueAt(fila, 6).toString());
            }
        }
        
        //Actualizar datos del cliente en la tabla
        if (e.getSource() == vistaCliente.btonActualizar) {
            cliente.setCli_nombre1(vistaCliente.jTextFieldnombre1.getText());
            cliente.setCli_nombre2(vistaCliente.jTextFieldnombre2.getText());
            cliente.setCli_apellido1(vistaCliente.jTextFieldapellido1.getText());
            cliente.setCli_apellido2(vistaCliente.jTextFieldapellido2.getText());
            cliente.setCli_nacionalidad(vistaCliente.jTextFieldnacionalidad.getText());
            cliente.setCli_correo(vistaCliente.jTextFieldcorreo.getText());
            
            boolean registro = clienteSql.Editar(cliente);
            if (registro == true) {
                JOptionPane.showMessageDialog(null, "REGISTRO MODIFICADO");
                Listar(vistaCliente.jTableClientes);
                Limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "ERROR AL MODIFICAR EL REGISTRO");
            }
        }  
    }
}
