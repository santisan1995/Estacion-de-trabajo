package clases;

import clases.Album;
import clases.ListaReproduccion;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-11-30T09:25:45")
@StaticMetamodel(Tema.class)
public class Tema_ { 

    public static volatile SingularAttribute<Tema, Integer> idTema;
    public static volatile SingularAttribute<Tema, Album> album;
    public static volatile SingularAttribute<Tema, String> duracion;
    public static volatile ListAttribute<Tema, ListaReproduccion> listas;
    public static volatile SingularAttribute<Tema, String> nombre;
    public static volatile SingularAttribute<Tema, Integer> numeroCancion;

}