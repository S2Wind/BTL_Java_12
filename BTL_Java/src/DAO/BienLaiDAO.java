/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Helpers.DatabaseHelper;
import Helpers.MessaDialogHelper;
import Models.BienLai;
import Models.ListBienLai;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.security.auth.login.FailedLoginException;

/**
 *
 * @author phand
 */
public class BienLaiDAO {
    public static BienLai Search(String sdt)
    {
        String sql = "select * "
                + "from BIENLAI inner join KHACHHANG on BIENLAI.MAKH = KHACHHANG.MAKH "
                + "where sdt = ? ";
        try(
            Connection con = DatabaseHelper.openConnection();
            PreparedStatement state = con.prepareStatement(sql);
                )
            {
            state.setString(1, sdt);
            ResultSet results = state.executeQuery();
            BienLai bl = new BienLai();
            while(results.next()){
                bl.setMaBL(results.getString("MABIENLAI"));
                bl.setMaKH(results.getString("MAKH"));
                bl.setNgayLap(LocalDate.parse(results.getString("NGAYLAP")));
                bl.setChiSoCu(results.getInt("CHISOCU"));
                bl.setChiSoMoi(results.getInt("CHISOMOI"));
                bl.getThanhToan();
                return bl;
            }
            throw new IOException("khong ton tai");
        } catch (Exception e) {
            MessaDialogHelper.showErrorDialog(null, e.getMessage(),"Search");
        }
        return null;
    }
    
    public static void UpdateByMaHD(BienLai bienLai)
    {
        String sql = " Update BIENLAI "
                + " Set NGAYLAP = ?, CHISOCU = ?, CHISOMOI = ? "
                + " where MABIENLAI = ?";
        try(
            Connection con = DatabaseHelper.openConnection();
            PreparedStatement state = con.prepareStatement(sql);
                )
            {
                state.setString(1, String.valueOf(bienLai.getNgayLap()));
                state.setString(2, String.valueOf(bienLai.getChiSoCu()));
                state.setString(3, String.valueOf(bienLai.getChiSoMoi()));
                state.setString(4, String.valueOf(bienLai.getMaBL()));
                state.executeUpdate();
                
        } catch (Exception e) {
            MessaDialogHelper.showErrorDialog(null, e.getMessage(),"UpdateByMaHD");
        }
    }
    public static void UpdateByMaKH(BienLai bienLai)
    {
        String sql = " Update BIENLAI "
                + " Set NGAYLAP = ?, CHISOCU = ?, CHISOMOI = ? "
                + " where MAKH = ?";
        try(
            Connection con = DatabaseHelper.openConnection();
            PreparedStatement state = con.prepareStatement(sql);
                )
            {
                state.setDate(1, Date.valueOf(bienLai.getNgayLap()));
                state.setInt(2, bienLai.getChiSoCu());
                state.setInt(3, bienLai.getChiSoMoi());
                state.setString(4, String.valueOf(bienLai.getMaKH()));
                state.executeUpdate();
                
        } catch (Exception e) {
            MessaDialogHelper.showErrorDialog(null, e.getMessage(),"UpdateByMaKH");
        }
    }
    public static ArrayList<BienLai> GetBienLais()
    {
        String sql = "select * from BIENLAI";
        try(
            Connection con = DatabaseHelper.openConnection();
            PreparedStatement state = con.prepareStatement(sql);
                )
            {
            ResultSet results = state.executeQuery();
            ArrayList<BienLai> list = new ArrayList<>();
            while(results.next()){
                BienLai bl = new BienLai();
                bl.setMaBL(results.getString("MABIENLAI"));
                bl.setMaKH(results.getString("MAKH"));
                bl.setNgayLap(LocalDate.parse(results.getString("NGAYLAP")));
                bl.setChiSoCu(results.getInt("CHISOCU"));
                bl.setChiSoMoi(results.getInt("CHISOMOI"));
                bl.getThanhToan();
                list.add(bl);
            }
            return list;
        } catch (Exception e) {
            MessaDialogHelper.showErrorDialog(null, e.getMessage(),"GetBienLais");
        }
        return null;
    }
    
    public static ArrayList<BienLai> GetBienLaisByConditrionKH(String ma)
    {
        String sql = "select * "
                + "from BIENLAI "
                + "where MAKH = ?" ;
        try(
            Connection con = DatabaseHelper.openConnection();
            PreparedStatement state = con.prepareStatement(sql);
                )
            {
            state.setString(1, ma);
            ResultSet results = state.executeQuery();
            ArrayList<BienLai> list = new ArrayList<>();
            while(results.next()){
                BienLai bl = new BienLai();
                bl.setMaBL(results.getString("MABIENLAI"));
                bl.setMaKH(results.getString("MAKH"));
                bl.setNgayLap(LocalDate.parse(results.getString("NGAYLAP")));
                bl.setChiSoCu(results.getInt("CHISOCU"));
                bl.setChiSoMoi(results.getInt("CHISOMoi"));
                bl.getThanhToan();
                list.add(bl);
            }
            return list;
        } catch (Exception e) {
            MessaDialogHelper.showErrorDialog(null, e.getMessage(),"GetBienLaisByConditrion");
        }
        return null;
    }
    public static ArrayList<BienLai> GetBienLaisByConditrionHD(String ma)
    {
        String sql = "select * "
                + "from BIENLAI "
                + "where MABIENLAI = ?" ;
        try(
            Connection con = DatabaseHelper.openConnection();
            PreparedStatement state = con.prepareStatement(sql);
                )
            {
            state.setString(1, ma);
            ResultSet results = state.executeQuery();
            ArrayList<BienLai> list = new ArrayList<>();
            while(results.next()){
                BienLai bl = new BienLai();
                bl.setMaBL(results.getString("MABIENLAI"));
                bl.setMaKH(results.getString("MAKH"));
                bl.setNgayLap(LocalDate.parse(results.getString("NGAYLAP")));
                bl.setChiSoCu(results.getInt("CHISOCU"));
                bl.setChiSoMoi(results.getInt("CHISOMoi"));
                bl.getThanhToan();
                list.add(bl);
            }
            return list;
        } catch (Exception e) {
            MessaDialogHelper.showErrorDialog(null, e.getMessage(),"GetBienLaisByConditrion");
        }
        return null;
    }
    public static void DeleteByHD(String ma)
    {
        String sql = "Delete "
                + "from BIENLAI "
                + "where MABIENLAI = ?" ;
        try(
            Connection con = DatabaseHelper.openConnection();
            PreparedStatement state = con.prepareStatement(sql);
                )
            {
            state.setString(1, ma);
            state.execute();
        } catch (Exception e) {
            MessaDialogHelper.showErrorDialog(null, e.getMessage(),"DeleteByHD");
        }
    }
    public static void DeleteByKH(String ma)
    {
        String sql = "Delete "
                + "from BIENLAI "
                + "where MAKH = ?" ;
        try(
            Connection con = DatabaseHelper.openConnection();
            PreparedStatement state = con.prepareStatement(sql);
                )
            {
            state.setString(1, ma);
            state.execute();
        } catch (Exception e) {
            MessaDialogHelper.showErrorDialog(null, e.getMessage(),"DeleteByKH");
        }
    }
}
