package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * representa un contacto con nombre y una lista de teléfonos asociados
 */
class Contacto {
    private String name;
    private List<String> phones;

    /**
     * constructor
     * inicializa un contacto con un nombre y un número de teléfono.
     * @param name
     * @param phone
     */
    public Contacto(String name, String phone) {
        this.name = name;
        this.phones = new ArrayList<>();
        this.phones.add(phone);
    }

    /**
     * obtiene el nombre del contacto
     * @return
     */
    public String getName() {
        return this.name;
    }

    /**
     * obtiene la lista de teléfonos asociados al contacto
     * @return
     */
    public List<String> getPhones() {
        return this.phones;
    }
}