public class Miembro2 extends Miembros {
    
    public Miembro2(String nombre, Integer ingresos, Integer gastosPersonales, Integer aporteHogar){
        super(nombre, ingresos, gastosPersonales, aporteHogar);
    }

    @Override
    public void finanzasPersona(){
        Integer dineroLibre;

        dineroLibre = getIngresos() - (getGastosPersonales() + getAporteHogar());
        System.out.println("Al miembro 2 le quedan " + dineroLibre + " libres");

    }

}
