package org.eduardorivera.tipcalc;

import android.app.Application;

/**
 * Created by eduardo rivera 12/06/2016.
 */
public class TipCalcApp extends Application {
    private final static String ABOUT_URL = "http://www.prensalibre.com/guatemala/escuintla/rebajan-tarifas-de-peaje-para-transito-pesado-en-autopista-palin-%E2%80%93-escuintla";

    public static String getAboutUrl() {
        return ABOUT_URL;
    }
}