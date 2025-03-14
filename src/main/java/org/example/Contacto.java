package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa un contacto con nombre y una lista de teléfonos asociados
 */
class Contacto {
    private String name;
    private List<String> phones;

    /**
     * Constructor
     * Inicializa un contacto con un nombre y un número de teléfono.
     * @param name
     * @param phone
     */
    public Contacto(String name, String phone) {
        this.name = name;
        this.phones = new ArrayList<>();
        this.phones.add(phone);
    }

    /**
     * Obtiene el nombre del contacto
     * @return
     */
    public String getName() {
        return this.name;
    }

    /**
     * Obtiene la lista de teléfonos asociados al contacto
     * @return
     */
    public List<String> getPhones() {
        return this.phones;
    }
}