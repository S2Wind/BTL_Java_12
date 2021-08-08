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
public class KhachHang {
    String MaKH;
    String TenKH;
    String SoNha;
    String SDT;
    String MaSoCongTo;

    public KhachHang() {
    }

    public KhachHang(String MaKH, String TenKH, String SoNha, String SDT, String MaSoCongTo) {
        this.MaKH = MaKH;
        this.TenKH = TenKH;
        this.SoNha = SoNha;
        this.SDT = SDT;
        this.MaSoCongTo = MaSoCongTo;
    }
    
    public String getMaKH() {
        return MaKH;
    }

    public void setMaKH(String MaKH) {
        this.MaKH = MaKH;
    }

    public String getTenKH() {
        return TenKH;
    }

    public void setTenKH(String TenKH) {
        this.TenKH = TenKH;
    }

    public String getSoNha() {
        return SoNha;
    }

    public void setSoNha(String SoNha) {
        this.SoNha = SoNha;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public String getMaSoCongTo() {
        return MaSoCongTo;
    }

    public void setMaSoCongTo(String MaSoCongTo) {
        this.MaSoCongTo = MaSoCongTo;
    }
    
    
    
}
