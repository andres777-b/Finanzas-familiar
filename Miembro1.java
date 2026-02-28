public class Miembro1 extends Miembros {

    public Miembro1(String nombre, Integer ingresos, Integer gastosPersonales, Integer aporteHogar){
        super(nombre, ingresos, gastosPersonales, aporteHogar);
    }

    @Override
    public void finanzasPersona(){
        Integer dineroLibre;

        dineroLibre = getIngresos() - (getGastosPersonales() + getAporteHogar());
        System.out.println("Al miembro 1 le quedan " + dineroLibre + " libres");

    }
    
}

