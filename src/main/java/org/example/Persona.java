package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa un contacto con nombre y una lista de teléfonos asociados
 */
class Persona {
    private String name;
    private List<String> phones;

    /**
     * Constructor
     * Inicializa un contacto con un nombre y un número de teléfono.
     * @param name
     * @param phone
     */
    public Persona(String name, String phone) {
        this.name = name;
        this.phones = new ArrayList<>();
        this.phones.add(phone);
    }

    /**
     * Obtiene el nombre del contacto
     * @return
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public List<String> getPhones() {
        return new ArrayList<>(phones); //devuelve una copia para no modificar la lista
    }
    public void setPhones(List<String> phones) {
        this.phones = new ArrayList<>(phones);
    }
}