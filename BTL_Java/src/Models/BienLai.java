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
    String MaBL;
    String MaKH;
    LocalDate NgayLap;
    double ChiSoCu;
    double ChiSoMoi;
    double ThanhToan;

    public BienLai() {
    }

    public BienLai(String MaBL, String MaKH, LocalDate NgayLap,  double ChiSoCu, double ChiSoMoi, double ThanhToan) {
        this.MaBL = MaBL;
        this.MaKH = MaKH;
        this.NgayLap = NgayLap;
        this.ChiSoCu = ChiSoCu;
        this.ChiSoMoi = ChiSoMoi;
        this.ThanhToan = ThanhToan;
    }

    public KhachHang getKhachHang()
    {
        return KhachHangDAO.Search(MaKH);
    }
        
    public String getMaBL() {
        return MaBL;
    }

    public void setMaBL(String MaBL) {
        this.MaBL = MaBL;
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


    public double getChiSoCu() {
        return ChiSoCu;
    }

    public void setChiSoCu(double ChiSoCu) {
        this.ChiSoCu = ChiSoCu;
    }

    public double getChiSoMoi() {
        return ChiSoMoi;
    }

    public void setChiSoMoi(double ChiSoMoi) {
        this.ChiSoMoi = ChiSoMoi;
    }

    public double getThanhToan() {
        return ThanhToan;
    }

    public void setThanhToan(double ThanhToan) {
        this.ThanhToan = ThanhToan;
    }
    
    
}
