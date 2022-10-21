package domain;

import javax.persistence.*;
import java.sql.Date;

@Entity
public class Reiziger {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "reiziger_id", nullable = false, precision = 0)
    private int reizigerId;
    @Basic
    @Column(name = "voorletters", nullable = false, length = 10)
    private String voorletters;
    @Basic
    @Column(name = "tussenvoegsel", nullable = true, length = 10)
    private String tussenvoegsel;
    @Basic
    @Column(name = "achternaam", nullable = false, length = 255)
    private String achternaam;
    @Basic
    @Column(name = "geboortedatum", nullable = true)
    private Date geboortedatum;

    public int getReizigerId() {
        return reizigerId;
    }

    public void setReizigerId(int reizigerId) {
        this.reizigerId = reizigerId;
    }

    public String getVoorletters() {
        return voorletters;
    }

    public void setVoorletters(String voorletters) {
        this.voorletters = voorletters;
    }

    public String getTussenvoegsel() {
        return tussenvoegsel;
    }

    public void setTussenvoegsel(String tussenvoegsel) {
        this.tussenvoegsel = tussenvoegsel;
    }

    public String getAchternaam() {
        return achternaam;
    }

    public void setAchternaam(String achternaam) {
        this.achternaam = achternaam;
    }

    public Date getGeboortedatum() {
        return geboortedatum;
    }

    public void setGeboortedatum(Date geboortedatum) {
        this.geboortedatum = geboortedatum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Reiziger reiziger = (Reiziger) o;

        if (reizigerId != reiziger.reizigerId) return false;
        if (voorletters != null ? !voorletters.equals(reiziger.voorletters) : reiziger.voorletters != null)
            return false;
        if (tussenvoegsel != null ? !tussenvoegsel.equals(reiziger.tussenvoegsel) : reiziger.tussenvoegsel != null)
            return false;
        if (achternaam != null ? !achternaam.equals(reiziger.achternaam) : reiziger.achternaam != null) return false;
        if (geboortedatum != null ? !geboortedatum.equals(reiziger.geboortedatum) : reiziger.geboortedatum != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = reizigerId;
        result = 31 * result + (voorletters != null ? voorletters.hashCode() : 0);
        result = 31 * result + (tussenvoegsel != null ? tussenvoegsel.hashCode() : 0);
        result = 31 * result + (achternaam != null ? achternaam.hashCode() : 0);
        result = 31 * result + (geboortedatum != null ? geboortedatum.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Reiziger{");
        sb.append("reizigerId=").append(reizigerId);
        sb.append(", voorletters='").append(voorletters).append('\'');
        sb.append(", tussenvoegsel='").append(tussenvoegsel).append('\'');
        sb.append(", achternaam='").append(achternaam).append('\'');
        sb.append(", geboortedatum=").append(geboortedatum);
        sb.append('}');
        return sb.toString();
    }
}
