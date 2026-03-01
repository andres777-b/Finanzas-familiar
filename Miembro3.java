public class Miembro3 extends Miembros {

    public Miembro3(String nombre, Integer ingresos, Integer gastosPersonales, Integer aporteHogar){
        super(nombre, ingresos, gastosPersonales, aporteHogar);
    }

    @Override
    public void finanzasPersona(){
        Integer dineroLibre;

        dineroLibre = getIngresos() - (getGastosPersonales() + getAporteHogar());
        System.out.println(getNombre() + ":" + "\nIngresos: " + getIngresos() + "\nGastos personales: " + getGastosPersonales() + "\nAporte al hogar:" + getAporteHogar() + "\nle quedan " + dineroLibre + " libres");
        System.out.println("");


    }
    
}
