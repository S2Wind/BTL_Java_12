/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import DAO.KhachHangDAO;
import java.time.LocalDate;

/**
 *
 * @author phand
 */
public class BienLai {
    String MaHD;
    String MaKH;
    LocalDate NgayLap;
    int ChiSoCu;
    int ChiSoMoi;
    int TongTien;

    public BienLai() {
    }

    public BienLai(String MaBL, String MaKH, LocalDate NgayLap,  int ChiSoCu, int ChiSoMoi, int ThanhToan) {
        this.MaHD = MaBL;
        this.MaKH = MaKH;
        this.NgayLap = NgayLap;
        this.ChiSoCu = ChiSoCu;
        this.ChiSoMoi = ChiSoMoi;
        this.TongTien = ThanhToan;
    }

    public KhachHang getKhachHang()
    {
        return KhachHangDAO.Search(MaKH);
    }
        
    public String getMaBL() {
        return MaHD;
    }

    public void setMaBL(String MaBL) {
        this.MaHD = MaBL;
    }

    public String getMaKH() {
        return MaKH;
    }

    public void setMaKH(String MaKH) {
        this.MaKH = MaKH;
    }

    public LocalDate getNgayLap() {
        return NgayLap;
    }

    public void setNgayLap(LocalDate NgayLap) {
        this.NgayLap = NgayLap;
    }


    public int getChiSoCu() {
        return ChiSoCu;
    }

    public void setChiSoCu(int ChiSoCu) {
        this.ChiSoCu = ChiSoCu;
    }

    public int getChiSoMoi() {
        return ChiSoMoi;
    }

    public void setChiSoMoi(int ChiSoMoi) {
        this.ChiSoMoi = ChiSoMoi;
    }

    public int getThanhToan() {
        TongTien = (ChiSoMoi - ChiSoCu)*668;
        return TongTien;
    }

    
    
}
