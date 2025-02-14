public class calificaciones {
    int cal_cd;
    int cal_fp;
    int cal_te;
    int cal_md;
    int cal_ta;
    int cal_fi;
    int cal_tu;

    int promedio(){
        return (cal_cd+cal_fp+cal_te+cal_md+cal_ta+cal_fi+cal_tu)/7;
    }
    String obt_dat(){
        String cadena="";
        cadena=cadena+"Calificación Cálculo Diferencial:"+cal_cd+"; ";
        cadena=cadena+"Calificación Fundamentos de Programación:"+cal_fp+"; ";
        cadena=cadena+"Calificación Taller de Ética:"+cal_te+"; ";
        cadena=cadena+"Calificación Matemáticas Discretas:"+cal_md+"; ";
        cadena=cadena+"Calificación Taller de Administración:"+cal_ta+"; ";
        cadena=cadena+"Calificación de Fundamentos de Investigación:"+cal_fi+"; ";
        cadena=cadena+"Calificación Tutorías:"+cal_tu+"; ";
        return cadena;
    }
}
