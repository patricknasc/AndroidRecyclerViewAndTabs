package com.patricknasc.androidrecyclerviewandtabs.domain;

import java.io.Serializable;

/**
 * Created by patricknasc on 20/10/16.
 */

public class Carro implements Serializable {

    public long id;
    public String tipo;
    public String nome;
    public String desc;
    public String urlFoto;
    public String urlInfo;
    public String urlVideo;
    public String latitude;
    public String longitude;


    @Override
    public String toString() {
        return "Carro{" +
                "desc='" + desc + '\'' +
                ", id=" + id +
                ", tipo='" + tipo + '\'' +
                ", nome='" + nome + '\'' +
                ", urlFoto='" + urlFoto + '\'' +
                ", urlInfo='" + urlInfo + '\'' +
                ", urlVideo='" + urlVideo + '\'' +
                ", latitude='" + latitude + '\'' +
                ", longitude='" + longitude + '\'' +
                '}';
    }
}
