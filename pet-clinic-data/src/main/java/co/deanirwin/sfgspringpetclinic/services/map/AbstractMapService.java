package co.deanirwin.sfgspringpetclinic.services.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class AbstractMapService<T, ID> {
    protected Map<ID, T> map = new HashMap<>();

    Set<T> findAll() {
        return new HashSet<>(map.values());
    }

    T findById(ID id) {
        return map.get(id);
    }

    T save(ID id, T object) {
        map.put(id, object);
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

}
