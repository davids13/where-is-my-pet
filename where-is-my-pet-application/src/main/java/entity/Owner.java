package entity;

import commons.jpa.AbstractEntityModel;
import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "owners")
@NamedQuery(name = Owner.OWNER_FIND_ALL, query = Owner.OWNER_FIND_ALL_QUERY)
public class Owner extends AbstractEntityModel {

    /* one-to-many relationship: OWNER can have multiple PETS but every PET should belong to one owner */

    public static final String OWNER_FIND_ALL = "Owner.findAll";
    public static final String OWNER_FIND_ALL_QUERY = "SELECT o FROM Owner o";

    @Column(name = "owner_name")
    private String name;
    @Column(name = "owner_email")
    private String email;
    @Column(name = "owner_contact")
    private String number;
    @Transient // When we mark a field with this annotation, the JPA won't persist the field and it won't retrieve its value from the database.
    @Column(name = "owner_gender")
    @Enumerated(EnumType.STRING)
    private GenderType gender;
    @OneToMany(mappedBy = "owner", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    // mappedBy to enable bidirectional
    private Set<Pet> pets = new HashSet<>();

    public void addPet(final Pet pet) {
        pets.add(pet);
        pet.setOwner(this);
    }

    public void removePet(final Pet pet) {
        pets.remove(pet);
        pet.setOwner(null);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public GenderType getGender() {
        return gender;
    }

    public void setGender(GenderType gender) {
        this.gender = gender;
    }

    public Set<Pet> getPets() {
        return pets;
    }

    public void setPets(Set<Pet> pets) {
        this.pets = pets;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Owner owner = (Owner) o;
        return Objects.equals(name, owner.name) && Objects.equals(email, owner.email) && Objects.equals(number, owner.number) && gender == owner.gender && Objects.equals(pets, owner.pets);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, email, number, gender, pets);
    }

    @Override
    public String toString() {
        return String.format("Owner{name='%s', email='%s', number='%s', gender=%s, pets=%s}", name, email, number, gender, pets);
    }
}
