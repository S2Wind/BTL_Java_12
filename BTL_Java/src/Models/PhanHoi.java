/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.time.LocalDate;

/**
 *
 * @author phand
 */
public class PhanHoi {
    String MaPH;
    String MaKH;
    LocalDate NgayPH;
    String MoTa;

    public PhanHoi() {
    }

    public PhanHoi(String MaPH, String MaKH, LocalDate NgayPH, String MoTa) {
        this.MaPH = MaPH;
        this.MaKH = MaKH;
        this.NgayPH = NgayPH;
        this.MoTa = MoTa;
    }

    public String getMaPH() {
        return MaPH;
    }

    public void setMaPH(String MaPH) {
        this.MaPH = MaPH;
    }

    public String getMaKH() {
        return MaKH;
    }

    public void setMaKH(String MaKH) {
        this.MaKH = MaKH;
    }

    public LocalDate getNgayPH() {
        return NgayPH;
    }

    public void setNgayPH(LocalDate NgayPH) {
        this.NgayPH = NgayPH;
    }

    public String getMoTa() {
        return MoTa;
    }

    public void setMoTa(String MoTa) {
        this.MoTa = MoTa;
    }
 
    
    
}
