/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import Helpers.DatabaseHelper;
import Helpers.MessaDialogHelper;
import Models.BienLai;
import Models.KhachHang;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.util.concurrent.ExecutionException;
import javax.security.auth.login.FailedLoginException;
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
}
