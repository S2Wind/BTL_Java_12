/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.util.ArrayList;
import DAO.KhachHangDAO;

/**
 *
 * @author phand
 */
public class ListKhachHang {
    ArrayList<KhachHang> listKhachHang = new ArrayList<KhachHang>();
    public void AddKhachHang(KhachHang bienlai)
    {
        try {
            listKhachHang.add(bienlai);
        } catch (Exception e) {
           
        }
    }
     
    public ArrayList<KhachHang> SearchByMaKH(String MaKH)
    {
        return KhachHangDAO.GetKhachHangsByConditrion(MaKH);
    }
    public int CheckMaCongTo(String MaKH)
    {
        for (KhachHang bienLai : listKhachHang) {
                if(bienLai.getMaSoCongTo().equals(MaKH))
                {
                    return -1;
                }
            }
        return 0;
    }
    public ArrayList<KhachHang> SearchByMaKHList(String ma)
    {
        ArrayList<KhachHang> kh = new ArrayList<>();
        for (int i = 0 ; i< listKhachHang.size();i++) {
                if(listKhachHang.get(i).getMaKH().equals(ma))
                {
                    kh.add(listKhachHang.get(i));
                }
            }
        return kh;
    }
    public ArrayList<KhachHang> SearchBySDTList(String ma)
    {
        ArrayList<KhachHang> kh = new ArrayList<>();
        for (int i = 0 ; i< listKhachHang.size();i++) {
                if(listKhachHang.get(i).getSDT().equals(ma))
                {
                    kh.add(listKhachHang.get(i));
                }
            }
        return kh;
    }
    public ArrayList<KhachHang> SearchByMaCongToList(String ma)
    {
        ArrayList<KhachHang> kh = new ArrayList<>();
        for (int i = 0 ; i< listKhachHang.size();i++) {
                if(listKhachHang.get(i).getMaSoCongTo().equals(ma))
                {
                    kh.add(listKhachHang.get(i));
                }
            }
        return kh;
    }
    public void RemoveByIndex(int index)
    {
        try {
            if(listKhachHang.get(index) != null)
            {
                listKhachHang.remove(index);
            }
        } catch (Exception e) {
        }
    }
    
    public boolean CheckContainByIdKH(String Id)
    {
        try {
            for (KhachHang bienLai : listKhachHang) {
                if(bienLai.getMaKH().equals(Id))
                {
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }
    
    public int getKhachHangByMaKH(String ma)
    {
        for (int i = 0 ; i < listKhachHang.size();i++) {
            if(listKhachHang.get(i).getMaKH().equals(ma))
                return i;
        }
        return -1;
    }
    public ArrayList<KhachHang> getListKhachHang() {
        return listKhachHang;
    }

    public void setListKhachHang(ArrayList<KhachHang> listKhachHang) {
        this.listKhachHang = listKhachHang;
    }
}
