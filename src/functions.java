import java.util.Date;


public class functions {


        int relogio(int hours, int min, int sec){





            if (hours <= 4 || hours >= 18) {
                System.out.println("Boa noite, são " + hours+":"+min+":"+sec);


            }
            else if (hours >= 5 && hours <= 12) {

                System.out.println("Bom dia, são " + hours+":"+min+":"+sec );

            }
            else {
                System.out.println("Boa tarde, são " + hours+":"+min+":"+sec);

            }
            return 0;
        }
    }


