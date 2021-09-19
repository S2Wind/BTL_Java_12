/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import Helpers.DatabaseHelper;
import Helpers.MessaDialogHelper;
import Models.KhachHang;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.util.ArrayList;
/**
 *
 * @author phand
 */
public class KhachHangDAO {
     public static KhachHang Search(String maKH)
    {
        String sql = "select * "
                + "from KHACHHANG "
                + "where MAKH = ? ";
        try(
            Connection con = DatabaseHelper.openConnection();
            PreparedStatement state = con.prepareStatement(sql);
                )
            {
            state.setString(1, maKH);
            ResultSet results = state.executeQuery();
            
            while(results.next()){
                KhachHang kh = new KhachHang();
                kh.setMaKH(results.getString("MAKH"));
                kh.setTenKH(results.getString("TENKH"));
                kh.setSoNha(results.getString("SONHA"));
                kh.setSDT(results.getString("SDT"));
                kh.setMaSoCongTo(results.getString("MASOCONGTO"));
                return kh;
            }
            throw new IOException("khong ton tai");
        } catch (Exception e) {
            MessaDialogHelper.showErrorDialog(null, e.getMessage(),"Login Error");
        }
        return null;
    }
    
    public static void Update(KhachHang khachHang)
    {
        String sql = " Update KHACHHANG "
                + " Set TenKH = ?, SoNha = ?, SDT = ?, MaSoCongTo = ? "
                + " where MaKH = ?";
        try(
            Connection con = DatabaseHelper.openConnection();
            PreparedStatement state = con.prepareStatement(sql);
                )
            {
                state.setString(1, String.valueOf(khachHang.getTenKH()));
                state.setString(2, String.valueOf(khachHang.getSoNha()));
                state.setString(3, String.valueOf(khachHang.getSDT()));
                state.setString(4, String.valueOf(khachHang.getMaSoCongTo()));
                state.setString(5, String.valueOf(khachHang.getMaKH()));
                state.executeUpdate();
                
        } catch (Exception e) {
            MessaDialogHelper.showErrorDialog(null, e.getMessage(),"Update");
        }
    }
    public static ArrayList<KhachHang> GetKhachHangs()
    {
        String sql = "select * from KHACHHANG";
        try(
            Connection con = DatabaseHelper.openConnection();
            PreparedStatement state = con.prepareStatement(sql);
                )
            {
            ResultSet results = state.executeQuery();
            ArrayList<KhachHang> list = new ArrayList<>();
            while(results.next()){
                KhachHang kh = new KhachHang();
                kh.setMaKH(results.getString("MAKH"));
                kh.setTenKH(results.getString("TenKH"));
                kh.setSDT(results.getString("sdt"));
                kh.setSoNha(results.getString("sonha"));
                kh.setMaSoCongTo(results.getString("masocongto"));
                list.add(kh);
            }
            return list;
        } catch (Exception e) {
            MessaDialogHelper.showErrorDialog(null, e.getMessage(),"GetKhachHangs");
        }
        return null;
    }
    
    public static ArrayList<KhachHang> GetKhachHangsByConditrion(String ma)
    {
        String sql = "select * "
                + "from KHACHHANG "
                + "where MAKH = ?" ;
        try(
            Connection con = DatabaseHelper.openConnection();
            PreparedStatement state = con.prepareStatement(sql);
                )
            {
            state.setString(1, ma);
            ResultSet results = state.executeQuery();
            ArrayList<KhachHang> list = new ArrayList<>();
            while(results.next()){
                KhachHang kh = new KhachHang();
                kh.setMaKH(results.getString("MAKH"));
                kh.setTenKH(results.getString("TenKH"));
                kh.setSDT(results.getString("sdt"));
                kh.setSoNha(results.getString("sonha"));
                kh.setMaSoCongTo(results.getString("masocongto"));
                list.add(kh);
            }
            return list;
        } catch (Exception e) {
            MessaDialogHelper.showErrorDialog(null, e.getMessage(),"GetKhachHangsByConditrion");
        }
        return null;
    }
   
    public static void Delete(String ma)
    {
        String sql = "Delete "
                + "from KHACHHANG "
                + "where MaKH = ?" ;
        try(
            Connection con = DatabaseHelper.openConnection();
            PreparedStatement state = con.prepareStatement(sql);
                )
            {
            state.setString(1, ma);
            state.execute();
        } catch (Exception e) {
            MessaDialogHelper.showErrorDialog(null, e.getMessage(),"Delete");
        }
    }
    
    public static void Insert(KhachHang khachhang)
    {
        String sql = "Insert into KHACHHANG (makh,tenkh,sonha,sdt,masocongto) "
                + " values(?,?,?,?,?); ";
        try(
            Connection con = DatabaseHelper.openConnection();
            PreparedStatement state = con.prepareStatement(sql);
                )
            {
            state.setString(1, khachhang.getMaKH());
            state.setString(2, khachhang.getTenKH());
            state.setString(3, khachhang.getSoNha());
            state.setString(4, khachhang.getSDT());
            state.setString(5, khachhang.getMaSoCongTo());
            state.execute();
        } catch (Exception e) {
            MessaDialogHelper.showErrorDialog(null, e.getMessage(),"Insert");
        }
    }
}
