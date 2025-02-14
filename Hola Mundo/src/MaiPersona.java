public class MaiPersona {
    public static void main(String[] args) {
        Personas p1=new Personas(); //INSTANCIAMIENTO

        //CONFIGURAR EL OBJETO DANDO VALORES A SUS ATRIBUTOS

        p1.nombre="Leonardo";
        p1.genero="Masculino";
        p1.estatura=1.72;
        p1.peso=57;
        p1.edad=18;

        //USANDO UNO DE LOS MÉTODOS DE LA CLASE
        System.out.println(p1.obtener_datos());

        Personas p2=new Personas();
        p2.nombre="Emiliano";
        p2.genero="Masculino";
        p2.estatura=1.61;
        p2.peso=42;
        p2.edad=18;

        String res=p2.obtener_datos();
        System.out.println(res);

        System.out.println(p1.cal_imc());
        System.out.println(p2.cal_imc());

    }
}

