public class Main {

    public static void main(String[] args) {
        Miembros miembro1 = new Miembro1("Andres", 2158000, 300000, 400000);
        miembro1.finanzasPersona();

        Miembros miembro2 = new Miembro2("Daniel", 1840000, 400000, 400000);
        miembro2.finanzasPersona();

        Miembros miembro3 = new Miembro3("Camilo", 1840000, 470000, 400000);
        miembro3.finanzasPersona();


        System.out.println("");
        Integer gastosTotales = miembro1.getAporteHogar() + miembro1.getGastosPersonales() + miembro2.getAporteHogar() + miembro2.getGastosPersonales() + miembro3.getAporteHogar() + miembro3.getGastosPersonales();

        Integer total = miembro1.getIngresos() + miembro2.getIngresos() + miembro3.getIngresos();

        System.out.println("Entre las 3 personas, les queda un total de " + (total - gastosTotales) + " Mensual Para ahorro, inversion, o libre gasto de la familia");

    }



    
}