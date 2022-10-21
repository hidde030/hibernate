package domain;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

public class OvChipkaartProductPK implements Serializable {
    @Column(name = "kaart_nummer", nullable = false, precision = 0)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int kaartNummer;
    @Column(name = "product_nummer", nullable = false, precision = 0)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int productNummer;

    public int getKaartNummer() {
        return kaartNummer;
    }

    public void setKaartNummer(int kaartNummer) {
        this.kaartNummer = kaartNummer;
    }

    public int getProductNummer() {
        return productNummer;
    }

    public void setProductNummer(int productNummer) {
        this.productNummer = productNummer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OvChipkaartProductPK that = (OvChipkaartProductPK) o;

        if (kaartNummer != that.kaartNummer) return false;
        if (productNummer != that.productNummer) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = kaartNummer;
        result = 31 * result + productNummer;
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("OvChipkaartProductPK{");
        sb.append("kaartNummer=").append(kaartNummer);
        sb.append(", productNummer=").append(productNummer);
        sb.append('}');
        return sb.toString();
    }
}
