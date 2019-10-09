package id.ac.polinema.idealbodyweight.util;

public class BMIIndex {

    private float cek;
    private float tinggi;
    private float berat;

    public BMIIndex(float tinggi, float berat){
        this.tinggi = tinggi;
        this.berat = berat;
        this.calculate();
    }

    private float calculate(){
        return this.cek = this.tinggi / (this.berat * this.berat);
    }

    public String BmiIdeal(){
        String s = "";
        if(this.cek < 18.50){
            s = "UnderWeight";
        }
        else if(this.cek >= 18.50 && this.cek <= 24.99){
            s = "Healty Weight";
        }
        else if(this.cek >= 25 && this.cek <= 29.99){
            s = "Pre-obese";
        }
        else if(this.cek >= 30 && this.cek <=34.99){
            s = "Obese Class 1";
        }
        else if(this.cek >= 40 && this.cek <= 49.99){
            s = "Obese Class 2";
        }
        else if(this.cek >= 50){
            s = "Obese Class 3";
        }
        return s;
    }
}
