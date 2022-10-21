package domain;

import javax.persistence.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Date;

@Entity
@Table(name = "ov_chipkaart", schema = "public", catalog = "ov-chipkaart")
public class OvChipkaart {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "kaart_nummer", nullable = false, precision = 0)
    private int kaartNummer;
    @Basic
    @Column(name = "geldig_tot", nullable = false)
    private Date geldigTot;
    @Basic
    @Column(name = "klasse", nullable = false, precision = 0)
    private BigInteger klasse;
    @Basic
    @Column(name = "saldo", nullable = false, precision = 2)
    private BigDecimal saldo;
    @Basic
    @Column(name = "reiziger_id", nullable = false, precision = 0)
    private int reizigerId;

    public int getKaartNummer() {
        return kaartNummer;
    }

    public void setKaartNummer(int kaartNummer) {
        this.kaartNummer = kaartNummer;
    }

    public Date getGeldigTot() {
        return geldigTot;
    }

    public void setGeldigTot(Date geldigTot) {
        this.geldigTot = geldigTot;
    }

    public BigInteger getKlasse() {
        return klasse;
    }

    public void setKlasse(BigInteger klasse) {
        this.klasse = klasse;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    public int getReizigerId() {
        return reizigerId;
    }

    public void setReizigerId(int reizigerId) {
        this.reizigerId = reizigerId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OvChipkaart that = (OvChipkaart) o;

        if (kaartNummer != that.kaartNummer) return false;
        if (reizigerId != that.reizigerId) return false;
        if (geldigTot != null ? !geldigTot.equals(that.geldigTot) : that.geldigTot != null) return false;
        if (klasse != null ? !klasse.equals(that.klasse) : that.klasse != null) return false;
        if (saldo != null ? !saldo.equals(that.saldo) : that.saldo != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = kaartNummer;
        result = 31 * result + (geldigTot != null ? geldigTot.hashCode() : 0);
        result = 31 * result + (klasse != null ? klasse.hashCode() : 0);
        result = 31 * result + (saldo != null ? saldo.hashCode() : 0);
        result = 31 * result + reizigerId;
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("OvChipkaart{");
        sb.append("kaartNummer=").append(kaartNummer);
        sb.append(", geldigTot=").append(geldigTot);
        sb.append(", klasse=").append(klasse);
        sb.append(", saldo=").append(saldo);
        sb.append(", reizigerId=").append(reizigerId);
        sb.append('}');
        return sb.toString();
    }
}
