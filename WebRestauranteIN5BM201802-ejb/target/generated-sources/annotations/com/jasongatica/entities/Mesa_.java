package com.jasongatica.entities;

import com.jasongatica.entities.Areas;
import com.jasongatica.entities.Factura;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.0.v20170811-rNA", date="2019-09-17T10:36:58")
@StaticMetamodel(Mesa.class)
public class Mesa_ { 

    public static volatile SingularAttribute<Mesa, Integer> idmesa;
    public static volatile SingularAttribute<Mesa, String> descripcion;
    public static volatile SingularAttribute<Mesa, Areas> idarea;
    public static volatile ListAttribute<Mesa, Factura> facturaList;

}