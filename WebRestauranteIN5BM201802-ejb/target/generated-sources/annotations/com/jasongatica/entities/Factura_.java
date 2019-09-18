package com.jasongatica.entities;

import com.jasongatica.entities.Cliente;
import com.jasongatica.entities.Detallefactura;
import com.jasongatica.entities.Mesa;
import com.jasongatica.entities.Mesero;
import com.jasongatica.entities.Sucursal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.0.v20170811-rNA", date="2019-09-17T10:36:58")
@StaticMetamodel(Factura.class)
public class Factura_ { 

    public static volatile SingularAttribute<Factura, Mesa> idmesa;
    public static volatile SingularAttribute<Factura, Date> fecha;
    public static volatile ListAttribute<Factura, Detallefactura> detallefacturaList;
    public static volatile SingularAttribute<Factura, Sucursal> idsucursal;
    public static volatile SingularAttribute<Factura, Cliente> idcliente;
    public static volatile SingularAttribute<Factura, Mesero> idmesero;
    public static volatile SingularAttribute<Factura, Integer> idfactura;

}