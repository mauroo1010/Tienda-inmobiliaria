public class Sofa{
    private String marcaSofa;
    
    private String materialSofa;
    
    private String vendedorSofa;
    
    public Sofa(String marcaSofa, String materialSofa, String vendedorSofa){
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
    
    public String getvendedor() {
        return vendedorSofa;
    }
    
    public void setMarca(String marcaSofa) {
         this.marcaSofa=marcaSofa;
    }
    
    public void setMaterial(String materialSofa) {
         this.materialSofa=materialSofa;
    }
    
    public void setVendedor(String vendedorSofa) {
         this.vendedorSofa=vendedorSofa;
    }
    }

