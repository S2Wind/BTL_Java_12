/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import DAO.BienLaiDAO;
import java.util.ArrayList;

/**
 *
 * @author phand
 */
public class ListBienLai {
    ArrayList<BienLai> listBienLai = new ArrayList<BienLai>();

    public ListBienLai() {
    }

    public void AddBienLai(BienLai bienlai)
    {
        try {
            listBienLai.add(bienlai);
        } catch (Exception e) {
           
        }
    }
     
    public ArrayList<BienLai> SearchByMaKH(String MaKH)
    {
        return BienLaiDAO.GetBienLaisByConditrionKH(MaKH);
    }
    public ArrayList<BienLai> SearchByMaHD(String HD)
    {
        return BienLaiDAO.GetBienLaisByConditrionHD(HD);
    }
    
    public void RemoveByIndex(int index)
    {
        try {
            if(listBienLai.get(index) != null)
            {
                listBienLai.remove(index);
            }
        } catch (Exception e) {
        }
    }
    
    public void SortByIdKH()
    {
        listBienLai.sort((o1, o2) -> 
        {
            return o1.getMaKH().compareTo(o2.getMaKH());
        });
    }
    public void SortByIdHD()
    {
        listBienLai.sort((o1, o2) -> 
        {
            return o1.getMaBL().compareTo(o2.getMaBL());
        });
    }
    public void SortByNgayLap()
    {
        listBienLai.sort((o1, o2) -> 
        {
            return o1.getNgayLap().compareTo(o2.getNgayLap());
        });
    }
    public void SortBySoCu()
    {
        listBienLai.sort((o1, o2) -> 
        {
            if(o1.getChiSoCu()> o2.getChiSoCu())
                return 1;
            else if(o1.getChiSoCu()> o2.getChiSoCu())
                return 0;
            else return -1;    
        });
    }
    public void SortBySoMoi()
    {
        listBienLai.sort((o1, o2) -> 
        {
            if(o1.getChiSoMoi()> o2.getChiSoMoi())
                return 1;
            else if(o1.getChiSoMoi()> o2.getChiSoMoi())
                return 0;
            else return -1;    
        });
    }
    public void SortBySoTien()
    {
        listBienLai.sort((o1, o2) -> 
        {
            if(o1.getThanhToan()> o2.getThanhToan())
                return 1;
            else if(o1.getThanhToan()> o2.getThanhToan())
                return 0;
            else return -1;    
        });
    }
    
    public void RemoveByIdHD(String maHD)
    {
        try {
            listBienLai.remove(maHD);
        } catch (Exception e) {
        }
    }
    
    public void RemoveByIdKH(String maKH)
    {
        try {
            listBienLai.remove(maKH);
        } catch (Exception e) {
        }
    }
    public boolean CheckContainByIdHD(String Id)
    {
        try {
            for (BienLai bienLai : listBienLai) {
                if(bienLai.getMaBL().equals(Id))
                {
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }
    public boolean CheckContainByIdKH(String Id)
    {
        try {
            for (BienLai bienLai : listBienLai) {
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
    
    public int getBienLaiByMaKH(String ma)
    {
        for (int i = 0 ; i < listBienLai.size();i++) {
            if(listBienLai.get(i).getMaKH().equals(ma))
                return i;
        }
        return -1;
    }
    public int getBienLaiByMaHD(String ma)
    {
        for (int i = 0 ; i < listBienLai.size();i++) {
            if(listBienLai.get(i).getMaBL().equals(ma))
                return i;
        }
        return -1;
    }
    
    public ArrayList<BienLai> getListBienLai() {
        return listBienLai;
    }

    public void setListBienLai(ArrayList<BienLai> listBienLai) {
        this.listBienLai = listBienLai;
    }

}
