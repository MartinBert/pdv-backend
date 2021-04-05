package com.prysoft.pdv.helpers;

import com.prysoft.pdv.models.MedioPago;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;

@Service
public class MedioPagoHelper implements Serializable {
    public String stringPaymentMethodsNameConvertion(Iterable<MedioPago> medios){
        ArrayList<String> mediosPagoStringArray = new ArrayList<>();
        Iterator<MedioPago> medio = medios.iterator();
        while(medio.hasNext()){
            mediosPagoStringArray.add(medio.next().getNombre());
        }
        String mediosPagoString = mediosPagoStringArray.stream().reduce(" ", String::concat);
        return mediosPagoString;
    }
}
