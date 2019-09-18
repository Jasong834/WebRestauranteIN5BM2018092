package com.jasongatica.entities;

import com.jasongatica.entities.Factura;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.0.v20170811-rNA", date="2019-09-17T10:36:58")
@StaticMetamodel(Sucursal.class)
public class Sucursal_ { 

    public static volatile ListAttribute<Sucursal, Factura> facturaList;
    public static volatile SingularAttribute<Sucursal, String> departamento;
    public static volatile SingularAttribute<Sucursal, Integer> idsucursal;
    public static volatile SingularAttribute<Sucursal, String> nombre;

}