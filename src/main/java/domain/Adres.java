package domain;

import javax.persistence.*;

@Entity
public class Adres {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "adres_id", nullable = false, precision = 0)
    private int adresId;
    @Basic
    @Column(name = "postcode", nullable = false, length = 10)
    private String postcode;
    @Basic
    @Column(name = "huisnummer", nullable = false, length = 10)
    private String huisnummer;
    @Basic
    @Column(name = "straat", nullable = false, length = 255)
    private String straat;
    @Basic
    @Column(name = "woonplaats", nullable = false, length = 255)
    private String woonplaats;
    @Basic
    @Column(name = "reiziger_id", nullable = false, precision = 0)
    private int reizigerId;

    public int getAdresId() {
        return adresId;
    }

    public void setAdresId(int adresId) {
        this.adresId = adresId;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getHuisnummer() {
        return huisnummer;
    }

    public void setHuisnummer(String huisnummer) {
        this.huisnummer = huisnummer;
    }

    public String getStraat() {
        return straat;
    }

    public void setStraat(String straat) {
        this.straat = straat;
    }

    public String getWoonplaats() {
        return woonplaats;
    }

    public void setWoonplaats(String woonplaats) {
        this.woonplaats = woonplaats;
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

        Adres adres = (Adres) o;

        if (adresId != adres.adresId) return false;
        if (reizigerId != adres.reizigerId) return false;
        if (postcode != null ? !postcode.equals(adres.postcode) : adres.postcode != null) return false;
        if (huisnummer != null ? !huisnummer.equals(adres.huisnummer) : adres.huisnummer != null) return false;
        if (straat != null ? !straat.equals(adres.straat) : adres.straat != null) return false;
        if (woonplaats != null ? !woonplaats.equals(adres.woonplaats) : adres.woonplaats != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = adresId;
        result = 31 * result + (postcode != null ? postcode.hashCode() : 0);
        result = 31 * result + (huisnummer != null ? huisnummer.hashCode() : 0);
        result = 31 * result + (straat != null ? straat.hashCode() : 0);
        result = 31 * result + (woonplaats != null ? woonplaats.hashCode() : 0);
        result = 31 * result + reizigerId;
        return result;
    }

    @Override
    public String   toString() {
        final StringBuilder sb = new StringBuilder("Adres{");
        sb.append("adresId=").append(adresId);
        sb.append(", postcode='").append(postcode).append('\'');
        sb.append(", huisnummer='").append(huisnummer).append('\'');
        sb.append(", straat='").append(straat).append('\'');
        sb.append(", woonplaats='").append(woonplaats).append('\'');
        sb.append(", reizigerId=").append(reizigerId);
        sb.append('}');
        return sb.toString();
    }
}
