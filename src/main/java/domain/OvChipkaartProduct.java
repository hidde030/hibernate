package domain;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "ov_chipkaart_product", schema = "public", catalog = "ov-chipkaart")
@IdClass(OvChipkaartProductPK.class)
public class OvChipkaartProduct {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "kaart_nummer", nullable = false, precision = 0)
    private int kaartNummer;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "product_nummer", nullable = false, precision = 0)
    private int productNummer;
    @Basic
    @Column(name = "status", nullable = true, length = 10)
    private String status;
    @Basic
    @Column(name = "last_update", nullable = true)
    private Date lastUpdate;

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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OvChipkaartProduct that = (OvChipkaartProduct) o;

        if (kaartNummer != that.kaartNummer) return false;
        if (productNummer != that.productNummer) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (lastUpdate != null ? !lastUpdate.equals(that.lastUpdate) : that.lastUpdate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = kaartNummer;
        result = 31 * result + productNummer;
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (lastUpdate != null ? lastUpdate.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("OvChipkaartProduct{");
        sb.append("kaartNummer=").append(kaartNummer);
        sb.append(", productNummer=").append(productNummer);
        sb.append(", status='").append(status).append('\'');
        sb.append(", lastUpdate=").append(lastUpdate);
        sb.append('}');
        return sb.toString();
    }
}
