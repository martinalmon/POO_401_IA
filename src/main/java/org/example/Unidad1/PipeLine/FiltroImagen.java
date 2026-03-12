package org.example.Unidad1.PipeLine;

import java.util.ArrayList;
import java.util.List;

public class FiltroImagen {
    public void procesar(){
        System.out.println("procesando imagen");
    }

    public class Main {
        public static void main(String[] args)
        // Lista polimórfica que acepta cualquier tipo de filtro
        List<FiltroImagen> pipeline=new ArrayList<>();
        pipeline.add(new ReductorDeRuido());
        pipeline.add(new DetectorDeBordes());

        for(FiltroImagen f:pipeline){
            f.procesar(imagenOriginal);
        }


    }
}
