package day7.task1;

public class Task1 {
    public static void main(String[] args) {
        Airplane airplane1 = new Airplane("AE",1992,1000,90000);
        airplane1.fillUp(5);
        airplane1.info();
        Airplane airplane2 = new Airplane("kk",2099,30,770);
        airplane2.fillUp(5);
        airplane2.info();
        Airplane.compareAirplanes(airplane1,airplane2);
    }
}