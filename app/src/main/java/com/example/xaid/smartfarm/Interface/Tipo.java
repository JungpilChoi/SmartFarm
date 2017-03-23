package com.example.xaid.smartfarm.Interface;

import android.support.annotation.IntDef;
import android.support.annotation.StringDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
/**
 * Created by herib on 23/03/2017.
 */
public class Tipo {

    @StringDef({PRESSAO_STRING, UMIDADE_DO_SOLO_STRING, FLUXO_DA_AGUA_STRING, VOLUME_RESERVATORIO_STRING})
    @Retention(RetentionPolicy.SOURCE)
    public @interface TipoStringDef { }

    public static final String PRESSAO_STRING = "Pressão da Água";
    public static final String UMIDADE_DO_SOLO_STRING = "Umidade do Solo";
    public static final String FLUXO_DA_AGUA_STRING = "Fluxo da Água";
    public static final String VOLUME_RESERVATORIO_STRING = "Volume do Reservatório";

    @IntDef({PRESSAO, UMIDADE_DO_SOLO, FLUXO_DA_AGUA, VOLUME_RESERVATORIO})
    @Retention(RetentionPolicy.SOURCE)
    public @interface TipoIntDef { }

    public static final int PRESSAO = 0;
    public static final int UMIDADE_DO_SOLO = 1;
    public static final int FLUXO_DA_AGUA = 2;
    public static final int VOLUME_RESERVATORIO = 3;
}
