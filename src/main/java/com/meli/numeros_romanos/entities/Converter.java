package com.meli.numeros_romanos.entities;

public class Converter {

    int numeroDecimal;
    String numeroRomano;

    public Converter() {
    }

    public Converter(int numeroDecimal) {
        this.numeroDecimal = numeroDecimal;
        this.numeroRomano = this.convertToRoman();
    }

    public int getNumeroDecimal() {
        return numeroDecimal;
    }

    public void setNumeroDecimal(int numeroDecimal) {
        this.numeroDecimal = numeroDecimal;
    }

    public String getNumeroRomano() {
        return numeroRomano;
    }

    public void setNumeroRomano(String numeroRomano) {
        this.numeroRomano = numeroRomano;
    }

    public String convertToRoman() {
        int[] values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] romanLiterals = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

        StringBuilder roman = new StringBuilder();

        int num = this.numeroDecimal;

        for(int i=0;i<values.length;i++) {
            while(num >= values[i]) {
                num -= values[i];
                roman.append(romanLiterals[i]);
            }
        }
        return roman.toString();
    }
}
