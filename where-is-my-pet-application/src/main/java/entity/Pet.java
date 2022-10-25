package entity;

import commons.jpa.AbstractEntityModel;
import jakarta.json.bind.annotation.JsonbDateFormat;
import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Objects;

@Entity
@Table(name = "pets")
public class Pet extends AbstractEntityModel {

    /*
        - many-to-one: MANY pets could be associated to ONE owner
        - Pet owns the relationship since they have FK of owner
     */

    @Column(name = "pet_name")
    private String petName;
    @Column(name = "pet_description")
    private String petDescription;
    @Column(name = "pet_picture")
    @Lob
    @Basic(fetch = FetchType.LAZY) // fetch this field only when make an explicit request
    private byte[] petPicture;
    @Column(name = "pet_lost_date")
    @NotNull(message = "The lost date must be set")
    @PastOrPresent(message = "The pet cannot be lost in a future date")
    @JsonbDateFormat(value = "yyyy-MM-dd")
    private LocalDate petLostDate;
    @ManyToOne
    @JoinColumn(name = "owner_id")  // This annotation lets the container know which column in the @JoinColumn table is the foreign key "owner_id" corresponding to the primary key on the owners table.
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

    public byte[] getPetPicture() {
        return petPicture;
    }

    public void setPetPicture(byte[] petPicture) {
        this.petPicture = petPicture;
    }

    public LocalDate getPetLostDate() {
        return petLostDate;
    }

    public void setPetLostDate(LocalDate petLostDate) {
        this.petLostDate = petLostDate;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pet pet = (Pet) o;
        return Objects.equals(petName, pet.petName) && Objects.equals(petDescription, pet.petDescription) && Arrays.equals(petPicture, pet.petPicture) && Objects.equals(petLostDate, pet.petLostDate) && Objects.equals(owner, pet.owner);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(petName, petDescription, petLostDate, owner);
        result = 31 * result + Arrays.hashCode(petPicture);
        return result;
    }

    @Override
    public String toString() {
        return String.format("Pet{petName='%s', petDescription='%s', petPicture=%s, petLostDate=%s, owner=%s}", petName, petDescription, Arrays.toString(petPicture), petLostDate, owner);
    }
}
