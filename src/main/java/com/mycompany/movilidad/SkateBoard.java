/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.movilidad;

/**
 *
 * @author HTTP
 */
public class SkateBoard implements Vehicle{
    private int boardLength;
    private String sticker;

    public SkateBoard(int boardLength, String sticker) {
        this.boardLength = boardLength;
        this.sticker = sticker;
    }
    
    @Override
    public void imprimir() {
        System.out.println("tipo de vehiculo: SkateBoard");
    }

    public int getBoardLength() {
        return boardLength;
    }

    public void setBoardLength(int boardLength) {
        this.boardLength = boardLength;
    }

    public String getSticker() {
        return sticker;
    }

    public void setSticker(String sticker) {
        this.sticker = sticker;
    }
    
    
}
