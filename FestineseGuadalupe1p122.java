
package festineseguadalupepkg1ppkg122;

public class FestineseGuadalupe1p122 {


    public static void main(String[] args) {
        Acuario acuario = new Acuario();
        
        Pez nemo = new Pez("Nemo", "Tanque tropical", TipoAgua.DULCE, 20);
        //Pez nemo2 = new Pez("Nemo", "Tanque tropical", TipoAgua.SALADA, 30); --> LANZA EXCEPCION
        Pez dory = new Pez("Dory", "Tanque tropical", TipoAgua.DULCE, 30);
        Pez bagre = new Pez("Bagre", "Tanque caribe", TipoAgua.SALADA, 40);
        Pez globo = new Pez("Globo", "Tanque caribe", TipoAgua.SALADA, 50);
        
        Crustaceo donCangrejo = new Crustaceo("Don cangrejo", "Tanque Fondo de bikini", TipoAgua.DULCE, 6);
        Crustaceo otroCangrejo = new Crustaceo("Otro cangrejo", "Tanque Fondo de bikini", TipoAgua.DULCE, 8);
        Crustaceo otroCangrejoMas = new Crustaceo("Otro cangrejo mas", "Tanque Fondo de bikini", TipoAgua.SALADA, 10);
        
        MamiferoMarino delfin = new MamiferoMarino("Delfin", "Tanque Mamifero", TipoAgua.DULCE, 60);
        MamiferoMarino orca = new MamiferoMarino("Orca", "Tanque Mamifero", TipoAgua.SALADA, 80);
        MamiferoMarino ballena = new MamiferoMarino("Ballena", "Tanque Mamifero", TipoAgua.SALADA, 120);
        
        
        
        acuario.agregarAnimal(nemo);
        //acuario.agregarAnimal(nemo2);
        acuario.agregarAnimal(dory);
        acuario.agregarAnimal(bagre);
        acuario.agregarAnimal(globo);
        acuario.agregarAnimal(donCangrejo);
        acuario.agregarAnimal(otroCangrejo);
        acuario.agregarAnimal(otroCangrejoMas);
        acuario.agregarAnimal(delfin);
        acuario.agregarAnimal(orca);
        acuario.agregarAnimal(ballena);
        
        
       
        
        //System.out.println(acuario.filtrarPorTipoAgua(TipoAgua.DULCE));
        //System.out.println(acuario.filtrarPorTipoAgua(TipoAgua.SALADA));
        
        System.out.println(acuario.mostrarAnimales());
        
        //System.out.println(acuario.hacerNadar());
        
        //System.out.println(acuario.mostrarAnimalesPorTipo("Pez"));
        //System.out.println(acuario.mostrarAnimalesPorTipo("Crustaceo"));
        //System.out.println(acuario.mostrarAnimalesPorTipo("MamiferoMarino"));
        System.out.println(acuario.mostrarAnimalesPorTipo("asdds"));
      
        //System.out.println(acuario.hacerBuscarAlimento());
    }
    
}
