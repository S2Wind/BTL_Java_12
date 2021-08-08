/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import Helpers.DatabaseHelper;
import Helpers.MessaDialogHelper;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author phand
 */
public class NhanVienDAO {
    public static int CheckUser(String account,String password)
    {
        String sql = "select * "
                + "from NHANVIEN "
                + "where ACCOUNT = ? and pass = ? ";
        try (
            Connection con = DatabaseHelper.openConnection();
            PreparedStatement state = con.prepareStatement(sql);)
            {
            state.setString(1, account);
            state.setString(2, password);
            ResultSet results = state.executeQuery();
            while(results.next())
            {
                boolean quyen = results.getBoolean("QUYEN");
                if(quyen)
                {
                    MessaDialogHelper.showMessageDialog(null, "You use an ADMIN account", "Login Adminitrator");
                    return 2;
                }
                else
                {
                     MessaDialogHelper.showMessageDialog(null, "You use an USER account", "Login Adminitrator");
                    return 1;
                }
            }
            return 0;
            
        } catch (Exception e) {
            MessaDialogHelper.showErrorDialog(null, e.getMessage(),"Login Error");
        }
        return 0;
    }
}
