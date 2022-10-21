package domain;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
public class Product {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "product_nummer", nullable = false, precision = 0)
    private int productNummer;
    @Basic
    @Column(name = "naam", nullable = false, length = 30)
    private String naam;
    @Basic
    @Column(name = "beschrijving", nullable = false, length = 512)
    private String beschrijving;
    @Basic
    @Column(name = "prijs", nullable = false, precision = 2)
    private BigDecimal prijs;

    public int getProductNummer() {
        return productNummer;
    }

    public void setProductNummer(int productNummer) {
        this.productNummer = productNummer;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getBeschrijving() {
        return beschrijving;
    }

    public void setBeschrijving(String beschrijving) {
        this.beschrijving = beschrijving;
    }

    public BigDecimal getPrijs() {
        return prijs;
    }

    public void setPrijs(BigDecimal prijs) {
        this.prijs = prijs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        if (productNummer != product.productNummer) return false;
        if (naam != null ? !naam.equals(product.naam) : product.naam != null) return false;
        if (beschrijving != null ? !beschrijving.equals(product.beschrijving) : product.beschrijving != null)
            return false;
        if (prijs != null ? !prijs.equals(product.prijs) : product.prijs != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = productNummer;
        result = 31 * result + (naam != null ? naam.hashCode() : 0);
        result = 31 * result + (beschrijving != null ? beschrijving.hashCode() : 0);
        result = 31 * result + (prijs != null ? prijs.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Product{");
        sb.append("productNummer=").append(productNummer);
        sb.append(", naam='").append(naam).append('\'');
        sb.append(", beschrijving='").append(beschrijving).append('\'');
        sb.append(", prijs=").append(prijs);
        sb.append('}');
        return sb.toString();
    }
}
