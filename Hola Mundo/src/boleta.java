public class boleta {
    public static void main(String[] args) {
        calificaciones c1=new calificaciones();
        nombres n1=new nombres();
        numero_control nc1= new numero_control();

        //Instanciamiento

        n1.nombre="Emiliano Céspedes Herrera";
        nc1.num_control=24020346;
        c1.cal_cd=80;
        c1.cal_fp=100;
        c1.cal_te=100;
        c1.cal_md=75;
        c1.cal_ta=88;
        c1.cal_fi=98;
        c1.cal_tu=100;

        System.out.println(c1.obt_dat());
        System.out.println(c1.promedio());
    }
}
