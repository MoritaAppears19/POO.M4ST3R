public class Personas {
    String nombre;
    int edad;
    double estatura;
    double peso;
    String genero;

    //--------------------------//

    double cal_imc(){
        return peso/(estatura*estatura);
    }

    String obtener_datos(){
        String cad="";
        cad=cad+"Persona {nombre:"+nombre+"; ";
        cad=cad+"Edad:"+edad+"; ";
        cad=cad+"Estatura:"+estatura+"; ";
        cad=cad+"Peso:"+peso+"; ";
        cad=cad+"Género:"+genero+"; ";
        return cad;
    }


}
