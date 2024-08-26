

public class Main {
    public static void main(String[] args) {


        functions func = new functions();
        variaveis vars = new variaveis();



        int hours = vars.hours;
        int min = vars.min;
        int sec = vars.sec;


        func.relogio(hours, min, sec);


    }
}