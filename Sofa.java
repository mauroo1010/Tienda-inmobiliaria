public class Sofa{
    private String marcaSofa;
    
    private String materialSofa;
    
    private Dependiente vendedorSofa;
    
    public Sofa(String marcaSofa, String materialSofa, Dependiente vendedorSofa){
        this.marcaSofa = marcaSofa;
        this.materialSofa = materialSofa;
        this.vendedorSofa = vendedorSofa;
    }
    
    public String getMarca() {
        return marcaSofa;
    }
    
    public String getMaterial() {
        return materialSofa;
    }
    
    public Dependiente getvendedor() {
        return vendedorSofa;
    }
    
    public void setMarca (String marcaSofa) {
         this.marcaSofa=marcaSofa;
    }
    
    public void setMaterial (String materialSofa) {
         this.materialSofa=materialSofa;
    }
    
    public void setVendedor (Dependiente vendedorSofa) {
         this.vendedorSofa=vendedorSofa;
    }
    
    public void imprimirDetalles() {
        System.out.println("Marca: "+ marcaSofa  + " Material: "+ materialSofa + " Vendedor: "+ vendedorSofa);
    }
    }

