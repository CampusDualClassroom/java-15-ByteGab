package com.campusdual.classroom;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FreshMerchandise extends Merchandise {

protected  Date fecha;
    public FreshMerchandise(String name, String uniqueId, String responsibleId) {
        super(name, uniqueId, responsibleId);
    }

    public FreshMerchandise(String name, String uniqueId, String responsibleId, int zone, String area, String shelf, int quantity, Date fecha) {
        super(name, uniqueId, responsibleId, zone, area, shelf, quantity);
        this.fecha = fecha;
    }


    @Override
    public Object getSpecificData() {
        StringBuilder elementos = new StringBuilder();
        elementos.append("Localizacion ").append(getLocation()).append("\n");
        SimpleDateFormat hora = new SimpleDateFormat("dd-MM-yyyy");
        elementos.append("Caducidad ").append(hora.format(getExpirationDate())).append("\n");

        return elementos;
    }
    public  Date getExpirationDate ()
    {
        return  fecha;
    }

    public void printSpecificData()
    {
        System.out.println(getSpecificData());
    }

    public String getFormattedDate(Date date) {
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        return formatter.format(date);
    }
}
