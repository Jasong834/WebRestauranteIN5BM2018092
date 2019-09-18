package com.jasongatica.entities;

import com.jasongatica.entities.Detallefactura;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.0.v20170811-rNA", date="2019-09-17T10:36:58")
@StaticMetamodel(Cocinero.class)
public class Cocinero_ { 

    public static volatile ListAttribute<Cocinero, Detallefactura> detallefacturaList;
    public static volatile SingularAttribute<Cocinero, String> apellido;
    public static volatile SingularAttribute<Cocinero, Integer> idcocinero;
    public static volatile SingularAttribute<Cocinero, String> nombre;
    public static volatile SingularAttribute<Cocinero, String> especialidad;

}