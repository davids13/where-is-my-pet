package entity;

import commons.jpa.AbstractEntityModel;
import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "pets")
//@NamedQuery()
public class Pet extends AbstractEntityModel {

    @Column(name = "PET_NAME")
    private String petName;
    @Column(name = "PET_DESCRIPTION")
    private String petDescription;
    @Column(name = "PET_PICTURE")
    @Lob
    @Basic(fetch = FetchType.LAZY)
    private byte[] petPicture;
    // the many has the foreign key
    @ManyToOne
    @JoinColumn(name = "owner_id")
    private Owner owner;

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public String getPetDescription() {
        return petDescription;
    }

    public void setPetDescription(String petDescription) {
        this.petDescription = petDescription;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }
}
