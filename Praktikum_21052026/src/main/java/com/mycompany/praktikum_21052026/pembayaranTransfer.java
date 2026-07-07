/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktikum_21052026;

/**
 *
 * @author Nabil
 */
public class pembayaranTransfer extends pembayaran {
    private String namaBank;
    
    public pembayaranTransfer(String namaBank, double jumlahBayar){
        super(jumlahBayar, idTransaksi);
        this.namaBank = namaBank;
    }
    
    public String getNamaBank() {
        return namaBank;
    }
    
    public void setNamaBank(String namaBank) {
        this.namaBank = namabank;
    }
    
    @Override
    public void prosesPembayaran() {
        
    }
    
}
