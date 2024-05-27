package ual.hmis.sesion06;

public class Ejercicio3 {

    public String enmascararPassword(String password) {
        if (password.length() < 5) {
            return "password demasiado corto";
        } else if (password.length() <= 8) {
            return "********";
        } else if (password.length() <= 40) {
            return "************";
        } else {
            return "password demasiado largo";
        }
    }
}