package com.jasongatica.entities;

import com.jasongatica.entities.Cocinero;
import com.jasongatica.entities.Factura;
import com.jasongatica.entities.Plato;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.0.v20170811-rNA", date="2019-09-17T10:36:58")
@StaticMetamodel(Detallefactura.class)
public class Detallefactura_ { 

    public static volatile SingularAttribute<Detallefactura, Double> precio;
    public static volatile SingularAttribute<Detallefactura, Double> total;
    public static volatile SingularAttribute<Detallefactura, Plato> idplato;
    public static volatile SingularAttribute<Detallefactura, Integer> cantidad;
    public static volatile SingularAttribute<Detallefactura, Cocinero> idcocinero;
    public static volatile SingularAttribute<Detallefactura, Integer> iddetallefactura;
    public static volatile SingularAttribute<Detallefactura, Factura> idfactura;

}