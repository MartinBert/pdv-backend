package com.prysoft.pdv.helpers;

import com.prysoft.pdv.models.PaymentMethod;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;

@Service
public class MedioPagoHelper implements Serializable {
    public String stringPaymentMethodsNameConvertion(Iterable<PaymentMethod> medios) {
        ArrayList<String> mediosPagoStringArray = new ArrayList<>();
        Iterator<PaymentMethod> medio = medios.iterator();
        while (medio.hasNext()) {
            mediosPagoStringArray.add(medio.next().getNombre());
        }
        String mediosPagoString = mediosPagoStringArray.stream().reduce(" ", String::concat);
        return mediosPagoString;
    }
}
