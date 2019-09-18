package com.jasongatica.entities;

import com.jasongatica.entities.Factura;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.0.v20170811-rNA", date="2019-09-17T10:36:58")
@StaticMetamodel(Mesero.class)
public class Mesero_ { 

    public static volatile SingularAttribute<Mesero, String> apellido;
    public static volatile ListAttribute<Mesero, Factura> facturaList;
    public static volatile SingularAttribute<Mesero, Integer> idmesero;
    public static volatile SingularAttribute<Mesero, String> nombre;

}