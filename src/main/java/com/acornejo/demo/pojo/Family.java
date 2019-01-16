package com.acornejo.demo.pojo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Reference;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;


@Document(collection = "familias")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Family {

    //Atributes
    @JsonIgnore
    private String _id;
    @Id
    private int familyId;
    private String nombre;
    @Field("personas")
    @Reference
    private Person[] personas;

    //Constructors

//    /**
//     * Class constructor
//     */
//    public Family() {
//        super();
//        this.familyId = -1;
//        this.nombre = "default";
//        this.personas = new Person[0];
//    }
//
//    /**
//     * Class constructor specifying the family ObjectId,family id and Its name.
//     *
//     * @param _id      String document objectId.
//     * @param familyId Family object embedded on the document.
//     * @param nombre   String family name.
//     */
//    public Family(String _id, int familyId, String nombre) {
//        this();
//        this._id = _id;
//        this.familyId = familyId;
//        this.nombre = nombre;
//    }
//
//    //Getters & Setters
//
//    /**
//     * Gets the ObjectId atribute from the document.
//     *
//     * @return String of the document ObjectId.
//     */
//    public String get_id() {
//        return _id;
//    }
//
//    /**
//     * Sets the ObjectId atributte from the document.
//     *
//     * @param _id String the comment ObjectId
//     */
//    public void set_id(String _id) {
//        this._id = _id;
//    }
//
//    /**
//     * Gets the Family id of the document.
//     *
//     * @return int family id of the document.
//     */
//    public int getFamilyId() {
//        return familyId;
//    }
//
//    /**
//     * Sets the Family id of the document.
//     *
//     * @param familyId int family id of the document.
//     */
//    public void setFamilyId(int familyId) {
//        this.familyId = familyId;
//    }
//
//    /**
//     * Gets the name of the family document.
//     *
//     * @return String name of the family document.
//     */
//
//    public String getNombre() {
//        return nombre;
//    }
//
//    /**
//     * Sets the name of the family document.
//     *
//     * @param nombre String name of the family.
//     */
//
//    public void setNombre(String nombre) {
//        this.nombre = nombre;
//    }
//
//    /**
//     * Gets all the person wich are members of the family.
//     *
//     * @return a Person Array with all the family members.
//     */
//
//    public Person[] getPersonas() {
//        return personas;
//    }
//
//    /**
//     * Sets Person object wich are members of the family.
//     *
//     * @param personas Array of Person objects witch all the family members.
//     */
//    public void setPersonas(Person[] personas) {
//        this.personas = personas;
//    }
//
//    //Methods
//
//    /**
//     * Shows entire family object.
//     *
//     * @return String description of the Family object.
//     */
//    @Override
//    public String toString() {
//        return "Family{" +
//                "_id='" + _id + '\'' +
//                ", familyId=" + familyId +
//                ", nombre='" + nombre + '\'' +
//                ", personas=" + Arrays.toString(personas) +
//                '}';
//    }
}
