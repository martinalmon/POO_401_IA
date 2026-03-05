package org.example.Unidad1.detaset;

public class Dataset {
    public  void  cargarDatos (){
        System.out.println("cargando datos");
    }

    public class DatasetImagen extends Dataset{

        @Override
        public void  cargarDatos(){
            System.out.println("cargando datos imagen");
        }
    }
    public  class  DatasetTexto extends Dataset{
        @Override
        public void cargarDatos(){
            System.out.println("cargando datos testo");

        }
    }

}
