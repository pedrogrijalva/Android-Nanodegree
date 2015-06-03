package ec.devworks.android.myappportfolio.ec.devworks.android.myappportfolio.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by pedro on 02/06/2015.
 */
public class CrazyColor {

    public static String color(){
        Random r = new Random();
        int indColor = r.nextInt(9);
        List<String> listaColores = new ArrayList<>();
        listaColores.add("#FF5722");
        listaColores.add("#FFC107");
        listaColores.add("#CDDC39");
        listaColores.add("#4CAF50");
        listaColores.add("#009688");
        listaColores.add("#03A9F4");
        listaColores.add("#673AB7");
        listaColores.add("#2196F3");
        listaColores.add("#9C27B0");
        String color = listaColores.get(indColor);
        return color;
    }

}
