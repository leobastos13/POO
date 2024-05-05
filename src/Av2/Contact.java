package Av2;

import java.time.LocalDate;

public class Contact {
    static int idStatic = 0;
    private int id;
    private String name;
    private int phoneNumber;
    private String email;
    private LocalDate birthDate;

    public Contact(String name, int phoneNumber, String email, LocalDate birthDate) {
        this.id = idStatic;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.birthDate = birthDate;
    }

    public Contact(String name2, String phoneNumber2, String email2, String birthDate2) {
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + phoneNumber;
        result = prime * result + ((email == null) ? 0 : email.hashCode());
        result = prime * result + ((birthDate == null) ? 0 : birthDate.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Contact other = (Contact) obj;
        if (id != other.id)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (phoneNumber != other.phoneNumber)
            return false;
        if (email == null) {
            if (other.email != null)
                return false;
        } else if (!email.equals(other.email))
            return false;
        if (birthDate == null) {
            if (other.birthDate != null)
                return false;
        } else if (!birthDate.equals(other.birthDate))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return String.format("Identificador: %2d; Nome: %s; Telemóvel: %2d; Email: %s; Data de Nascimento: %s\n", this.id, this.name, this.phoneNumber, this.email, this.birthDate);
    }
  
}
