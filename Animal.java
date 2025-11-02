package festineseguadalupepkg1ppkg122;

public abstract class Animal {

    private String nombre;
    private String habitat;
    private TipoAgua tipoAgua;

    public Animal(String nombre, String habitat, TipoAgua tipoAgua) {
        this.nombre = nombre;
        this.habitat = habitat;
        setTipoAgua(tipoAgua);
    }

    private void setTipoAgua(TipoAgua tipoAgua) {
        this.tipoAgua = tipoAgua;
    }

    public String getNombreAnimal() {
        return nombre;
    }

    public String getHabitatAnimal() {
        return habitat;
    }
    
    public TipoAgua getTipoAgua(){
        return tipoAgua;
    }

    @Override
    public boolean equals(Object o) {
        boolean esIgual = false;
        if (o instanceof Animal a) {
            if (a.getNombreAnimal().equals(nombre) && a.getHabitatAnimal().equals(habitat)) {
                esIgual = true;
            }
        }
        return esIgual;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Animal: " + nombre);
        sb.append(", su habitat es: "+ habitat);
        sb.append(", y vive en agua " + tipoAgua);
        
        return sb.toString();
    }
    
    

}
