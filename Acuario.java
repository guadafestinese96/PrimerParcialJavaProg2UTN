package festineseguadalupepkg1ppkg122;

import java.util.ArrayList;
import java.util.List;

public class Acuario {

    private List<Animal> animales;

    public Acuario() {
        animales = new ArrayList<>();
    }

    public void agregarAnimal(Animal animal) {
        validarNull(animal);
        validarAnimalesIguales(animal);
        animales.add(animal);
    }

    private void validarNull(Animal a) {
        if (a == null) {
            throw new AnimalNuloException();
        }
    }

    private void validarAnimalesIguales(Animal a) {
        for (Animal ani : animales) {
            if (ani.equals(a)) {
                throw new MismoAnimalException();
            }
        }
    }

    private void validarListaVacia() {
        if (animales.size() < 1) {
            throw new NoHayAnimalesException();
        }
    }

    public String hacerNadar() {
        StringBuilder sb = new StringBuilder();
        for (Animal a : animales) {
            if (a instanceof PuedeNadar n) {
                sb.append(n.nadar());
                sb.append(System.lineSeparator());
            } else {
                sb.append("No puedo nadar");
                sb.append(System.lineSeparator());
            }
        }

        return sb.toString();
    }
    
    public String hacerBuscarAlimento() {
        StringBuilder sb = new StringBuilder();
        for (Animal a : animales) {
            if (a instanceof PuedeBuscarAlimento n){
                sb.append(n.buscarAlimento());
                sb.append(System.lineSeparator());
            } else {
                sb.append("No puedo buscar alimento");
                sb.append(System.lineSeparator());
            }
        }

        return sb.toString();
    }

    public String filtrarPorTipoAgua(TipoAgua tipoAgua) {
        StringBuilder sb = new StringBuilder();
        sb.append("AGUA " + tipoAgua);
        sb.append(System.lineSeparator());
        validarListaVacia();
        for (Animal a : animales) {
            if (a.getTipoAgua().equals(tipoAgua)) {
                sb.append(a.toString());
                sb.append(System.lineSeparator());
            }
        }

        return sb.toString();
    }

    public String mostrarAnimales() {
        StringBuilder sb = new StringBuilder();
        sb.append("ANIMALES DEL ACUARIO");
        validarListaVacia();
        sb.append(System.lineSeparator());
        for (Animal a : animales) {
            sb.append(a.toString());
            sb.append(System.lineSeparator());
        }
        return sb.toString();
    }
    
    private String getNombreTipo(Animal a){
        StringBuilder sb = new StringBuilder();
        if(a instanceof Crustaceo){
            sb.append("Crustaceo");
        }
        if(a instanceof Pez){
            sb.append("Pez");
        }
        if(a instanceof MamiferoMarino){
            sb.append("MamiferoMarino");
        }
        return sb.toString();
    }

    public String mostrarAnimalesPorTipo(String tipoAnimal) {
        StringBuilder sb = new StringBuilder();
        sb.append("Animales del tipo " + tipoAnimal);
        sb.append(System.lineSeparator());
        int contador = 0;
        for (Animal a : animales) {
            if (getNombreTipo(a).toUpperCase().equals(tipoAnimal.toUpperCase())) {
                sb.append(a.toString());
                sb.append(System.lineSeparator());
                contador ++;
            }
        }
        if(contador == 0){
            sb.append("No se encontraron animales del tipo "+tipoAnimal);
        }
        return sb.toString();
    }
}
