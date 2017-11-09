/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FORM;

import DAL.DBConnection;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Van Thuat
 */
public class MoHinh3Tang {
    public static void main(String[] args) {
        frmdangnhap frmdn = new frmdangnhap();
        frmdn.show();
    }
    public static int LuotDangNhap = 1;
    public static String hienThiTaiKhoan = "";
    public static DBConnection connection = new DBConnection();
    public static void thongBao(String noiDungThongBao,String tieuDeThongBao,int icon){
        JOptionPane.showMessageDialog(new JFrame(),noiDungThongBao,tieuDeThongBao,icon);
    }
}
