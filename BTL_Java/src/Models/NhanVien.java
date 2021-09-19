/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author phand
 */
public class NhanVien {
    String ID;
    String HoTen;
    String SDT;
    String KhuVuc;
    String Account;
    String Password;
    String Quyen;

    public NhanVien() {
    }

    public NhanVien(String ID, String HoTen, String SDT, String KhuVuc, String Account, String Password, String Quyen) {
        this.ID = ID;
        this.HoTen = HoTen;
        this.SDT = SDT;
        this.KhuVuc = KhuVuc;
        this.Account = Account;
        this.Password = Password;
        this.Quyen = Quyen;
    }

    
    
    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public String getKhuVuc() {
        return KhuVuc;
    }

    public void setKhuVuc(String KhuVuc) {
        this.KhuVuc = KhuVuc;
    }

    public String getAccount() {
        return Account;
    }

    public void setAccount(String Account) {
        this.Account = Account;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getQuyen() {
        return Quyen;
    }

    public void setQuyen(String Quyen) {
        this.Quyen = Quyen;
    }
    
    
}
