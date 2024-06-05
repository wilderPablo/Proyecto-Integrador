/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.dto.*;
import servicios.ConexionDB;

/**
 *
 * @author ander
 */
public class ProductosDAO {

    Connection conexion;
    ConexionDB cdb = new ConexionDB();
    PreparedStatement ps;
    ResultSet rs;

    public List listarPLM() {
        List<PlacasMadreDTO> plm = new ArrayList<>();
        String SQL = "SELECT * FROM placamadre";

        try {
            conexion = cdb.obtenerConexion();
            ps = conexion.prepareStatement(SQL);
            rs = ps.executeQuery();
            while (rs.next()) {
                PlacasMadreDTO ai = new PlacasMadreDTO();
                ai.setIdProducto(rs.getInt(1));
                ai.setMarca(rs.getString(2));
                ai.setChipset(rs.getString(3));
                ai.setSocket(rs.getString(4));
                ai.setProcesadoresCompatibles(rs.getString(5));
                ai.setTipoDeMemoria(rs.getString(6));
                ai.setRanurasDeMemoriaRAM(rs.getInt(7));
                ai.setNombre(rs.getString(8));
                ai.setPrecio(rs.getDouble(9));
                ai.setImagen(rs.getString(10));
                plm.add(ai);
            }
        } catch (SQLException e) {
        }
        return plm;
    }

    public List listarMRAM() {
        List<MemoriaramDTO> mram = new ArrayList<>();
        String SQL = "SELECT * FROM memoriaram";
        try {
            conexion = cdb.obtenerConexion();
            ps = conexion.prepareStatement(SQL);
            rs = ps.executeQuery();
            while (rs.next()) {
                MemoriaramDTO ai = new MemoriaramDTO();
                ai.setIdProducto(rs.getInt(1));
                ai.setMarca(rs.getString(2));
                ai.setNumeroModelo(rs.getString(3));
                ai.setCapacidad(rs.getInt(4));
                ai.setFrecuencia(rs.getInt(5));
                ai.setTipoMemoria(rs.getString(6));
                ai.setFactorForma(rs.getString(7));
                ai.setNombre(rs.getString(8));
                ai.setPrecio(rs.getDouble(9));
                ai.setImagen(rs.getString(10));
                mram.add(ai);
            }
        } catch (Exception e) {
        }
        return mram;
    }
    
    public List listarProsc() {
        List<ProcesadorDTO> prosc = new ArrayList<>();
        String SQL = "SELECT * FROM procesador";
        try {
            conexion = cdb.obtenerConexion();
            ps = conexion.prepareStatement(SQL);
            rs = ps.executeQuery();
            while (rs.next()) {
                ProcesadorDTO ai = new ProcesadorDTO();
                ai.setIdProducto(rs.getInt(1));
                ai.setMarca(rs.getString(2));
                ai.setGeneracion(rs.getString(3));
                ai.setModeloCaja(rs.getString(4));
                ai.setNumeroProcesador(rs.getString(5));
                ai.setZocaloCompatible(rs.getString(6));
                ai.setArquitectura(rs.getString(7));
                ai.setLitografiaProcesador(rs.getInt(8));
                ai.setNombre(rs.getString(9));
                ai.setPrecio(rs.getDouble(10));
                ai.setImagen(rs.getString(11));
                prosc.add(ai);
            }
        } catch (Exception e) {
        }
        return prosc;
    }
}
