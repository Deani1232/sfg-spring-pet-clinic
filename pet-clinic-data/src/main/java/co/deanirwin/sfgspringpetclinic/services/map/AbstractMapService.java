package co.deanirwin.sfgspringpetclinic.services.map;

import co.deanirwin.sfgspringpetclinic.models.BaseEntity;

import java.util.*;

public class AbstractMapService<T extends BaseEntity, ID extends Long> {
    protected Map<ID, T> map = new HashMap<>();

    Set<T> findAll() {
        return new HashSet<>(map.values());
    }

    T findById(ID id) {
        return map.get(id);
    }

    T save(T object) {
        if (object != null){
            if(object.getId() == null) {
                object.setId(getNextId());
            }

            map.put((ID) object.getId(), object);

        } else {
            throw new RuntimeException("Object can not be null.");
        }
        return object;
    }

    boolean deleteById(ID id) {
        map.remove(id);
        return true;
    }

    boolean delete(T object) {
        map.entrySet().removeIf(entry -> entry.getValue().equals(object));
        return true;
    }

    private Long getNextId() {
        Long nextId = null;
        try {
            nextId = (Long) Collections.max(map.keySet()) + 1;
        } catch (NoSuchElementException e){
            nextId = 1L;
        }
        return nextId;
    }

}
