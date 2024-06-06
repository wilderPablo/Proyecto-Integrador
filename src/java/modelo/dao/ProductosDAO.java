
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

import modelo.dto.TecladoDTO;

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
    
    public List<AuricularesDTO> listarAuriculares() {
    List<AuricularesDTO> aur = new ArrayList<>();
    String SQL = "SELECT * FROM auriculares"; 

    try {
        conexion = cdb.obtenerConexion();
        ps = conexion.prepareStatement(SQL);
        rs = ps.executeQuery();
        while (rs.next()) {
            AuricularesDTO ai = new AuricularesDTO();
            ai.setIdProducto(rs.getInt(1));
            ai.setMarca(rs.getString(2));
            ai.setModelo(rs.getString(3));
            ai.setNumeroParte(rs.getString(4));
            ai.setColor(rs.getString(5));
            ai.setIluminacion(rs.getString(6));
            ai.setPatronPolarDelMicrofono(rs.getString(7));
            ai.setCalidadDeAudio(rs.getFloat(8));
            ai.setNombre(rs.getString(9));
            ai.setPrecio(rs.getDouble(10));
            ai.setImagen(rs.getString(11));
            aur.add(ai);
        }
    } catch (Exception e) {
    } 
    return aur;
}
    
    public List<MouseDTO> listarMouses() {
    List<MouseDTO> mou = new ArrayList<>();
    String SQL = "SELECT * FROM mouse"; // Ajusta el nombre de la tabla según sea necesario

    try {
        conexion = cdb.obtenerConexion();
        ps = conexion.prepareStatement(SQL);
        rs = ps.executeQuery();
        while (rs.next()) {
            MouseDTO mos = new MouseDTO();
            mos.setIdProducto(rs.getInt(1));
            mos.setNombre(rs.getString(2));
            mos.setMarca(rs.getString(3));
            mos.setModelo(rs.getString(4));
            mos.setNumeroParte(rs.getString(5));
            mos.setIluminacion(rs.getString(6));
            mos.setColor(rs.getString(9));
            mos.setNumeroDeBotones(rs.getInt(8));
            mos.setSensorYTipo(rs.getString(9));
            mos.setPrecio(rs.getDouble(10));
            mos.setImagen(rs.getString(11));
            mou.add(mos);
        }
    } catch (SQLException e) {
        e.printStackTrace(); // Añade manejo de excepciones adecuado
    }
    return mou;
    }
    
    public List<TecladoDTO> listarTeclados() {
    List<TecladoDTO> tcld = new ArrayList<>();
    String SQL = "SELECT * FROM teclado"; // Ajusta el nombre de la tabla según sea necesario

    try {
        conexion = cdb.obtenerConexion();
        ps = conexion.prepareStatement(SQL);
        rs = ps.executeQuery();
        while (rs.next()) {
            TecladoDTO tcl = new TecladoDTO();
            tcl.setIdProducto(rs.getInt(1));
            tcl.setMarca(rs.getString(2));
            tcl.setModelo(rs.getString(3));
            tcl.setTipoDeTeclado(rs.getString(4));
            tcl.setFactorDeForma(rs.getString(5));
            tcl.setSwitchType(rs.getString(6));
            tcl.setCantidadDeTeclas(rs.getInt(7));
            tcl.setNombre(rs.getString(8));
            tcl.setPrecio(rs.getDouble(9));
            tcl.setImagen(rs.getString(10));
            tcld.add(tcl);
        }
    } catch (SQLException e) {
        e.printStackTrace(); // Añade manejo de excepciones adecuado
    } 
    return tcld;
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
      public List listarMonitores() {
        List<MonitorDTO> mnt = new ArrayList<>();
        String SQL = "SELECT * FROM monitores";
        try {
            conexion = cdb.obtenerConexion();
            ps = conexion.prepareStatement(SQL);
            rs = ps.executeQuery();
            while (rs.next()) {
                MonitorDTO ai = new  MonitorDTO();
                ai.setIdProducto(rs.getInt(1)) ;
                ai.setMarca(rs.getString(2));
                ai.setModelo(rs.getString(3));
                ai.setTamaño(rs.getInt(4));
                ai.setTasaderefresco(rs.getInt(5));
                ai.setTipodepanel(rs.getString(6));
                ai.setGamadecolores(rs.getString(7));
                ai.setProfundidaddecolor(rs.getString(8));
                ai.setNombre(rs.getString(9));
                ai.setPrecio(rs.getDouble(10));
                ai.setImagen(rs.getString(11));
                mnt.add(ai);
            }
        } catch (Exception e) {
        }
        return mnt;
    }
    
    
}
